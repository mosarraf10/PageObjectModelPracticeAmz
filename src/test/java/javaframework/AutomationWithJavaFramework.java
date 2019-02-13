package javaframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutomationWithJavaFramework {

	public static void main(String[] args) throws Exception {

		String expectedURL = "https://www.amazon.com/";

		String os = System.getProperty("os.name").toLowerCase();
		System.out.println();

		String path = System.getProperty("user.dir");
		String winDriverPath = path + "\\Drivers\\chromedriver.exe";

		String macDriverPath = path + "/Drivers/chromedriver";

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", macDriverPath);
		} else {
			System.setProperty("webdriver.chrome.driver", winDriverPath);
		}

		WebDriver driver = new ChromeDriver();

		driver.navigate().to(expectedURL);
		String actualURL = driver.getCurrentUrl();
		System.out.println("URL Validation Test");
		System.out.println("\n Expected URL and Actual URL are the SAME. Validation passed!!!");
		try {
			Assert.assertEquals(expectedURL, actualURL);
		} catch (Exception e) {
			System.out.println("\n Expected URL and Actual URL are NOT the same. Validation failed!!!");
			System.out.println();
		}

		System.out.println("\n Test Case: User validation input text field");
		WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		if (searchBox.isEnabled() && searchBox.isEnabled()) {
			searchBox.sendKeys("brakes");
			searchBox.submit();
			System.out.println("\n User is able to click on search box, type and search for items");
		} else {
			System.out.println("\n Searchinng for items has failed.");
		}

		List<WebElement> elementsInAllDropDownList = driver.findElements(By.id("searchDropdownBox"));
		List<String> storeElementsFromAllList = new ArrayList<String>();

		for (WebElement webElementArrayItems : elementsInAllDropDownList) {
			storeElementsFromAllList.add(webElementArrayItems.getText());
		}
		System.out.println("List from Amazon");
		System.out.println();
		for (String stringArrayItems : storeElementsFromAllList) {
			System.out.println(stringArrayItems);
		}

		System.out.println("************************");
		System.out.println();
		System.out.println("List from ArrayList");
		System.out.println();

		List<String> allItemsForItemCategoryDropDown = new ArrayList<String>();
		allItemsForItemCategoryDropDown.addAll(Arrays.asList("All Departments", "Alexa Skills", "Amazon Devices",
				"Amazon Fresh", "Amazon Warehouse", "Appliances", "Apps & Games", "Arts, Crafts & Sewing",
				"Automotive Parts & Accessories", "Baby", "Beauty & Personal Care", "Books", "CDs & Vinyl",
				"Cell Phones & Accessories", "Clothing, Shoes & Jewelry", "   Women", "   Men", "   Girls", "   Boys",
				"   Baby", "Collectibles & Fine Art", "Computers", "Courses", "Credit and Payment Cards",
				"Digital Music", "Electronics", "Garden & Outdoor", "Gift Cards", "Grocery & Gourmet Food", "Handmade",
				"Health, Household & Baby Care", "Home & Business Services", "Home & Kitchen",
				"Industrial & Scientific", "Just for Prime", "Kindle Store", "Luggage & Travel Gear", "Luxury Beauty",
				"Magazine Subscriptions", "Movies & TV", "Musical Instruments", "Office Products", "Pet Supplies",
				"Prime Pantry", "Prime Video", "Software", "Sports & Outdoors", "Tools & Home Improvement",
				"Toys & Games", "Vehicles", "Video Games"));

		for (String n : allItemsForItemCategoryDropDown) {
			System.out.println(n);
		}
		System.out.println("Data VERIFICATION test");
		for (int i = 0; i < storeElementsFromAllList.size(); i++) {
			if (storeElementsFromAllList.get(i).equals(allItemsForItemCategoryDropDown.get(i))) {
				System.out.println("Data from Amazon's ALL dropdown match data from DataFile. VERIFIED!!!");
			} else if (storeElementsFromAllList.get(i) == allItemsForItemCategoryDropDown.get(i)) {
				System.out.println("Data from Amazon's ALL dropdown match data from DataFile. VERIFIED!!!");
			} else if (storeElementsFromAllList.get(i) != allItemsForItemCategoryDropDown.get(i)) {
				System.out.println("Data between ALL dropdown and DataFile do not match. VERIFICATION FAILED!!!");
			}

		}

	}
}
