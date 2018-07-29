package com.reddit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.reddit.base.BasePageObject;

public class LogInPage extends BasePageObject<LogInPage> {
	private static final String URL = "https://old.reddit.com";
	
	private By emailField = By.xpath("//input[@name='user']");
	private By passwordField = By.xpath("//input[@name='passwd']");
	private By signInButton = By.xpath("//button[@type='submit']");
	
	public LogInPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void openLogInPage( ) {
		getPage(URL);
	}
	
	public void fillUpEmailAndPassword(String email, String password) {
		System.out.println("Filling up email and password");
		type(email, emailField);
		type(password, passwordField);
	}
	
	public ProfilePage pushSignInButton() {
		System.out.println("Clicking on sign in button");
		click(signInButton);
		return new ProfilePage(driver);
		
	}

}
