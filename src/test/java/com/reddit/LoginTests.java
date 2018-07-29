package com.reddit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.reddit.base.BaseTest;
import com.reddit.pages.LogInPage;
import com.reddit.pages.ProfilePage;

public class LoginTests extends BaseTest {
	
	@Test
	public void positiveLoginTest() {
		LogInPage logInPage = new LogInPage(driver);
		String expectedPageTitle = "popular links";
		String correctProfileName = "stangray94";
		
	//Open old.reddit.com website
	logInPage.openLogInPage();
	
	//Fill up email and password
	logInPage.fillUpEmailAndPassword("stangray94", "12345678");
	
	//Push Sign In Button and wait for profile load
	ProfilePage profilepage = logInPage.pushSignInButton();
	profilepage.waitForProfilePageToLoad();
	
	//Verification
	//Verify title of page is correct
	System.out.println("Verifications");
	String actualTitle = profilepage.getTitle();
	Assert.assertTrue(expectedPageTitle.equals(actualTitle), 
			"Page title is not expected. \nExpected: " + expectedPageTitle + "\nActual: " + actualTitle);
	
	
	//Verify correct name on profile page
	Assert.assertTrue(profilepage.isCorrectProfileLoaded(correctProfileName), "Profile name is not equal");
		
	}
}
