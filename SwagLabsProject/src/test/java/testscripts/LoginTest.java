package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(priority = 1, description = "Validating user login with valid credentials", groups = "smoke")
	public void verifyUserIsAbleToLoginWithValidCridential() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameField(username);
		loginpage.enterPasswordField(password);
		loginpage.clickLoginButton();
	}

	@Test(priority = 2, description = "Validating user is  unable login with Invalid password")
	public void verifyUserIsNotAbleToLoginWithInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameField(username);
		loginpage.enterPasswordField(password);
		loginpage.clickLoginButton();
	}

	@Test(priority = 3, description = "Validating user unable to Login with Invalid username")
	public void verifyUserIsNotAbleToLoginWithInvalidUsername() throws IOException {
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameField(username);
		loginpage.enterPasswordField(password);
		loginpage.clickLoginButton();
	}

	@Test(priority = 4, description = "Validating  user is unable to login inavlid credentials", groups = "smoke")

	public void verifyUserIsNotAbleToLoginWithInvalidCridential() throws IOException {
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameField(username);
		loginpage.enterPasswordField(password);
		loginpage.clickLoginButton();

	}

}
