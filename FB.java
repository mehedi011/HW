package com.Final.ui.test;

import org.openqa.selenium.By;

public class FB {
	public void hw4() throws InterruptedException{
		
		Public p=new Public();
		p.webload("https://www.facebook.com");
		p.DropdownSelection(By.xpath(".//*[@id='month']")).selectByVisibleText("Aug");
		p.rest();
		p.DropdownSelection(By.xpath(".//*[@id='day']")).selectByVisibleText("12");;
		p.rest();
		p.DropdownSelection(By.xpath(".//*[@id='year']")).selectByValue("1979");
		p.rest();
		//p.rightClick(By.xpath(".//*[@id='u_0_e']"));
		p.CloseBrowser();
	}
	FB() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
