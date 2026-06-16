package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRepoetUtility {
	public static final ExtentReports extentReports = new ExtentReports();// Creates a new object of ExtentReports
	// class.

public synchronized static ExtentReports createExtentReports() {// Method to create and configure the ExtentReports
// object.

ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");// create report
								// file.
reporter.config().setReportName("7RMartSupermarketProject");// Set report title/name
extentReports.attachReporter(reporter);// Attach reporter to extentReports.

extentReports.setSystemInfo("Organization", "Obsqura");// add organization information to the report
extentReports.setSystemInfo("Name", "Jerin"); // Add tester's name to the report
return extentReports;// return configured report object.

}

}
