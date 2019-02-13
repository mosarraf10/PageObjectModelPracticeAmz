package tests;

import org.testng.annotations.Test;

import webobjects.CommonObjects;

public class ValidateSearchButton extends BaseTest {

	@Test(enabled = true, priority = 200)
	public void validateSearchButton() {
		CommonObjects common = new CommonObjects(driver);
		if (common.getSearchBox().isDisplayed() && common.getSearchBox().isEnabled()
				&& common.getSearchButton().isDisplayed() && common.getSearchButton().isEnabled()) {
			common.getSearchBox().sendKeys("iphone");
			common.getSearchButton().click();
		}
	}

}
