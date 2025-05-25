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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://codenboxautomationlab.com/registration-form/')

WebUI.setText(findTestObject('Object Repository/Registration Page/Page_Registration Form - CodenBox AutomationLab/input__fname'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Registration Page/Page_Registration Form - CodenBox AutomationLab/input__lname'), 
    '111')

WebUI.setText(findTestObject('Object Repository/Registration Page/Page_Registration Form - CodenBox AutomationLab/input__email'), 
    'test@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Page/Page_Registration Form - CodenBox AutomationLab/select_QA foundation Agile SQL Manual API W_e57f8b'), 
    'cypress-automation', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Page/Page_Registration Form - CodenBox AutomationLab/select_JanuaryFebruary MarchAprilMayJuneJul_1e76f9'), 
    'september', true)

WebUI.click(findTestObject('Object Repository/Registration Page/Page_Registration Form - CodenBox AutomationLab/label_Facebook'))

WebUI.click(findTestObject('Object Repository/Registration Page/Page_Registration Form - CodenBox AutomationLab/input__nf-field-15'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration Page/Page_Registration Form - CodenBox AutomationLab/p_Your registration is completed. We will c_b0a12a'), 
    0)

WebUI.closeBrowser()

