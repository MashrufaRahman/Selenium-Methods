package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import reports.Loggers;

public class CommonAction {
	public static void clickEliment(WebElement element) {

		try {
			element.click();
			Loggers.logTheTest(element + "<-------> has been clicked");
		} catch (NoSuchElementException | NullPointerException e) {
			System.out.println("Element is:" + e);
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			// getMessage() Returns the detail message string of this throwable.
		}

	}

	// common method for sleep()
	public static void pause(long millis) {
		try {
			Thread.sleep(millis);
			Loggers.logTheTest("Sleeping ... zZz " + millis);
		} catch (InterruptedException e) {
			Loggers.logTheTest("Sleep interrupted because of" + e.getMessage());
		}

	}

	// common method for sendKeys
	public static void inputText(WebElement element, String input) {
		try {
			element.sendKeys(input);
			Loggers.logTheTest(input + "---has been put into---" + element);
		} catch (NoSuchElementException | NullPointerException e) {

		}
	}

	public static void elementDisplayed(WebElement element) {
		try {
			boolean flag = element.isDisplayed();
			Loggers.logTheTest(element + "isDisplayed" + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "isNotDisplayed" + e.getMessage());
		}
	}

	public static void elementEnable(WebElement element) {
		try {
			boolean flag = element.isEnabled();
			Loggers.logTheTest(element + "isEnable" + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "is not Enable" + e.getMessage());
		}
	}

	public static void elementSelected(WebElement element) {
		try {
			boolean flag = element.isSelected();
			Loggers.logTheTest(element + "isSelected" + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "is not Selected" + e.getMessage());
		}
	}

	public static void verifyTitle(WebDriver driver, String expectedTitle) {
		try {
			String actualTitle = driver.getTitle();
			Loggers.logTheTest("Actual Title is : " + actualTitle + " ---> And Expected Title is :" + expectedTitle);
			Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't match up");
		} catch (NullPointerException e) {
			Loggers.logTheTest("Driver is not initiated properly Or Title doesn't match up");
			Assert.fail();
		}
	}

	public static void verifyCurrentUrl(WebDriver driver, String expectedURL) {
		try {
			String currentURL = driver.getCurrentUrl();
			Loggers.logTheTest("Current URL : " + currentURL + ", Expected URL : " + expectedURL);
			Assert.assertEquals(currentURL, expectedURL, "Current URL is not correct");
		} catch (NullPointerException e) {
			Loggers.logTheTest("Driver is not initiated properly Or Current URL doesn't match");
			Assert.fail();
		}
	}

	public static void verifyTextOfTheWebElement(WebElement element, String expected) {
		try {
			String actual = element.getText();
			Loggers.logTheTest(element + " ---> Actual text : " + actual + ". Expected text : " + expected);
			Assert.assertEquals(actual, expected, "Text In the WebElement doesn't match");
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed or Text doesn't match\n" + e.getMessage());
		}
	}

	public static void clearTextFromTheField(WebElement element) {
		try {
			element.clear();
			Loggers.logTheTest("The Text from the " + element + " ---> is cleared");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	/*
	 * // common method for sendKeys() public static void inputText(WebElement
	 * element, String input) { try { element.sendKeys(input);
	 * Loggers.logTheTest(input + " <-----> has been put into <-----> " + element);
	 * } catch (NoSuchElementException | NullPointerException e) {
	 * Loggers.logTheTest(element +
	 * "<----------> has not been found becuase of ...\n" + e.getMessage() );
	 * 
	 * } } }
	 */
}
