package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import static common.CommonAction.*;

public class HomePages {
	
	WebDriver driver;

	public HomePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3' ]")
	WebElement logo;
	
	public void clickLogo() {
		clickEliment(logo);
		
	}
	@FindBy(id = "cms-login-submit")
	WebElement loginButton;
	
	public void clickLoginButton() {
		pause(4000);
		clickEliment(loginButton);
		pause(4000);
	}
	
	@FindBy(name = "user-d")
	WebElement userId;
	
	public void clickUserId() {
		pause(4000);
		clickEliment(userId);
		pause(4000);
	}
	@FindBy(how = How.NAME, using = "pass-d")
	WebElement password;
public void clickPassword() {
	pause(5000);
	clickEliment(password);
	pause(5000);
}
public void inputTextInUserIdField	() {
	pause(5000);
	userId.sendKeys("May2024QA");
	pause(5000);
}

@FindBy(className = "cms-newuser-reg")
WebElement newUserRegistration;

public void newUserRegistration() {
	clickEliment(newUserRegistration);
}

@FindBy(linkText = "User ID")
WebElement forgotUserId;

public void forgotUserId() {
	pause(4000);
	clickEliment(forgotUserId);
	pause(4000);
}

@FindBy(partialLinkText = "Passwor")
WebElement forgotPassword;

public void forgotPassword() {
	pause(3000);
	clickEliment(forgotPassword);
	pause(3000);
}

// Web Element: Logo
// logo: class attribute value:  cms-icon cms-sprite-loggedout ms-3
// Exception 'InvalidSelectorException': 'Compound class names not permitted',
// so even if you see class value is unique but separated by space, 
// avoid this as class name locator, rather use css selector
// This scenario will show error and will failed everywhere
public void why_we_use_cssSelector_as_locator_in_logo () {
	driver.findElement(By.className("cms-icon cms-sprite-loggedout ms-3")).click();
}
//Web Element: New User Registration Button
	// Important: Use of cssSelector as locator
	// cssSelector is very important for interview
	// cssSelector by class --> inside the string, first put html tag, then dot, then write value of the class attribute 
	public void role1_use_of_cssSelector_by_class_name_value () {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();
	}
	
	// Important: Use of cssSelector as locator
		// Web Element: login Button
		// if you wanna create cssSelector by id 
		// first html tag, then # (hash), then write the value of id attribute inside the string
		public void role2_use_of_cssSelector_by_id_value() {
			driver.findElement(By.cssSelector("button#cms-login-submit")).click();
		}
		

		// Web Element: logo
		// Important: Use of cssSelector as locator
		// if the class (compound class) contain separate words [cms-icon cms-sprite-loggedout ms-3], 
		// they are actually different class, then
		// we have to close the gap between classes by putting the dot/period
		// cssSelector by class --> htmltag.class name value 
		// remove the space between words in class value, and replace with dot/period
		public void role3_use_of_cssSelector_by_compund_class_name_value () {
			driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3")).click();
		}
		
		// Use of cssSelector as locator
		// Web Element: login Button
		// high level, you can ignore
		// cssSelector by another attribute
		// --> htmltag[id/class/name attribute = 'value of the attribute' ] , in xpath - you use // and @, which is absent here 
		// and you can use any other attribute name except id and class
		public void role4_use_of_cssSelector_by_attribute_and_its_value () {
			driver.findElement(By.cssSelector("button[name='Submit Login']")).click();
			pause(3);
		}
		
		// Web Element: NUR Button
		// Not important, can ignore
		// cssSelector by another attribute
		// --> htmltag.value of class[id/class/name attribute = 'value of the attribute'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
		// That's why we use title
		public void role5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value() {
			driver.findElement(By.cssSelector("a.cms-newuser-reg[title='New User Registration']")).click();
			pause(3);
		}
		
		// Important: Use of cssSelector as locator
		// Web Element: login Button
		// Not important, can ignore
		// cssSelector by another attribute
		// --> htmltag#value of ID[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class	
		public void role6_use_of_cssSelector_by_id_value_and_attribute_and_its_value() {
			driver.findElement(By.cssSelector("button#cms-login-submit[title='Login']")).click();
			pause(3);
		}
		
		// Important: Use of tagName as locator
		// tag name: we have to go to Amazon and find "table" tag, which is unique
		
		// in cms portal not a single tag except header
		public void use_of_tagName_as_locator() {
			driver.findElement(By.tagName("header")).click();
		}
		// Web Element: logo
		// isDisplayed() method is boolean type, outcome: true or false
		// isDisplayed() is the method used to verify the presence of a web element within the web page.
		// Use of isDisplayed() available in --> image, link, button, text field, check box etc.
		public void use_of_isDisplayed_01() {
			boolean elementDisplayed = driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3")).isDisplayed();
			System.out.println("Is the Logo displayed? Ans: " + elementDisplayed);
		}
		
		public void use_of_isDisplayed_02() {
			boolean eDisplayed = logoByCssSelector.isDisplayed();
			System.out.println("Is the Logo displayed? Ans: " + eDisplayed);
		}

		// use of isDisplayed method inside our common actions --> elementDisplayed()
		public void use_of_isDisplayed_in_login () {
			elementDisplayed(userId); //newly added
			inputText(userId, "enthrall_12");
			pause(4000);
			elementDisplayed(password);
			inputText(password, "OnthrallTest@1234");
			pause(4000);
			elementDisplayed(termsAndCondition);
			clickEliment(termsAndCondition);
			pause(4000);
			clickEliment(loginButton);
			pause(4000);
		}
		public void use_of_isEnable_in_login () {
			elementDisplayed(userId); //newly added
			inputText(userId, "enthrall_12");
			pause(4000);
			elementDisplayed(password);
			inputText(password, "OnthrallTest@1234");
			pause(4000);
			elementDisplayed(termsAndCondition);
			clickEliment(termsAndCondition);
			pause(4000);
			elementEnable(loginButton);
			pause(4000);
		}
		public void use_of_isSelected_in_login () {
			elementDisplayed(userId); //newly added
			inputText(userId, "enthrall_12");
			pause(4000);
			elementDisplayed(password);
			inputText(password, "OnthrallTest@1234");
			pause(4000);
			elementSelected(termsAndCondition);
			clickEliment(termsAndCondition);
			pause(4000);
			elementEnable(loginButton);
			pause(4000);
		}
		
		
		public void getMethodOfThePage() {
		String actual = driver.getTitle();
		System.out.println("The title of page is:"+ actual);
		String expected = "CMS Enterprise Portal";
		Assert.assertEquals(actual,expected);
	
		//Assert.assertEquals(actual, expected +"not found");//why i can't add the text here like class
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		String expectedURL= "https://portal.cms.gov/portal/";
		Assert.assertEquals(currentURL, expectedURL, "The driver failed to direct at right URL");
		
		// use of getText() in "login button"
				String actualTextPresntInTheWebElement = loginButton.getText();
				System.out.println("Text Present as: " + actualTextPresntInTheWebElement);
				String expectedTextPresntInTheWebElement = "Login";
				Assert.assertEquals(actualTextPresntInTheWebElement, expectedTextPresntInTheWebElement, "The text present in the WebElement doesn't match");
		}
		// This is the first method used during automation framework
		// what is title?
		// what is the url?
		// is logo displayed?
		// here, method coming from common action
		public void newUserRegistrationPageValidation() {
			pause(3000);
			elementDisplayed(logo);
			verifyTitle(driver, "CMS Enterprise Portal");
			verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
			elementEnable(newUserRegistration);
			verifyTextOfTheWebElement(newUserRegistration, "New User Registration");
			clickEliment(newUserRegistration);
			pause(5000);
			verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
			verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		}

public void verifyTextOfTheWebElement(WebElement newUserRegistration2, String string) {
						
		}

// To Test implicitly wait
@FindBy(className = "-newuser-reg")
WebElement incorrectNewUserRegistration;

@FindBy(css = "em.cms-icon.cms-sprite-loggedout.ms-3")
WebElement logoByCssSelector;


@FindBy(xpath = "//label[@id='cms-label-tc']")
WebElement termsAndCondition;

public void termsAndCondition() {
	clickEliment(termsAndCondition);
}

//We are using 3 common actions here
public void inputTextInUserIdAndPasswordFieldThenIAgreeAndClickToTheLoginButton() {
		pause(4000);
		inputText(userId, "enthrall_12");
		inputText(password, "OnthrallTest@1234");
		pause(4000);
		clickEliment(termsAndCondition);
		pause(4000);
		clickEliment(loginButton);
		pause(4000);
	}
//Alternate of above method {Raw Code, some people use like this way}
	// We can use a web element directly in the method, that is also common
	// we don't need to create "webElement" and "common method"
	public void useOfByClassInLoginProcess() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.name("user-d")).sendKeys("enthrall_12");
		driver.findElement(By.name("pass-d")).sendKeys("OnthrallTest@1234");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@id='cms-label-tc']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(4000);
	}


}