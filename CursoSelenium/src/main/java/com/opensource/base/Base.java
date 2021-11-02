package com.opensource.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base {

	private WebDriver driver;

	/*
	 * Constructor
	 * 
	 * @author Jorge.Muñoz
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Reporter
	 * 
	 * @author Jorge.Muñoz
	 */

	public void reporter(String log) {
		Reporter.log(log);
	}

	/*
	 * Set WebDriver
	 * 
	 * @author Jorge.Muñoz
	 */

	public WebDriver chromeDriver() {
		System.setProperty(GlobalVariables.CHROME_DRIVER_KEY, GlobalVariables.CHROME_DRIVER_NAME);
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	/*
	 * Implicitly wait
	 */

	public void implicitlyWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Wait for element present (sync)
	 */

	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 
	 */

}
