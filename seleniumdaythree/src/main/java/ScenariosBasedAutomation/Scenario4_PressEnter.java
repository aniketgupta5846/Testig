package ScenariosBasedAutomation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*******************************************************

Script Name : TCS01.java

Script Description:
Step-1: Launch the Google application in firefox browser
Step-2: Search Test Automation
Step-3: Press Enter key
Date of creation :
Method Library:
Test data path:
Driver Path:
Author Name: 

********************************************************/

public class Scenario4_PressEnter {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Step-1
				//Set the driver path
			    System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
			    
			    //Step - 2
			    //Crate the instance for FireFox Browser
			    WebDriver wd = new FirefoxDriver();
			    
			    FileReader fr = new FileReader(".//Testdata//data.properties");
			    
			    Properties p = new Properties();
			    p.load(fr);
			    
			    //Invoke login page 
			    wd.navigate().to(p.getProperty("baseurl"));
			    wd.findElement(By.name("email")).sendKeys(p.getProperty("unm"));
			    wd.findElement(By.name("password")).sendKeys(p.getProperty("pwd"));
			    
			    Thread.sleep(4000);
			    wd.close();
	}

}
