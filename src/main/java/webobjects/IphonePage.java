package webobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphonePage extends BasePage{

	public IphonePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "(//*[contains(@class,'shopNow--caretRight')])[1]")
	public WebElement shopNowButton;
	
	public WebElement getShopNowButton() {
		return shopNowButton;
	}

}
