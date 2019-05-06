package com.model.MavenForGithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class parallelExecution {
	
	WebDriver driver;
 

  @Test(priority=1)
  public void openBrowser()
  {
	  System.out.println("Working on firefox browser");
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\firefox\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://www.facebook.com");
	  System.out.println("Successfully executed"); 
  }

  @Test(priority=2)
  public void openIE()
  {
	  System.out.println("Working on internet explorer");
	  System.setProperty("webdriver.ie.driver", "D:\\Selenium Setup\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.get("http://www.google.com");
	  System.out.println("IE browser opened successfully"); 
  }

}
