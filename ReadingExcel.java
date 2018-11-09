package com.selenium.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

import jxl.Sheet;
import jxl.Workbook;

public class ReadingExcel extends BaseClass
{
	@Test
	public static void readingexcel() throws Exception
	{
		d.get("https://www.facebook.com/");
		System.out.println(d.getTitle());
		
		FileInputStream fis=new FileInputStream("F:\\JavaNew\\Testdata\\readingFB (2).xls");
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet(0);
		System.out.println("Number of rows are::"+s.getRows());
		System.out.println("Number of columns are::"+s.getColumns());
		
		for(int i=0;i<s.getRows();i++)
		{
			for(int j=0;j<s.getColumns();j++)
			{
				Thread.sleep(3000);
				d.findElement(By.id("email")).sendKeys(s.getCell(j, i).getContents());
				//d.findElement(By.id("pass")).sendKeys(s);
				
			}
		}
		
	
	}
}
