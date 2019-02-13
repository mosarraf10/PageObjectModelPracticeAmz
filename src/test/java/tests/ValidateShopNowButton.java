package tests;

import org.testng.annotations.Test;

import webobjects.CommonObjects;
import webobjects.IphonePage;

public class ValidateShopNowButton extends BaseTest {

	@Test(enabled = true, priority = 300)
	public void validateShopNowButton() {
		CommonObjects common = new CommonObjects(driver);
		IphonePage shopNowButton = new IphonePage(driver);

		common.getSearchBox().sendKeys("iphone");
		common.getSearchBox().submit();

		if (shopNowButton.getShopNowButton().isDisplayed() && shopNowButton.getShopNowButton().isEnabled()) {
			shopNowButton.getShopNowButton().click();
			System.out.println("Shop Now Button is clicked");
		}
	}

}
