package com.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

public class mouseEvents extends BaseClass
{
	@Test
	public static void mouseEve() throws Exception
	{
		d.get("http://jqueryui.com/draggable/");
		d.findElement(By.linkText("Draggable")).click();
		d.switchTo().frame(0);
		d.switchTo().defaultContent();
		d.findElement(By.linkText("Droppable")).click();
		d.switchTo().frame(0);
		Actions a=new Actions(d);
		//a.dragAndDrop(d.findElement(By.xpath("//div[contains(@class,'ui-widget-content ')]")), d.findElement(By.xpath("//div[contains(@class,'ui-widget-header ui-droppable')]"))).release().build().perform();
		a.dragAndDrop(d.findElement(By.id("draggable")), d.findElement(By.id("droppable"))).perform();
		d.switchTo().defaultContent();
		
		
		d.findElement(By.linkText("Resizable")).click();
		d.switchTo().frame(0);
		a.dragAndDropBy(d.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se')]")), 317, 189).perform();
		Thread.sleep(5000);
	}
}
