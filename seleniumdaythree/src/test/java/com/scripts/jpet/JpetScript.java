package com.scripts.jpet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageone.jpet.LibraryPageOne;
import com.pagetwo.jpet.LibraryPageTwo;

public class JpetScript {
		// Page objects
		LibraryPageOne obj1 = new LibraryPageOne();
		LibraryPageTwo obj2=new LibraryPageTwo();

		 static WebDriver wd;
	  @BeforeTest
	  public void f() {
		  System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		  wd = new FirefoxDriver();
		  
	  }
	  
	  @Test(priority=1)
		public void Fun_JpetInvoke() throws InterruptedException, IOException {
		  obj1.init1(wd);
		  obj1.Fun_LaunchJpetApp();
		  Thread.sleep(2000);
		  
	  }
	  @Test(priority=2)
	  public void Fun_JpetClickSignin() throws InterruptedException {
		  obj1.Fun_ClickSignin();
		  Thread.sleep(2000);
	  }
	  @Test(priority=3)
	  public void Fun_Enter_UserName() throws InterruptedException {
		  obj2.DriverInit2(wd);
		  obj2.EnterUserName();
		  Thread.sleep(2000);
	  }
	  @Test(priority=4)
	  public void Fun_Enter_Password() throws InterruptedException {
		  obj2.EnterPassword();
		  Thread.sleep(2000);
	  }
	  @Test(priority=5)
	  public void Fun_Click_Signon() throws InterruptedException {
		  obj2.ClickSignOn();
		  Thread.sleep(2000);	  
	  }
	  @Test(priority=6)
		public void displayString() {
			System.out.println("Hello!");
	  }

		@AfterTest
		public void Fun_CloseBrowser() {
			wd.close();
		}

}
