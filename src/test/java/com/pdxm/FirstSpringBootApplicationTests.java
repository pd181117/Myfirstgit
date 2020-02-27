package com.pdxm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.pdxm.entity.Person;
import com.pdxm.entity.User;
import com.pdxm.entity.UserTest;
import com.pdxm.mapper.UserMapper;

@SpringBootTest
class FirstSpringBootApplicationTests {

	// @Autowired
	// @Qualifier("user1") // 当spring容器中有多个相同类型得bean,采用@Qualifier注解中得值
	private UserTest user;

	// @Autowired
	// private Person person;

	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() throws Exception {
//		//创建工作簿
//		HSSFWorkbook workbook=new HSSFWorkbook();
//		//在工作簿创建sheet
//		HSSFSheet sheet=workbook.createSheet("补考名单");
//		//创行
//		HSSFRow row=sheet.createRow(0);
//		//在行加单元格
//		//HSSFCell cell=row.createCell(0);
//		//cell.setCellValue("专业");
//		HSSFCellStyle cellStyle=workbook.createCellStyle();
//		cellStyle.setAlignment(HorizontalAlignment.CENTER);
//		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
//		HSSFFont font=workbook.createFont();
//		font.setBold(true);
//		font.setFontHeightInPoints((short)10);
//		cellStyle.setFont(font);
//		String[] titles= {"专业","年级","班级","学号","姓名"};
//		for (int i = 0; i < titles.length; i++) {
//			String title = titles[i];
//			Cell cell1 = row.createCell(i);
//			cell1.setCellValue(title);
//			cell1.setCellStyle(cellStyle);
//		}
//
//		
//		//导出，保存
//		workbook.write(new File("d:\\test.xls"));
//		
//		
		
		
//		UserTestExcel excel=new UserTestExcel();
//		List<String[]> list=excel.parseExcel(new FileInputStream("d://test.xls"), "xls", 1);
	
		Test3 test3=new Test3();
		List<String[]> list=test3.readExcel("d://test.xls");
		for (String[] strings : list) {
           for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]);
		}
           System.out.println();
		}
		
		/*
		 * List<User> users=userMapper.queryUserAll(); for (User user : users) {
		 * System.out.println(user); }
		 */
		
		
//		System.out.println("**************************************");
//		int a=9;
//		if(a==9) {
//			System.out.println(1);
//		}else if(a<10) {
//			System.out.println(2);
//		}
//			System.out.println(3);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("______________________________");
//		
//
//		String str = "234";
//		long l = Long.parseLong(str);
//		System.out.println(l + "**");
//
//		Date date = new Date();
//		long createtime = date.getTime();
//		System.out.println(createtime);
//
//		Calendar calendar = Calendar.getInstance();
//		calendar.add(calendar.DATE, 1);
//		Date date2 = calendar.getTime();
//		long endtime = date2.getTime();
//		System.out.println(endtime);
//
//		long timesum = endtime - createtime;
//		System.out.println(timesum);
//		
//		long hours = timesum / (1000 * 60 * 60);
//		String minutes = String.format("%02d", (timesum-hours*(1000 * 60 * 60 ))/(1000* 60));
//		StringBuffer buffer=new StringBuffer();
//		buffer.append(hours).append("h").append(minutes).append("m");
//		System.out.println(buffer.length());
//		System.out.println(buffer.toString());
//		System.out.println(buffer.substring(0, buffer.length()));
//		System.out.println(buffer.substring(1, buffer.length()));
//		
//		
//		 SimpleDateFormat dateFormat= new SimpleDateFormat("HH:mm"); 
//		 dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
//		 String time= dateFormat.format(timesum+System.currentTimeMillis());
//		 System.out.println(time);
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
//		Date test = new Date(endtime);
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//		System.out.println(sd.format(test));

	}

}
