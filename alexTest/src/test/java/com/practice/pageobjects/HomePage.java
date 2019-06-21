package com.practice.pageobjects;

import static com.practice.objectrepositories.HomeElements.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

	@FindBy( how = How.XPATH, using = element1Xpath )
	private WebElement element1;
	
	@FindBy( xpath = element2Xpath )
	private WebElement element2;
	
	@FindBy( css = "")
	private WebElement element3;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
