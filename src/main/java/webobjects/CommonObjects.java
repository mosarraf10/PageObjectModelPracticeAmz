package webobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonObjects extends BasePage {

	public CommonObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "#twotabsearchtextbox")
	public WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}

	@FindBy(css = "#nav-search-submit-text")
	public WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}

	@FindBy(xpath = "//a[@id='nav-cart']")
	public WebElement cartButton;

	public WebElement getCartButton() {
		return cartButton;
	}

	@FindBy(css = "#searchDropdownBox")
	public List<WebElement> itemCategoryDropDown;

	public List<WebElement> getItemCategoryDropDown() {
		return itemCategoryDropDown;
	}

}
