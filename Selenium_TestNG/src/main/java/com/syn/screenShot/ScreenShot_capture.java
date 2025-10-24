package com.syn.screenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot_capture {

	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
		
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String folderPath = "D:\\eclipse\\Selenium_TestNG\\Screenshots";
			File f = new File(folderPath + "\\" + fileName + "_" + ".png");
			FileUtils.copyFile(srcFile, f);
			System.out.println(" Screenshot saved at: " + f.getAbsolutePath());
		
	}
}
