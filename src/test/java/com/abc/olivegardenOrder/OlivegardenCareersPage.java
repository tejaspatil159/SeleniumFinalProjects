package com.abc.olivegardenOrder;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OlivegardenCareersPage {
	
	public void careers(WebDriver driver ,JavascriptExecutor js) throws InterruptedException
	{
		WebElement careersBut=driver.findElement(By.xpath("//a[@id='https://jobs.olivegarden.com/']"));
		//js.executeScript("arguments[0].scrollIntoView();",careersBut);
		Thread.sleep(4000);
		WebDriverWait ww=new WebDriverWait(driver,Duration.ofSeconds(120));
		try
		{
			ww.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[@id='https://jobs.olivegarden.com/']"))));
			careersBut.click();
		}
		catch(Exception x)
		{
			System.out.println(x.toString());
			System.out.println("Element is not visible");
		}
		System.out.println("now moving ahead");
		
		ArrayList <String> wh=new ArrayList<String>(driver.getWindowHandles());
		String mainWinHandId=wh.get(0);
		for(int i=1;i<=wh.size()-1;i++)
		{
			String w=wh.get(i);
			driver.switchTo().window(w);
			System.out.println("Window is swiched");
			WebElement resMan=driver.findElement(By.xpath("//a[@href='/search/searchjobs?categoryid=4d8c1048-c2bb-4c19-800a-f44ea3735299']"));
			resMan.click();
			WebElement cookies=driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']"));
			cookies.click();
			String a="25320890-b413-498d-9a4b-13cc4ff0564f";
			List <WebElement> restMan=driver.findElements(By.xpath("//table[@class='jtable ui-widget-content']/tbody/tr[@aria-label='Restaurant Manager']/td[@class='reference-number-column']/span"));
			String myData="24783";
			for(int j=0;j<=restMan.size()-1;j++)
			{
				WebElement one=restMan.get(j);	
				String dt=one.getText();
				System.out.println(dt);
				if(dt.equals(myData))
				{      
					WebElement b=driver.findElement(By.xpath("//table[@class='jtable ui-widget-content']/tbody/tr[@data-record-key='"+a+"']"));
					b.click();
					break;
				}
				
			}
			
			
		}
				
	}

}
