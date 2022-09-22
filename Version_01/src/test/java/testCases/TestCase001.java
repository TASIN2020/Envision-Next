package testCases;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

public class TestCase001 {
	
// Test case001 is for a Single Study Type (EGD)
	
	Base base = new Base();
	WebDriver driver = base.setup();
	CommonMethods commonMethods = new CommonMethods(driver);
	HomePage homePage  = new HomePage(driver);
	Timeout time = new Timeout();
	
	@BeforeClass
	public void start() {
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();		
	}
	
	@Test
	public void loginTest() {
		
		assertEquals(commonMethods.getTitle(), Locators.homePageTitle);
		time.timeout1();
		
		
		//Login Section
		commonMethods.sendText(Locators.enterEmail, "Test_Automation");
		time.timeout1();
		
		commonMethods.sendText(Locators.enterPassword, "123456");
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.loginButtonClick);
		time.timeout1();
		time.timeout();
		
		// Patient Registration
		commonMethods.hoverOnButton(Locators.hoverOnTools);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.toolsSelect);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.patientRegestration);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.hnAutoGenerate);
		time.timeout1();
		
		commonMethods.sendText(Locators.firstName, "Test");
		time.timeout1();
		
		commonMethods.sendText(Locators.lastName, "Automation");
		time.timeout1();
		
		commonMethods.sendText(Locators.patientAge, "20");
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.patientSave);
		time.timeout();
		time.timeout();
		
		commonMethods.clickOnButton(Locators.appointment);
		time.timeout();
		time.timeout();
		time.timeout();
		time.timeout();
		
		commonMethods.clickOnButton(Locators.timeSlot);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.studyType);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.selectStudy);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.expandDoctorList);
		time.timeout1();
		
		commonMethods.sendText(Locators.writeDoctorName, "Doctor Demo");
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.doctorDemo);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.saveAppointment);
		time.timeout();
		time.timeout();
		
		//Imaging
		commonMethods.clickOnButton(Locators.imaging);
		time.timeout();
		
		commonMethods.sendText(Locators.uploadImage, "C:\\Users\\Hp\\Desktop\\Normal\\Normal\\Colonoscope\\1.JPG");
		time.timeout();
		time.timeout();
		
		commonMethods.sendText(Locators.uploadImage, "C:\\Users\\Hp\\Desktop\\Normal\\Normal\\Colonoscope\\2.JPG");
		time.timeout();
		time.timeout();
		
		commonMethods.sendText(Locators.uploadImage, "C:\\Users\\Hp\\Desktop\\Normal\\Normal\\Colonoscope\\3.JPG");
		time.timeout();
		time.timeout();
		
		commonMethods.clickOnButton(Locators.imagingDropDown);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.success);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.clickOnReporting);
		time.timeout();
		time.timeout();
		time.timeout();
		
		//Reporting
		
		// Add all images to the Report
		commonMethods.clickOnButton(Locators.addAllToReport);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.addAllToReportConfirm);
		time.timeout();
		
		
		//Study Metrics
		commonMethods.clickOnButton(Locators.expandStudyMetrics);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.chiefComplaint);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.diagnosis);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.qualifier1);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.qualifier2);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.addStudyMetrics);
		time.timeout();
		
		//Lesion Region
		commonMethods.clickOnButton(Locators.esophagus);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.reportAbnormal);
		time.timeout();
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.finding1);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.number1);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.size1);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.region1);
		time.timeout1();
		
		//Findings DTL
		commonMethods.clickOnButton(Locators.findingsDTL);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.elavated);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.excavated);
		time.timeout1();
		
		//Intervention
		commonMethods.clickOnButton(Locators.intervention);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.preInjection);
		time.timeout1();
		
		commonMethods.sendText(Locators.emrValue, "1");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.emrValueSave);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.samplingTypeBiopsy);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.clippingTypeTTS);
		time.timeout1();
		
		commonMethods.sendText(Locators.comment, "The patient should take medicine regularly");
		time.timeout1();
		
		//Complication
		commonMethods.clickOnButton(Locators.complication);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.complicationNo);
		time.timeout();
		
		//Report Save
		commonMethods.clickOnButton(Locators.reportSave);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.reportConfirm);
		time.timeout();
		
		//Report Confirm
		commonMethods.clickOnButton(Locators.reportApprove);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.reportSedationYes);
		time.timeout();
		
		//Preview Report
		commonMethods.clickOnButton(Locators.previewReport);
		time.timeout();
		time.timeout();
		
		commonMethods.clickOnButton(Locators.reportClose);
		time.timeout();
		
		//Scroll up to the top
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1500)", "");
		time.timeout();
		
		//Go to White board
		commonMethods.clickOnButton(Locators.goToWhiteboard);
		time.timeout();
		
		// Go to Completed
		commonMethods.clickOnButton(Locators.goToCompleted);
		time.timeout();
		
		// Logout
		commonMethods.clickOnButton(Locators.testAutomation);
		time.timeout1();
		
		commonMethods.clickOnButton(Locators.signOut);
		time.timeout();
		
		
		
		//Driver Close
		base.tearDown();
		
	}
	
	
}
