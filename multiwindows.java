package com.selenium.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

public class multiwindows extends BaseClass
{
	@Test
	public static void win()
	{
		
		d.get("https://www.bing.com/");
		d.findElement(By.linkText("Outlook.com")).click();
		String firstname=d.getWindowHandle();
		System.out.println("First handle name is:"+firstname);
		Set<String> h=d.getWindowHandles();
		String handle[]=new String[h.size()];
		int i=0;
		for(String s:h )
		{
			handle[i]=s;
			i++;
		}
		d.switchTo().window(handle[1]);
		d.findElement(By.linkText("Create free account")).click();
		//Alert a=(Alert) d.switchTo().alert();
		
	//	d.findElement(By.xpath("//input[@id='iSignupAction']")).click();
		
		d.findElement(By.xpath("//input[@id='iSignupAction']")).click();
		System.out.println(d.findElement(By.xpath("//div[@id='MemberNameError']")).getText());
		
		
		
	}

}
