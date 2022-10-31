package com.junit.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.day1.lib.Libraryone;

import junit.framework.TestCase;

class TC_001 extends TestCase {
	// WebDriver wd = new FirefoxDriver();
	Libraryone l1 = new Libraryone();


	@Test
	public void test1() {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		l1.initDriver(wd);
		l1.launchOpencart();
	}

	@Test
	public void test2() {
		System.out.println("Hi How are you 2");
	}

	@Test
	public void test3() {
		System.out.println("Hi How are you 3");
	}

	@BeforeClass
	public void test4() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void test5() {
		System.out.println("After Class");
	}

	@Ignore
	public void test6() {
		System.out.println("Ignored");
	}

}
