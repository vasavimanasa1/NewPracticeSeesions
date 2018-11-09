package com.selenium.Practice;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

public class DataReadPOI extends BaseClass

{ 
	@Test
	public static void POIRead() throws Exception
	{
		/*d.get("https://www.google.co.in");
		System.out.println(d.getTitle());
		FileInputStream fis=new FileInputStream("F:\\JavaNew\\Testdata\\dataimport_POI.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(0);
		
		for(int i=0;i<sh1.getLastRowNum();i++)
		{
			d.findElement(By.id("lst-ib")).clear();
			d.findElement(By.id("lst-ib")).sendKeys(sh1.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(1000);
			
		
		}*/
		d.get("https://www.google.co.in");
		assertEquals("Google",d.getTitle());
		//Read data from excel
		FileInputStream fis=new FileInputStream("F:\\\\JavaNew\\\\Testdata\\\\dataimport_POI.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		for(int i=0;i<s.getLastRowNum()+1;i++)
		{
			d.findElement(By.id("lst-ib")).clear();
			d.findElement(By.id("lst-ib")).sendKeys(s.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
	}
		
		
		
		
		
		
		
	}

