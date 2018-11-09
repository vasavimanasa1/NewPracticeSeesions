package com.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

public class table extends BaseClass
{
	@Test
	public static void tables()
	{
		d.get("https://www.redbus.in/?gclid=CjwKCAjw6-_eBRBXEiwA-5zHaYcfUoHIPjknO0r8-ySCBzQwQSS_uSMnvaQPhnCIRs6Pk516RNF3bRoCiG8QAvD_BwE");
		d.findElement(By.xpath("//label[contains(@class,'db text-trans-uc tal')]")).click();
		
		WebElement table=d.findElement(By.tagName("table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		List<WebElement> cols=table.findElements(By.tagName("td"));
		int numrows=rows.size();
		int numcols=cols.size();
		
		System.out.println("number of rows in the table are::"+numrows);
		System.out.println("number of cols in table are::"+numcols);
		int r=0,c;
		
		for(r=0;r<numrows;r++)
		{
			List<WebElement> colsineachrow=rows.get(r).findElements(By.tagName("td"));
			for(c=0;c<numcols;c++)
			{
				String celltext=colsineachrow.get(c).getText();
				System.out.println("Row: "+r+"Col: "+c+"  Text:: "+celltext);
			}
			
			
		}
		
		
	}

}
