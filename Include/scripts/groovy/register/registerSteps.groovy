package register
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



class registerSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("Open the app mobile")
	def openApp() {

		Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\mobileappv2\\app-release.apk', true)
	}

	@And("I click login icon")
	def clickLoginIcon() {

		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.Button'), 0)
	}

	@And("I click register")
	def clickRegis() {

		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.Button (1)'), 0)
	}

	@And("I input the fullname (.*) field")
	def inputFullname(String fullname) {
		println ("Fullname:" +fullname)
		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.EditText - Alex Under, Fullname'), 0)

		Mobile.clearText(findTestObject('Object Repository/Register.01/android.widget.EditText - Alex Under, Fullname (1)'), 0)
		
		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.EditText - Fullname'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Register.01/Fullname'), 'Oktaviani', 0)
	}

	@When("I input the email (.*) field")
	def inputEmail(String email) {
		println ("Email:" +email)
		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.EditText - alexemail.com, Email'), 0)
		
		Mobile.clearText(findTestObject('Object Repository/Register.01/android.widget.EditText - alexemail.com, Email (1)'), 0)
		
		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.EditText - Email'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Register.01/Email'), 'perpus@gmail.com', 0)
	}

	@And("I input the valid password (.*) field")
	def inputPass(String password) {
		println ("Password:" +password)
		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.EditText - 123123123, Password'), 0)
		
		Mobile.clearText(findTestObject('Object Repository/Register.01/android.widget.EditText - 123123123, Password (1)'), 0)
		
		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.EditText - Password'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Register.01/Password'), 'Intel', 0)
	}
	@Then("I click the register button1")
	def clickButton() {
		Mobile.tap(findTestObject('Object Repository/Register.01/android.widget.Button (2)'), 0)
	}
}