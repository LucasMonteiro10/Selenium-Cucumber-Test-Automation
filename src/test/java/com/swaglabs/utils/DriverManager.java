package com.swaglabs.utils;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
  private static WebDriver driver;

  public static WebDriver getDriver() {
      if (driver == null) {
      	String projectRootPath = System.getProperty("user.dir");
      	String filePath = projectRootPath + "/src/test/java/com/swaglabs/utils/drivers/geckodriver.exe";     	
      	
          System.setProperty("webdriver.gecko.driver", filePath);
          driver = new FirefoxDriver();
          
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.manage().window().maximize();
      }
      return driver;
  }

  public static void quitDriver() {
      if (driver != null) {
          driver.quit();
          driver = null;
      }
  }
}
