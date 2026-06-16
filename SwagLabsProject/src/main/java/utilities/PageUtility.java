package utilities;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	// DropDown()
		public void selectDropdownWithValue(WebElement element, String value) {

			Select object = new Select(element);
			object.selectByValue(value);

		}

		public void selectDropDownWithVisibleText(WebElement element, String text) {

			Select object = new Select(element);
			object.selectByVisibleText(text);
		}

		public void selectDropDownWithIndex1(WebElement element, int index) {
			Select object = new Select(element);
			object.selectByIndex(index);

		}

		public List<WebElement> getAllOptionsFromDropDown(WebElement element) {
			Select object = new Select(element);
			List<WebElement> options = object.getOptions();
			return options;
		}

		public void selectDropDownWithisMultiple(WebElement element) {
			Select object = new Select(element);
			boolean multiple = object.isMultiple();
			if (multiple) {
				object.selectByIndex(0);
				object.selectByIndex(1);
			}
		}

		public void deselectAllOptionsFromDropDown(WebElement element) {
			Select object = new Select(element);
			object.deselectAll();
		}

		public void deselectOptionFromDropDownWithValue(WebElement element, String value) {
			Select object = new Select(element);
			object.deselectByValue(value);
		}

		public void deselectOptionFromDropDownWithVisibleText(WebElement element, String text) {
			Select object = new Select(element);
			object.deselectByVisibleText(text);
		}

		public void deselectOptionFromDropDownWithIndex(WebElement element, int index) {
			Select object = new Select(element);
			object.deselectByIndex(index);
		}

		// RadioButton()
		public void selectRadioButton(WebElement element, String value) {
			element.click();
		}

		public void selectRadioButtonWithisSelected(WebElement element) {
			element.isSelected();
		}

		public void selectRadioButtonWithisDisplayed(WebElement element) {
			element.isDisplayed();

		}

		public void selectRadioButtonWithisEnabled(WebElement element) {
			element.isEnabled();
		}

		public void selectRadioButtonWithAttribute(WebElement element, String attribute, String value) {
			String attrValue = element.getAttribute(attribute);
			if (attrValue.equals(value)) {
				element.click();
			}
		}
		// CheckBox()

		public void selectCheckboxIfEnabled(WebElement element, String value) {
			element.click();
		}

		public void selectCheckBoxWithSelected(WebElement element) {
			element.isSelected();
		}

		public void selectCheckBoxWithisDisplayed(WebElement element) {
			element.isDisplayed();

		}

		public void selectCheckBoxWithisEnabled(WebElement element) {
			element.isEnabled();
		}

		public void selectCheckBoxWithAttribute(WebElement element, String attribute, String value) {
			String attrValue = element.getAttribute(attribute);
			if (attrValue.equals(value)) {
				element.click();

			}

		}

		// MouseActions()

		public void rightClickElement(WebElement element, WebDriver driver) {
			Actions action = new Actions(driver);
			action.contextClick(element).build().perform();
		}

		public void doubleClickElement(WebElement element, WebDriver driver) {
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
		}

		public void dragAndDropElement(WebElement source, WebElement target, WebDriver driver) {
			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).build().perform();
		}

		public void moveToElement(WebElement element, WebDriver driver) {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
		}

		// javaSrioptExecutor()
		// click on element
		public void clickOnElementWithJS(WebDriver driver, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}
		// scroll down

		public void scrollDownElement(WebDriver driver, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("windows.scrollBy(0,350);", element);
		}
		// scroll up

		public void scrollUpToElement(WebDriver driver, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-350);", element);
		}

	//alert using javaScriptExecutor
		public void acceptAlertWithJS(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert('This is an alert');");
			driver.switchTo().alert().accept();
		}
		// alert handling()

		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}

		public void dismissAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}

		public String getAlertText(WebDriver driver) {
			return driver.switchTo().alert().getText();
		}

		public void sendKeysToAlert(WebDriver driver, String text) {
			driver.switchTo().alert().sendKeys(text);
		}

		// frame handling

		public void switchToFrameByIndex(WebDriver driver, int index) {
			driver.switchTo().frame(index);
		}

		public void switchToFrameByNameOrId(WebDriver driver, String nameOrId) {
			driver.switchTo().frame(nameOrId);
		}

		public void switchToFrameByWebElement(WebDriver driver, WebElement element) {
			driver.switchTo().frame(element);
		}

		public void switchToDefaultContent(WebDriver driver) {
			driver.switchTo().defaultContent();
		}

		


}
