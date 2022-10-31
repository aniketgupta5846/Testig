package ScenariosBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*******************************************************
 * 
 * Script Name : TCS01.java
 * 
 * Script Description: Step-1: Launch the Google application in firefox browser
 * Step-2: Search Test Automation Step-3: Press Enter key Date of creation :
 * Method Library: Test data path: Driver Path: Author Name:
 * 
 ********************************************************/

public class Scenario6_PressEnter {

	public static void main(String[] args) throws InterruptedException {
		// Step-1
		// Set the driver path
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

		// Step - 2
		// Crate the instance for FireFox Browser
		WebDriver wd = new FirefoxDriver();

		wd.get("https://demo.guru99.com/test/newtours/register.php");
		((JavascriptExecutor)wd).executeScript("scroll(0,500)");
		Select sel = new Select(wd.findElement(By.xpath("//select[@name='country']")));

		sel.selectByValue("ANGOLA");
		Thread.sleep(5000);

	}

}
