package com.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

public class Datepicker extends BaseClass
{
	@Test
	public static void dates()
	{
		d.get("http://jqueryui.com/datepicker/");
		d.findElement(By.linkText("Datepicker")).click();
		d.switchTo().frame(0);
		d.findElement(By.id("datepicker")).click();
		WebElement table=d.findElement(By.tagName("table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		List<WebElement> cols=table.findElements(By.tagName("td"));
		int rowcount=rows.size();
		int colcount=cols.size();
		System.out.println("Rows are"+rowcount);
		System.out.println("Cols are"+colcount);
		
	}

}
