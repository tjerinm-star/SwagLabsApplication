package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {
	public void getScreenshot(WebDriver driver, String failedTestCase) throws IOException {// Methods to capture SS

		TakesScreenshot scrShot = (TakesScreenshot) driver;// Covert webDriver object to TakesScreenshot
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);// Capture the screenshot and store it as a file
																	// format.

		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());// Generate time stamp to make
																							// the file name unique.

		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");// create screenshot folder path
		if (!f1.exists()) { // check if the folder already exists or not

			f1.mkdirs();// create the folder if it does not exist
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
				+ ".png";// Create destination path with test name and time stamp.

		File finalDestination = new File(destination);// Create destination file object.
		FileHandler.copy(screenShot, finalDestination);// Copy the screenshot to the destination folder.
	}

}
