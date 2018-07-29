package com.reddit;


import org.testng.annotations.Test;

import com.reddit.base.BaseTest;



public class FirstTest extends BaseTest {

	@Test
	public void firstTestMethod() {

		// Open old.Reddit.com
		driver.get("https://old.reddit.com");
		System.out.println("Reddit.com opened. Test passed");

	}

}
