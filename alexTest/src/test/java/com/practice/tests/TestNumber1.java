package com.practice.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.practice.pageobjects.HomePage;

public class TestNumber1 extends TestBase {

	private WebDriver driver;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void testNumber1() {
		
		HomePage home = new HomePage(driver);
		
		Assert.assertTrue(true);
	}
}
