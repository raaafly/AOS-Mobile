import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\1277\\Documents\\advantage-demo-v3.2.apk', false)

'TAP SIDEBAR ICON'
Mobile.tap(findTestObject('Object Repository/LANDING_SCREEN/BUTTON_ICON_SIDEBAR'), 30, FailureHandling.STOP_ON_FAILURE)

'TAP MENU LOGIN'
Mobile.tap(findTestObject('Object Repository/LANDING_SCREEN/SIDEBAR/MENU_LOGIN'), 30, FailureHandling.STOP_ON_FAILURE)

'TAP TEXT SIGN UP TODAY'
Mobile.tap(findTestObject('Object Repository/LOGIN_SCREEN/TEXT_SIGN_UP_TODAY'), 30, FailureHandling.STOP_ON_FAILURE)

// Account Detail Form Section
'INPUT USERNAME FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_USERNAME'), username, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT EMAIL FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_EMAIL'), email, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT PASSWORD FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_PASSWORD'), password, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT CONFIRM PASSWORD FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_CONFIRM_PASSWORD'), confirmPassword, 30, FailureHandling.STOP_ON_FAILURE)

// Trigger to scroll
Mobile.scrollToText("CITY")

// Personal Details Form Section
'INPUT FIRST NAME FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_FIRST_NAME'), firstName, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT LAST NAME FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_LAST_NAME'), lastName, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT PHONE NUMBER FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_PHONE_NUMBER'), phoneNumber, 30, FailureHandling.STOP_ON_FAILURE)

// Address Form Section
'SELECT COUNTRY FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSelectListItemByLabel'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_COUNTRY'),
	findTestObject('Object Repository/REGISTER_SCREEN/LIST_COUNTRY'), country, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT STATE FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_STATE'), state, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT ADDRESS FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_ADDRESS'), address, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT CITY FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_CITY'), city, 30, FailureHandling.STOP_ON_FAILURE)

'INPUT ZIP FIELD'
CustomKeywords.'aosmobile.Utils.tapAndSetText'(findTestObject('Object Repository/REGISTER_SCREEN/FIELD_ZIP'), zipCode, 30, FailureHandling.STOP_ON_FAILURE)

'CHECK THE AGREEMENT'
Mobile.checkElement(findTestObject('Object Repository/REGISTER_SCREEN/CHECKBOX_AGREEMENT'), 30, FailureHandling.STOP_ON_FAILURE)

'TAP BUTTON REGISTER'
Mobile.tap(findTestObject('Object Repository/REGISTER_SCREEN/BUTTON_REGISTER'), 30, FailureHandling.STOP_ON_FAILURE)

'ACTUAL RESULT'
Mobile.tap(findTestObject('Object Repository/LANDING_SCREEN/BUTTON_ICON_SIDEBAR'), 60, FailureHandling.STOP_ON_FAILURE)
Mobile.verifyElementVisible(findTestObject('Object Repository/LANDING_SCREEN/SIDEBAR/TEXT_USERNAME_LOGGED_IN', [('isUsername'): username]), 30, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()