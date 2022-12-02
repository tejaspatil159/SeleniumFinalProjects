package com.abc.olivegardenOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlivegardenLoginPage {
	
	public void logIn(WebDriver driver)
	{
		WebElement login=driver.findElement(By.id("header-login-link"));
		login.click();
		String tit=driver.getTitle();
		System.out.println("Title of current webpage is "+tit);
	}

}
