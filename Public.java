package com.Final.ui.test;

import java.util.concurrent.TimeUnit;

import javax.imageio.ImageTypeSpecifier;

import org.jboss.netty.channel.StaticChannelPipeline;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.Select;

public class Public {
	
	static FirefoxDriver fd;
	static String y;
	
	public FirefoxDriver getDriver(){
		System.setProperty("webdriver.gecko.driver", "/Users/mehedi/Downloads/geckodriver");
		fd=new FirefoxDriver();
		return fd;			
		}
	public void webload(String address) {
		getDriver().get(address);
		fd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		fd.navigate().refresh();
		
		}
	public void refresh() {
		fd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		fd.navigate().refresh();
	}
	public String getElementText(By x) {
		return fd.findElement(x).getAttribute("");
	}
	public WebElement getElementWithAction(By x) {
		return fd.findElement(x);
	}
	public void rest() throws InterruptedException {
		Thread.sleep(3000);
		
	}
	
	public void checkBoolean(boolean x) {
		if(x=true)
			System.out.println("Object is Displayed");
		else 
			System.out.println("Object is NOT Displayed");
		
	}
	public void checkString(String x) {
		if(x.equalsIgnoreCase(y))
			System.out.println("Text is Displayed");
		else 
			System.out.println("Text is NOT Displayed");	
	}
	public void checkStringByWebElement(By x) {
		String q=fd.findElement(x).getText();
		if(q.equalsIgnoreCase(y))
			System.out.println("Both are Same");
		else 
			System.out.println("Both are not Same");	
	}
	public void getElementInDropDown(By x, int count) {
		Select s=new Select(fd.findElement(x));
		count=s.getOptions().size();
		System.out.println(count);
		//s.selectByIndex(count-2);	
	}
	
	public Select DropdownSelection(By x) {
		Select s=new Select(fd.findElement(x));
		return s;		
		}
	
	public void rightClick(By x)
    {
        Actions ac=new Actions(fd);
        ac.contextClick(fd.findElement(x)).build().perform();
    }
	public void ScrollToObject(By x) {
		((JavascriptExecutor)fd).executeScript("arguments[0].scrollIntoView();", fd.findElement(x));
	}
	public void CloseBrowser() {
		fd.quit();
		
	}
	
}