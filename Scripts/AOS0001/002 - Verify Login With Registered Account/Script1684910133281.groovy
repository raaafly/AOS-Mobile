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

//Mobile.startApplication('C:\\Users\\1277\\Documents\\advantage-demo-v3.2.apk', true)

'TAP SIDEBAR ICON'
Mobile.tap(findTestObject('Object Repository/LANDING_SCREEN/BUTTON_ICON_SIDEBAR'), 30, FailureHandling.STOP_ON_FAILURE)

'TAP MENU LOGIN'
Mobile.tap(findTestObject('Object Repository/LANDING_SCREEN/SIDEBAR/MENU_LOGIN'), 30, FailureHandling.STOP_ON_FAILURE)

'TAP FIELD USERNAME'
Mobile.tap(findTestObject('Object Repository/LOGIN_SCREEN/EDITTEXT_USERNAME'), 30, FailureHandling.STOP_ON_FAILURE)

'INPUT FIELD PASSWORD'
Mobile.setText(findTestObject('Object Repository/LOGIN_SCREEN/EDITTEXT_USERNAME'), username, 30, FailureHandling.STOP_ON_FAILURE)

'TAP FIELD PASSWORD'
Mobile.tap(findTestObject('Object Repository/LOGIN_SCREEN/EDITTEXT_PASSWORD'), 30, FailureHandling.STOP_ON_FAILURE)

'INPUT FIELD PASSWORD'
Mobile.setText(findTestObject('Object Repository/LOGIN_SCREEN/EDITTEXT_PASSWORD'), password, 30, FailureHandling.STOP_ON_FAILURE)

'TAP BUTTON LOGIN'
Mobile.tap(findTestObject('Object Repository/LOGIN_SCREEN/BUTTON_LOGIN'), 30, FailureHandling.STOP_ON_FAILURE)

'HANDLE ALERT FACE RECOGNITION'
isElementExist = Mobile.verifyElementExist(findTestObject('Object Repository/LOGIN_SCREEN/POPUP/POPUP_FACE_RECOGNITION_CONFIRMATION'), 30, FailureHandling.OPTIONAL).value
if (isElementExist) {
	Mobile.tap(findTestObject('Object Repository/LOGIN_SCREEN/POPUP/BUTTON_NO'), 30, FailureHandling.STOP_ON_FAILURE)
}

'ACTUAL RESULT'
Mobile.tap(findTestObject('Object Repository/LANDING_SCREEN/BUTTON_ICON_SIDEBAR'), 30, FailureHandling.STOP_ON_FAILURE)
Mobile.verifyElementVisible(findTestObject('Object Repository/LANDING_SCREEN/SIDEBAR/TEXTVIEW_USERNAME_LOGGED_IN', [('isUsername'): username]), 30, FailureHandling.STOP_ON_FAILURE)

//Mobile.closeApplication()