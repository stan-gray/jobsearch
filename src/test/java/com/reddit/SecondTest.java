package com.reddit;


import org.testng.annotations.Test;

import com.reddit.base.BaseTest;

public class SecondTest extends BaseTest {

	@Test
	public void secondTestMethod() {

		// Open Reddit.com
		driver.get("https://reddit.com");
		System.out.println("Reddit.com opened. Test passed");

	}
}
