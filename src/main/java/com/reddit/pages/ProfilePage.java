package com.reddit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.reddit.base.BasePageObject;

public class ProfilePage extends BasePageObject<ProfilePage> {
	private By editProfileButton = By.xpath("//input[@type='submit']");
	private By profileContactNameText = By.id("#header-bottom-right > span.user > a");
	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	public void waitForProfilePageToLoad( ) {
		System.out.println("Wait for profile page to load");
		waitForVisibilityOf(editProfileButton);
	}
	
	public boolean isCorrectProfileLoaded(String correctProfileName) {
		if (getText(profileContactNameText).equals(correctProfileName)) {
			return true;
		}
		return false;
	}
}
