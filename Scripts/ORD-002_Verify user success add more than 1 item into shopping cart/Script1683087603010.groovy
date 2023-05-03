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

Mobile.startApplication('D:\\01 Tiket on Progress\\Surplus_base.apk', false)

Mobile.tap(findTestObject('Order to delivery/Search Bar Home - Field'), 0)

Mobile.setText(findTestObject('Order to delivery/Search Bar History - Field'), 'Puding', 0)

Mobile.tap(findTestObject('Order to delivery/Searh Icon - Button'), 0)

Mobile.tap(findTestObject('Order to delivery/First Shop - List Group'), 0)

Mobile.tap(findTestObject('Order to delivery/Pesan - Button'), 0)

for (def index : (0..3)) {
    Mobile.tap(findTestObject('Order to delivery/Plus Product - Button'), 0)
}

Mobile.tap(findTestObject('Order to delivery/Tambahkan - Button'), 0)

for (def index : (0..2)) {
    Mobile.pressBack()
}

Mobile.tap(findTestObject('Order to delivery/Cart Image - Button'), 0)

Mobile.verifyElementVisible(findTestObject('Order to delivery/Qty Check - Text'), 0)

