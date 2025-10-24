package com.syn.utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static Object[][] getcredentials(String filepath) throws IOException{

		FileInputStream fis=new FileInputStream(filepath);

		Workbook wb=new XSSFWorkbook(fis);		
		Sheet sheet=wb.getSheetAt(0);		
		DataFormatter df=new DataFormatter();		
		int row=sheet.getPhysicalNumberOfRows();		
		int col=sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[row-1][col];

		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				data[i-1][j]=df.formatCellValue(sheet.getRow(i).getCell(j));				
			}
		}
		wb.close();
		fis.close();
		return data;
	}
}