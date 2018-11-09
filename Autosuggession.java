package com.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

public class Autosuggession extends BaseClass
{
	@Test
	public static void sugg() throws Exception
	{
		d.get("https://www.google.com/");
		
		d.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("mana");
		
		List<WebElement> l=d.findElements(By.xpath("//ul[@class='sbsb_b']"));
		for(WebElement e:l)
		{
			System.out.println("All suggessions are:"+e.getText());
			
			d.findElement(By.xpath("//ul[@class='sbsb_b']")).sendKeys(Keys.ARROW_DOWN);
			
			
			if(e.getText().equals("manali"))
			{
				Thread.sleep(3000);
				d.findElement(By.xpath("//ul[@class='sbsb_b']")).sendKeys(Keys.ENTER);
				
				Thread.sleep(5000);
				d.findElement(By.linkText("Images")).click();
				Thread.sleep(4000);
			}
			
		}
		
				
	}

}
