package com.job.JobSearchMaven.core;

import static com.job.JobSearchMaven.core.DriverMaster.getDriver;
//import static com.job.JobSearchMaven.core.Configuration.setGlobalEnvironment;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public abstract class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser", "environment"})
	public void setUp(@Optional("firefox") String browser, @Optional("local") String environment) {
		driver = getDriver(browser);
		//setGlobalEnvironment(environment);
	}
	
	/* In JobSearch I dont need to close browser
	@AfterTest(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	*/
}
