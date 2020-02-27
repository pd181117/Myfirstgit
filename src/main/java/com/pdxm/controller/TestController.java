package com.pdxm.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {

	
	@RequestMapping("/outPutExcel")
	public void outPutExcel(HttpServletResponse response) throws Exception {
//		// 每次写100行数据，就刷新数据出缓存
//		SXSSFWorkbook wb = new SXSSFWorkbook(100); // keep 100 rows in memory,
//		Sheet sh = (Sheet) wb.createSheet();
//        // 这个是业务数据
//		List<TbClass> tmps = classService.getAllClass();
//		String[] titles = { "编号", "标题" };
//		Row row = sh.createRow(0);
//		// 第一行设置标题
//		for (int i = 0; i < titles.length; i++) {
//			String title = titles[i];
//			Cell cell1 = row.createCell(i);
//			cell1.setCellValue(title);
//		}
// 
//		// 导出数据
//		for (int rowNum = 0; rowNum < tmps.size(); rowNum++) {
// 
//			Row rowData = sh.createRow(rowNum + 1);
//            // TbClass 这个是我的业务类，这个是根据业务来进行填写数据
//			TbClass tmp = tmps.get(rowNum);
//            // 第一列
//			Cell cellDataA = rowData.createCell(0);
//			cellDataA.setCellValue(tmp.getcId());
//            // 第二列
//			Cell cellDataB = rowData.createCell(1);
//			cellDataB.setCellValue(tmp.getcName());
//		}
// 
//		String fileName = "文件名称.xlsx";
//		response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
//		wb.write(response.getOutputStream());
//		wb.close();
	}

}
