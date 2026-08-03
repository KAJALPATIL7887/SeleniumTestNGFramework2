package com.automation.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.Base.BaseTest;

public class SampleTest extends BaseTest{
	
	@Test
    public void verifyPageTitle() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test
    public void verifySearchBoxIsDisplayed() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        Assert.assertTrue(searchBox.isDisplayed());
    }	

}
