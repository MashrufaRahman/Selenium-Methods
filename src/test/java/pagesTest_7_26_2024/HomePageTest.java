package pagesTest_7_26_2024;

import org.testng.annotations.Test;

import baseUtil_7_26_2024.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true, priority = 1)
	public void clickLogoTest() {
		homePages.clickLogo();

	}

	@Test(enabled = true, priority = 1)
	public void clickLoginButton() {
		homePages.clickLoginButton();

	}

	@Test(enabled = true, priority = 1)
	public void clickUserIdTest() {
		homePages.clickUserId();

	}

	@Test(enabled = true, priority = 1)
	public void clickPasswordTest() {
		homePages.clickPassword();

	}

	@Test
	public void inputTextInUserIdFieldTest() {
		homePages.inputTextInUserIdField();
	}

	@Test
	public void termsAndConditionTest() {
		homePages.termsAndCondition();
	}

	@Test
	public void inputTextInUserIdAndPasswordFieldThenIAgreeAndClickToTheLoginButton() {
		homePages.inputTextInUserIdAndPasswordFieldThenIAgreeAndClickToTheLoginButton();
	}
	//real time scenario without using common action class
	@Test
	public void useOfByClassInLoginProcessTest() throws InterruptedException {
		homePages.useOfByClassInLoginProcess();
		
	}
	
	@Test
	public void forgotUserIdTest() {
		homePages.forgotUserId();
	}
	@Test
	public void forgotPasswordTest() {
		homePages.forgotPassword();
	}
	@Test
	
	public void why_we_use_cssSelector_as_locator_in_logo_Test () {
		homePages.why_we_use_cssSelector_as_locator_in_logo();
	}
	
	@Test

	public void role1_use_of_cssSelector_by_class_name_value_Test () {
	homePages.role1_use_of_cssSelector_by_class_name_value();
	
}
	@Test
	public void role2_use_of_cssSelector_by_id_value_Test() {
		homePages.role2_use_of_cssSelector_by_id_value();
		
	}
		@Test
	public void role3_use_of_cssSelector_by_compund_class_name_value_Test () {
		homePages.role3_use_of_cssSelector_by_compund_class_name_value();
	}
	@Test
	public void role4_use_of_cssSelector_by_attribute_and_its_value_Test () {
		homePages.role4_use_of_cssSelector_by_attribute_and_its_value();
	}
	@Test
	public void role5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_valu_Test() {
		homePages.role5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value();
	}
	
	@Test
	public void role6_use_of_cssSelector_by_id_value_and_attribute_and_its_value_Test() {
		homePages.role6_use_of_cssSelector_by_id_value_and_attribute_and_its_value();
	}
	@Test
	public void use_of_tagName_as_locator_Test() {
		homePages.use_of_tagName_as_locator();
	}
	@Test
	public void use_of_isDisplayed_01_Test() {
		homePages.use_of_isDisplayed_01();
	}
	@Test
	public void use_of_isDisplayed_02_Test() {
		homePages.use_of_isDisplayed_01();
	}
	@Test
	public void use_of_isDisplayed_in_login_Test () {
		homePages.use_of_isDisplayed_in_login();
	}
	@Test
	public void use_of_isEnable_in_login_Test () {
		homePages.use_of_isEnable_in_login();
	}
	@Test
	
	public void use_of_isSelected_in_login_Test () {
		homePages.use_of_isSelected_in_login();
	}
	@Test
	public void getMethodOfThePageTest() {
		homePages.getMethodOfThePage();
	}
	@Test
	public void newUserRegistrationPageValidationTest() {
		homePages.getMethodOfThePage();
	}
// we are creating a branch, so brought changes
	@Test
	public void use_of_getAttribute_method_Test () {
		homePages.use_of_getAttribute_method();
	}
	@Test
	public void use_of_clear_in_login_Test() {
		homePages.use_of_clear_in_login();
	}

	
	
	
}
