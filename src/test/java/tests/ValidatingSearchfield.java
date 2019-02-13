package tests;

import org.testng.annotations.Test;

import webobjects.CommonObjects;

public class ValidatingSearchfield extends BaseTest {

	@Test(enabled = true, priority = 100)
	public void validateSearchField() {

		CommonObjects common = new CommonObjects(driver);

		if (common.getSearchBox().isEnabled() && common.getSearchBox().isDisplayed()) {
			System.out.println("Search field is enabled and displayed");
		} else {
			System.out.println("Search field is NOT enabled and is NOT displayed");
		}
	}

}
