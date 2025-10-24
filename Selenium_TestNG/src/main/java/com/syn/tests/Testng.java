package com.syn.tests;

import java.io.IOException;

import org.testng.annotations.Test;
import com.syn.base.BaseTest;
import com.syn.pages.LoginPage;
import com.syn.pages.Productpage;
import com.syn.screenShot.ScreenShot_capture;
import com.syn.utils.Data;
import com.syn.pages.CartPage;
import com.syn.pages.CheckoutPage;
import com.syn.pages.ConfirmationPage;

public class Testng extends BaseTest {

	@Test(dataProvider="Data",dataProviderClass=Data.class)
	public void test(String username,String password,String firstname,String lastname,String zip) throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickLogin();

		Productpage pp = new Productpage(driver);
		pp.addProducts();
		pp.goToCart();

		CartPage cp = new CartPage(driver); 
		cp.proceedToCheckout();

		CheckoutPage cop = new CheckoutPage(driver);
		cop.fillDetails(firstname, lastname, zip);

		ConfirmationPage cnfrm = new ConfirmationPage(driver);
		String s=cnfrm.getConfirmationMessage();
		System.out.println(s);

		ScreenShot_capture sc = new ScreenShot_capture();
		ScreenShot_capture.takeScreenshot(driver, null);
	}
}

