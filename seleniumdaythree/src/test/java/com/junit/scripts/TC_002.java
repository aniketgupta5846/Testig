package com.junit.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.day1.lib.Libraryone;

import junit.framework.TestCase;

public class TC_002 extends TestCase {
	Libraryone l1 = new Libraryone();

	@Test
	public void test1() {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		l1.initDriver(wd);
		l1.launchOpencart();
		l1.Click_On_MyAccount();
		l1.exitBrowser(wd);

	}

	@Test
	public void test2() {
		System.out.println("Hi How are you 2");
		// l1.Click_On_MyAccount();
	}
}
