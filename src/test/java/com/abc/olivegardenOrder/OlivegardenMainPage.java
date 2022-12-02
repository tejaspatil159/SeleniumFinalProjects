package com.abc.olivegardenOrder;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlivegardenMainPage {
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public void siteLaunch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notification");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.olivegarden.com");
		driver.manage().deleteAllCookies();
		String tit=driver.getTitle();
		System.out.println("Title of current webpage is "+tit);
		
	}


	public static void main(String[] args) throws InterruptedException {
		OlivegardenMainPage ogmp=new OlivegardenMainPage();
		ogmp.siteLaunch();
		OlivegardenLoginPage oglp=new OlivegardenLoginPage();
		oglp.logIn(driver);
		OlivegardenRegisterPage ogrp=new OlivegardenRegisterPage();
		ogrp.register(driver);
		ogrp.registrationDetails(driver);
		ogrp.city(driver);
		OlivegardenCareersPage ogcp=new OlivegardenCareersPage();
		ogcp.careers(driver, js);
		
		
	}
	

	
	

}
