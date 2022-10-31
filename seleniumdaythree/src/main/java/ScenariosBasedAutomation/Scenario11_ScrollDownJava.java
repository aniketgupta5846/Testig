package ScenariosBasedAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*******************************************************
 * 
 * Script Name : TCS01.java
 * 
 * Script Description: Step-1: Launch the Google application in firefox browser
 * Step-2: Search Test Automation Step-3: Press Enter key Date of creation :
 * Method Library: Test data path: Driver Path: Author Name:
 * 
 ********************************************************/

public class Scenario11_ScrollDownJava {

	public static void main(String[] args) throws InterruptedException {
		// Step-1
		// Set the driver path
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

		// Step - 2
		// Crate the instance for FireFox Browser
		WebDriver wd = new FirefoxDriver();

		wd.get("https://jquery.com/");
		Thread.sleep(2000);

		// Scroll down
		((JavascriptExecutor) wd).executeScript("scroll(0,200)");
		Thread.sleep(2000);
		((JavascriptExecutor) wd).executeScript("scroll(0,500)");

		Thread.sleep(2000);
		wd.quit();

	}

}
