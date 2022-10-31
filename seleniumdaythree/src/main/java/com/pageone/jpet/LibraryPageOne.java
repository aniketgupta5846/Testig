package com.pageone.jpet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class LibraryPageOne {
	// Declaration of Webdriver
	WebDriver wd;
	FileReader fr;
	Properties p;

	public LibraryPageOne() {
		super();
		File file = new File(".//JpetOR//or1.properties");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties p = new Properties();
		try {
			p.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// By variables for webelements
	By text1 = By.xpath(p.getProperty("txt"));
	By signinlink = By.xpath("//a[contains(text( ),\"Sign In\")]");

	// WebDriver initialization for page1

	public void init1(WebDriver wd) {
		this.wd = wd;
	}

	public void Fun_LaunchJpetApp() throws IOException {
		wd.get("https://petstore.octoperf.com/actions/Catalog.action");
		if (wd.findElement(text1).isDisplayed()) {

			System.out.println("The application is launched");
			File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("./ScreenImages/image1.png"));
		} else {
			System.out.println("Wrong url");
			File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("./ScreenImages/image2.png"));
		}
		}

	public void Fun_ClickSignin() {
		if (wd.findElement(signinlink).isDisplayed()) {
			wd.findElement(signinlink).click();
		} else {
			System.out.println("The element signin is not present");
		}
		}
}
