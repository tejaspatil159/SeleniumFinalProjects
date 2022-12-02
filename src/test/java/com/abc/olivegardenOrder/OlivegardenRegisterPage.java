package com.abc.olivegardenOrder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OlivegardenRegisterPage {
	
	public void register(WebDriver driver)
	{
		WebElement registerButton=driver.findElement(By.id("customerLogoutId"));
		registerButton.click();
		String tit=driver.getTitle();
		System.out.println("Title of current webpage is "+tit);
		
	}
	
	public void registrationDetails(WebDriver driver)
	{
		WebElement email=driver.findElement(By.id("email-id"));
		email.sendKeys("t@gmail.com");
		WebElement fn=driver.findElement(By.id("fname"));
		fn.sendKeys("tejas");
		WebElement ln=driver.findElement(By.id("lname"));
		ln.sendKeys("patil");
		WebElement zip=driver.findElement(By.id("zip"));
		zip.sendKeys("987456");
		WebElement pn=driver.findElement(By.id("phone-ctn"));
		pn.sendKeys("7845123265");
		WebElement ext=driver.findElement(By.id("phoneExt"));
		ext.sendKeys("91");
		WebElement Ext=driver.findElement(By.id("phone_type_wid"));
		Select Extddn=new Select(Ext);
		Extddn.selectByVisibleText("Primary");
		WebElement month=driver.findElement(By.id("dobMonth"));
		Select monthddn=new Select(month);
		monthddn.selectByVisibleText("March");
		WebElement day=driver.findElement(By.id("dobDay"));
		Select dayddn=new Select(day);
		dayddn.selectByVisibleText("9");
		WebElement year=driver.findElement(By.id("dobYear"));
		Select yearddn=new Select(year);
		yearddn.selectByVisibleText("1978");
		WebElement pass=driver.findElement(By.id("pwd"));
		pass.sendKeys("TEtg$#%6&%^6Y");
		WebElement findRestro=driver.findElement(By.id("selectRestaurant"));
		findRestro.click();
	}
	
	public void city(WebDriver driver){
		
		WebElement cityName=driver.findElement(By.id("searchText_overlay"));
		cityName.sendKeys("texas");
		WebElement search=driver.findElement(By.id("preferred_searchIcon"));
		search.click();
		int a=700650;
		List <WebElement> restro=driver.findElements(By.xpath("//div[@class='casual_span_overlay']/div[@class='loc_span_grey_overlay border_top_0']/div[@class='row']/descendant::div[@class='span2 margin_lft_07_overlay']/span"));
		String myData="Temple";
		for(int i=0;i<=restro.size()-1;i++)
		{
			WebElement one=restro.get(i);	
			String dt=one.getText();
			System.out.println(dt);
			if(dt.equals(myData))
			{                                                    
				WebElement b=driver.findElement(By.xpath("//button[@data-id='"+a+"']"));
				b.click();
				break;
			}
			
		}
	}
	

}
