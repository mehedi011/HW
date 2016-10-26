package com.Final.ui.test;

import org.openqa.selenium.By;

public class Eshopper {
	public void hw3() throws InterruptedException{
		
		Public p=new Public();
		p.webload("https://www.eshopper24.com/");			
		p.getElementWithAction(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a/b")).click();
		p.rest();
		//p.refresh();
		p.ScrollToObject(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div[50]/figure/figcaption/h4/a"));
		p.rest();
		p.rest();
		p.rest();
		p.y=p.getElementWithAction(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div[50]/figure/figcaption/h4/a")).getText();
		System.out.println(p.y+"XXX");
		p.checkString("katan");
	
	
	}
}