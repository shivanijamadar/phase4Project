package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LaunchApplication;
import pages.PageLocators;

public class AddProductToCart extends LaunchApplication{
	@Test
	public void AFlipkarttest() throws InterruptedException {
				PageLocators pl = new PageLocators(driver);
				
				Thread.sleep(5000);
				pl.GetSearchMenuGo().click();
				Thread.sleep(5000);
				
				pl.GetSearchButtonInput().sendKeys("Mobile");
				
				Thread.sleep(5000);
				pl.GetSearchButton().click();
				
				Thread.sleep(5000);
				pl.GetFirstSearchResult().click();
				
				Thread.sleep(2000);
				pl.GetAddToCartButton().click();
				
				Thread.sleep(5000);
				pl.GetGoToCartButton().click();
				
				Thread.sleep(5000);
				Boolean myCartisPresent = pl.GetMyCart().isDisplayed();
				
				Assert.assertTrue(myCartisPresent);
	}

}
