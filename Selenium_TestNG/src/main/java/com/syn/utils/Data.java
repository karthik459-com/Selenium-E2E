package com.syn.utils;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name = "Data")
	public Object[][] getData() throws Exception {
		String filepath = "D:\\eclipse\\Selenium_TestNG\\personDetailsInformation\\Details.xlsx";
		return ExcelUtils.getcredentials(filepath);
	}
}
