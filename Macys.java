package com.Final.ui.test;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;

public class Macys {
	public void hw1() throws InterruptedException{
	
	Public p=new Public();
	p.webload("https://www.macys.com");				
	//System.out.println(p.getElementText(By.xpath(".//*[@id='macysHomePageLogo']")));
	//System.out.println("TEST");
	boolean c=(p.getElementWithAction(By.xpath(".//*[@id='macysHomePageLogo']")).isDisplayed());
	p.checkBoolean(c);
	p.getElementWithAction(By.xpath(".//*[@id='flexLabel_7495']/a")).click();
	p.rest();
	//p.refresh();
	//p.getElementWithAction(By.xpath(".//*[@id='globalSearchInputField']")).clear();
	p.getElementWithAction(By.xpath(".//*[@id='globalSearchInputField']")).sendKeys("bath rugs");
	p.getElementWithAction(By.xpath(".//*[@id='subnavSearchSubmit']")).click();
	p.rest();
	p.y=p.getElementWithAction(By.xpath(".//*[@id='RUG_STYLE']/h2")).getText();
	//System.out.println(p.y);
	p.checkString("rug style");
	p.getElementWithAction(By.xpath(".//*[@id='sortBy']")).click();
	p.getElementWithAction(By.xpath(".//*[@id='sortBy']/option[3]")).click();
	p.getElementInDropDown(By.xpath(".//*[@id='sortBy']"), 2);
	//p.getElementInDropDown(By.xpath(".//*[@id='sortBy']", 2)); //RIGHT CLICK AND GET ELEMENT FROM DROP DOWN ISN'T WORKING.
	/*p.rightClick(By.xpath(".//*[@id='sortBy']"));
	p.rightClick(By.xpath(".//*[@id='sortBy']/option[3]"));*/
	p.rest();
	
	
	
	
	}
}
