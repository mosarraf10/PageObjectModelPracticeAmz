package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateItemCategoryAgainstProvidedList extends BaseTest {

	@Test(enabled = true, priority = 400)
	public void getItemCategoryDropDownWebVsProvidedList() {

		ItemCategoryDropDownList obj = new ItemCategoryDropDownList();
		WebItemCategoryDropDown obj1 = new WebItemCategoryDropDown();

		System.out.println("Running item dropdown verification test");
		System.out.println();
		if (obj.getItemCategoryDropDownList().equals(obj1.getWebItemCategoryDropDown())) {
			System.out.println("Dropdown objects from item category list match with PROVIDED item category list");
		} else if (obj.getItemCategoryDropDownList() == obj1.getWebItemCategoryDropDown()) {
			System.out.println("Dropdown objects from item category list match with PROVIDED item category list");
		} else if (obj.getItemCategoryDropDownList() != obj1.getWebItemCategoryDropDown()) {
			System.out.println(
					"Dropdown objects from item category list DOES NOT match with PROVIDED item category list");
		}
		System.out.println("Running item dropdown validation test");
		System.out.println();
		try {
			Assert.assertEquals(obj1.getWebItemCategoryDropDown(), obj.getItemCategoryDropDownList());
			System.out.println("Dropdown objects from item category list match with PROVIDED item category list");
		} catch (Exception e) {
			System.out.println(
					"Dropdown objects from item category list DOES NOT match with PROVIDED item category list");
		}
	}

}
