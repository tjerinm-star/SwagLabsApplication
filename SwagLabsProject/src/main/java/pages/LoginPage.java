package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement usernameField;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordField;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement siginButton;

	public void enterUserNameField(String username) {
		usernameField.sendKeys(username);
	}

	public void enterPasswordField(String password) {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() {
		siginButton.click();
	}

}
