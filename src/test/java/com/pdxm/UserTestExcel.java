package com.pdxm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserTestExcel {

	public List<String[]> parseExcel(InputStream inputStream, String suffix, int startrow) throws IOException {

		Workbook workbook = null;
		List<String[]> strings = new ArrayList<String[]>();
		if ("xls".equals(suffix)) {
			workbook = new HSSFWorkbook(inputStream);
		} else if ("xlsx".equals(suffix)) {
			workbook = new XSSFWorkbook(inputStream);
		} else {
			return null;
		}

		// 获取工作表
		Sheet sheet = workbook.getSheetAt(0);
		if (sheet == null)
			return null;

		int lastRowNum = sheet.getLastRowNum();
		if (lastRowNum <= startrow) {
			return null;
		}

		Row row = null;// 行
		Cell cell = null;// 列
		for (int rowNum = startrow; rowNum <= lastRowNum; rowNum++) {
			row = sheet.getRow(rowNum);
			short firstCellNum = row.getFirstCellNum();
			short lastCellNum = row.getLastCellNum();
			if (lastCellNum != 0) {
				String[] str = new String[lastCellNum];
				for (int i = firstCellNum; i < lastCellNum; i++) {
					cell = row.getCell(i);
					if (cell == null) {
						str[i] = null;
					} else {
						str[i] = cell.toString();
					}

				}
				strings.add(str);

			}

		}

		return strings;
	}

	
}
