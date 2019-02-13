package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import webobjects.CommonObjects;

public class WebItemCategoryDropDown extends BaseTest {

	public List<String> getWebItemCategoryDropDown() {

		CommonObjects common = new CommonObjects(driver);

		List<WebElement> valueFromItemCategoryDropDown = common.getItemCategoryDropDown();
		List<String> itemCategoryDropDownStringValue = new ArrayList<String>();

		for (WebElement v : valueFromItemCategoryDropDown) {
			itemCategoryDropDownStringValue.add(v.getText());
		}

		return itemCategoryDropDownStringValue;

	}

}
