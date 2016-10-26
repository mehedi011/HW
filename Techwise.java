package com.Final.ui.test;

import org.openqa.selenium.By;

public class Techwise {
	public void hw2() throws InterruptedException{
		
		Public p=new Public();
		p.webload("http://www.teachwise.com/");	
		p.y=p.getElementWithAction(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[3]/ul/div/div/li[1]/div[1]/h4/a")).getText();
		p.getElementWithAction(By.xpath(".//*[@id='nav']/li[5]/a/span")).click();
		p.checkStringByWebElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[2]/ul/li[1]/div[1]/h2/a"));
		
	}
}
