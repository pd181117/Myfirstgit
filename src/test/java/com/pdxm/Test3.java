package com.pdxm;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test3 {

	public List<String[]>  readExcel(String fileName) throws Exception {

		InputStream is = new FileInputStream(new File(fileName));
		Workbook hssfWorkbook = null;
		if (fileName.endsWith("xlsx")) {
			hssfWorkbook = new XSSFWorkbook(is);// Excel 2007
		} else if (fileName.endsWith("xls")) {
			hssfWorkbook = new HSSFWorkbook(is);// Excel 2003

		}
		
		List<String[]> list = new ArrayList<String[]>();
	
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			Sheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			// 循环行Row
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				Row row = hssfSheet.getRow(rowNum);
				short firstCellNum = row.getFirstCellNum();
				short lastCellNum = row.getLastCellNum();
				if (row != null) {
					String[] str = new String[lastCellNum];
					for (int i = firstCellNum; i < lastCellNum; i++) {
						Cell cell = row.getCell(i);
						if (cell == null) {
							str[i] = null;
						} else {
							cell.setCellType(CellType.STRING);
							str[i] = cell.getStringCellValue().toString();
						}

					}
					list.add(str);
				}
		 	  }
			
		}
		return list;
	}

}
