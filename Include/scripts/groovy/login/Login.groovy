package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigates to login page")
	def navigateToLoginPage() {
		Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\mobileappv2\\app-release.apk', true)

		Mobile.tap(findTestObject('Object Repository/Login.01/android.widget.Button'), 0)
	}

	@When("User input (.*) (.*)")
	def inputCredentials(String Email, String password) {
		println("Email:" +Email)
		println("Password:" +password)
		Mobile.tap(findTestObject('Object Repository/Login.01/android.widget.EditText - Email'), 0)

		Mobile.setText(findTestObject('Object Repository/Login.01/android.widget.EditText - Email (1)'), 'sarah123@gmail.com', 0)

		Mobile.tap(findTestObject('Object Repository/Login.01/android.widget.EditText - Password'), 0)

		Mobile.setText(findTestObject('Object Repository/Login.01/android.widget.EditText - Password (1)'), 'Windows15', 0)
	}

	@And("User click button login")
	def clickLogin() {
		Mobile.tap(findTestObject('Object Repository/Login.01/android.widget.Button (1)'), 0)

	}
}