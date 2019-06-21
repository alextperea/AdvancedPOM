package com.practice.tests;

import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.practice.config.ConfigurationReader;
import com.practice.exceptions.BadBrowserConfigException;

public class TestBase {

	protected WebDriver driver;
	
	@BeforeClass
	public void allSetup() {
		//Initial configuration and setup
		boolean initial = true;
		
		if (initial) {
			Properties props = ConfigurationReader.readConfigFile();
			
			System.setProperty("chrome.driver", props.getProperty("test.drivers.location"));
			
			String browser = props.getProperty("test.browser");
			
			switch(browser) {
			
				case "chrome": driver = new ChromeDriver();
				break;
				
				case "firefox" :
				break;
				
				default : throw new BadBrowserConfigException(browser + " invalid.");
			}
			
			initial = false;
		}
	}
}
