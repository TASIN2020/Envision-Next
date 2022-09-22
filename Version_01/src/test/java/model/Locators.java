	package model;
	
	import org.openqa.selenium.By;
	
	public class Locators {
		
		public static String homePageUrl = "https://app.envisionnext.net/#/"; 
		public static String homePageTitle = "Envision NEXT";
		
		//Login
		public static By EmailClick = By.xpath("//input[@id='username']");
		public static By enterEmail = By.xpath("//input[@id='username']");
		public static By enterPassword = By.xpath("//input[@id='password']");
		public static By loginButtonClick = By.xpath("//span[contains(text(),'Login')]");
		public static By loginConfirmation = By.xpath("//span[contains(text(),'Yes')]");
		
		//Patient Registration
		public static By hoverOnTools = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-whiteboard[1]/div[1]/ngx-split-button[1]/div[1]/button[1]");
		public static By toolsSelect = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-whiteboard[1]/div[1]/ngx-split-button[1]/div[1]/button[2]");
		public static By patientRegestration = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-whiteboard[1]/div[1]/ngx-split-button[1]/div[1]/ul[1]/li[1]/a[1]");
		public static By hnAutoGenerate = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-patient-registration[1]/form[1]/p-accordion[1]/div[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/div[1]/div[5]/div[1]/p-checkbox[1]/div[1]/div[2]");
		public static By firstName = By.xpath("//input[@id='Fname']");
		public static By lastName = By.xpath("//input[@id='Lname']");
		public static By patientAge = By.xpath("//input[@id='PatientAgeYear']");
		public static By patientSave = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-patient-registration[1]/form[1]/div[1]/div[1]/button[2]/span[2]");
		public static By patientIcon = By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-menu[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/i[1]");
		
		//Patient Appointment
		public static By appointment = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-patient-dashboard[1]/div[1]/div[2]/div[1]/div[1]/button[2]/span[2]");
		public static By timeSlot = By.xpath("//tbody/tr[29]/td[2]");
		public static By studyType = By.xpath("//body/jw-modal[@id='custom-modal-for-appointment']/div[1]/div[1]/div[1]/form[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/div[4]/div[6]/span[1]/p-dropdown[1]/div[1]/div[4]/span[1]");
		public static By selectStudy = By.xpath("//span[contains(text(),'EGD')]");
		public static By expandDoctorList = By.xpath("//body/jw-modal[@id='custom-modal-for-appointment']/div[1]/div[1]/div[1]/form[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/div[3]/div[3]/span[1]/p-dropdown[1]/div[1]/div[4]/span[1]");
		public static By writeDoctorName = By.xpath("//body/jw-modal[@id='custom-modal-for-appointment']/div[1]/div[1]/div[1]/form[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/div[3]/div[3]/span[1]/p-dropdown[1]/div[1]/div[5]/div[1]/input[1]");
		public static By doctorDemo = By.xpath("//body/jw-modal[@id='custom-modal-for-appointment']/div[1]/div[1]/div[1]/form[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/div[3]/div[3]/span[1]/p-dropdown[1]/div[1]/div[5]/div[2]/ul[1]/p-dropdownitem[1]/li[1]/span[1]");
		public static By saveAppointment = By.xpath("//body/jw-modal[@id='custom-modal-for-appointment']/div[1]/div[1]/div[1]/div[7]/p-button[2]/button[1]/span[2]");
		public static By studyTypeColonoscopy = By.xpath("//span[contains(text(),'Colonoscopy')]");
		
		//Imaging
		public static By imaging = By.xpath("//tbody/tr[1]/td[16]/div[1]/button[1]/span[1]");
		public static By imagingDropDown = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ris-capture[1]/app-image-capture[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/p-dropdown[1]/div[1]/div[4]/span[1]");
		public static By success = By.xpath("//span[contains(text(),'Success')]");
		public static By clickOnReporting = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ris-capture[1]/app-image-capture[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/p-button[1]/button[1]/span[1]");
		public static By uploadImage = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ris-capture[1]/app-image-capture[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p-fileupload[1]/div[1]/div[1]/span[1]/input[1]");
		public static By studyDropDown = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ris-capture[1]/app-image-capture[1]/div[1]/div[2]/div[2]/p-dropdown[1]/div[1]/div[4]/span[1]");
		//public static By studyColon = By.xpath("//span[contains(text(),'Colonoscopy')]");
		
		//Reporting
		public static By chooseButton = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[1]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p-fileupload[1]/div[1]/div[1]");
		public static By addAllToReport = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[1]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]");
		public static By addAllToReportConfirm = By.xpath("//body/jw-modal[@id='confirm-to-send-images-for-report']/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]");
		
		//Study Metrics
		public static By expandStudyMetrics = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[1]/a[1]/span[1]");
		public static By chiefComplaint = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/shared-chief-complaint-and-diagnosis-tab-view[1]/div[1]/div[1]/p-listbox[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]");
		public static By diagnosis = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/shared-chief-complaint-and-diagnosis-tab-view[1]/div[1]/div[2]/p-listbox[1]/div[1]/div[3]/ul[1]/li[13]/span[1]");
		public static By qualifier1 = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/shared-chief-complaint-and-diagnosis-tab-view[1]/div[1]/div[3]/p-listbox[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]");
		public static By qualifier2 = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/shared-chief-complaint-and-diagnosis-tab-view[1]/div[1]/div[3]/p-listbox[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]");
		public static By addStudyMetrics = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/shared-chief-complaint-and-diagnosis-tab-view[1]/div[2]/div[2]/p-button[1]/button[1]/span[1]");
		
		// Sedation
		public static By sedation = By.xpath("//span[contains(text(),'Sedation')]");
		public static By sedationNo = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/shared-sedation-tab-view[1]/div[1]/div[2]/div[1]/div[1]/p-togglebutton[1]/div[1]/span[2]");
		public static By sedativeAgentDropDown = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/shared-sedation-tab-view[1]/div[1]/div[2]/div[2]/div[2]/p-dropdown[1]/div[1]/div[4]/span[1]");
		public static By sedativeAgentPethidine = By.xpath("//span[contains(text(),'Pethidine')]");
		public static By sedativeAmount = By.xpath("//input[@id='lavel']");
		public static By addSedativeAgent = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/shared-sedation-tab-view[1]/div[1]/div[2]/div[2]/div[4]/button[1]/span[1]");
		public static By saveSedation = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/shared-sedation-tab-view[1]/div[1]/div[2]/div[5]/button[1]/span[1]");
		
		//Bowel Preparation
		public static By bowelPreparation = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/ul[1]/li[3]/a[1]/span[1]");
		public static By lc = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/ul[1]/li[3]/a[1]/span[1]");
		public static By lc1 = By.xpath("//tbody/tr[1]/td[3]/p-radiobutton[1]/div[1]/div[2]/span[1]");
		public static By tc = By.xpath("//tbody/tr[2]/td[2]/p-checkbox[1]/div[1]/div[2]");
		public static By tc1 = By.xpath("//tbody/tr[2]/td[4]/p-radiobutton[1]/div[1]/div[2]/span[1]");
		public static By rc = By.xpath("//tbody/tr[3]/td[2]/p-checkbox[1]/div[1]/div[2]");
		public static By rc1 = By.xpath("//tbody/tr[3]/td[5]/p-radiobutton[1]/div[1]/div[2]/span[1]");
		public static By agent = By.xpath("//tbody/tr[5]/td[2]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By agent1 = By.xpath("//tbody/tr[5]/td[2]/span[3]/p-checkbox[1]/div[1]/div[2]");
		public static By bowelPreparationSave = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[4]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[3]/div[1]/shared-bowel-preparation-tab-view[1]/div[1]/form[1]/div[3]/button[2]/span[1]");
		
		//Lesion Region (EGD)
		public static By esophagus = By.xpath("//span[contains(text(),'Esophagus')]");
		public static By reportAbnormal = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[3]/p-listbox[1]/div[1]/div[3]/ul[1]/li[2]/span[1]");
		public static By finding1 = By.xpath("//span[contains(text(),'Superficial lesion')]");
		public static By number1 = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[2]/p-listbox[1]/div[1]/div[3]/ul[1]/li[2]/span[1]");
		public static By size1 = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[3]/p-listbox[1]/div[1]/div[3]/ul[1]/li[3]/span[1]");
		public static By region1 = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[4]/p-listbox[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]");
		public static By region2 = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[5]/p-listbox[1]/div[1]/div[3]/ul[1]/li[3]/span[1]");
		
		//Lesion Region (Colonoscopy)
		public static By terminalIleum = By.xpath("//span[contains(text(),'Terminal ileum')]");
		public static By reportAbnormalColonoscopy = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[3]/p-listbox[1]/div[1]/div[3]/ul[1]/li[1]/span[1]");
		public static By finding1Mass = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/p-listbox[1]/div[1]/div[3]/ul[1]/li[1]/span[1]");
		public static By number2 = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[2]/p-listbox[1]/div[1]/div[3]/ul[1]/li[2]/span[1]");
		public static By size05 = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[3]/p-listbox[1]/div[1]/div[3]/ul[1]/li[2]/span[1]");
		public static By region1Diffused = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[4]/p-listbox[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]");
		
		// Findings DTL (EGD)
		public static By findingsDTL = By.xpath("//span[contains(text(),'Findings DTL')]");
		public static By elavated = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[2]/div[1]/div[2]/p-checkbox[1]/div[1]/div[2]");
		public static By excavated = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[2]/div[1]/div[3]/p-checkbox[1]/div[1]/div[2]");
		
		// Findings DTL (Colonoscopy)
		public static By activeBleedingNo = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[2]/div[1]/div[1]/p-checkbox[1]/div[1]/div[2]");
		public static By characterRound = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[2]/div[2]/div[1]/p-checkbox[1]/div[1]/div[2]");
		public static By characterIrregular = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[2]/div[2]/div[2]/p-checkbox[1]/div[1]/div[2]");
		
		//Intervention (EGD)
		public static By intervention = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[6]/div[1]/div[1]/p-selectbutton[1]/div[1]/div[4]/span[1]");
		public static By preInjection = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/div[2]/div[3]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By emrValue = By.xpath("//body/jw-modal[@id='rpt-text-value-popup']/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/input[1]");
		public static By emrValueSave = By.xpath("//body/jw-modal[@id='rpt-text-value-popup']/div[1]/div[1]/div[1]/div[4]/button[2]/span[2]");
		public static By samplingTypeBiopsy = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/div[3]/div[3]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By clippingTypeTTS = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/div[4]/div[3]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By comment = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[2]/ckeditor[1]/div[2]/div[2]/div[1]");
		
		//Intervention (Colonoscopy)
		public static By samplingTypeBiopsyColon = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/div[2]/div[3]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By piecemeal = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/div[2]/div[5]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By resultFailure = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/div[3]/div[10]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By contactThermalTherapyDevice = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/div[4]/div[3]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By deviceResutSuccess = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/div[1]/div[4]/div[6]/span[1]/p-checkbox[1]/div[1]/div[2]");
		
		//Complication (EGD)
		public static By complication = By.xpath("//span[contains(text(),'Complication')]");
		public static By complicationNo = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/complication-report[1]/div[1]/div[3]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By complicationYes = By.className("ui-button-icon-left ui-clickable pi pi-check");
		
		//Complication (Colonoscopy)
		public static By comlicationNo = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/complication-report[1]/div[1]/div[3]/span[1]/p-checkbox[1]/div[1]/div[2]");
		public static By complicationTypeBleeding = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[9]/div[1]/complication-report[1]/div[1]/div[6]/span[1]/p-checkbox[1]/div[1]/div[2]");
		
		//Report Save
		public static By reportConfirm = By.xpath("//body/jw-modal[@id='confirm-reporting-sediation-modal']/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]");
		public static By reportSave = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[6]/div[1]/div[2]/div[1]/p-button[1]/button[1]/span[2]");
		
		//Report Confirm
		public static By reportApprove = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[6]/div[1]/div[2]/div[1]/p-button[2]/button[1]/span[1]");
		public static By reportSedationYes = By.xpath("//body/jw-modal[@id='confirm-reporting-sediation-modal']/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]");
		
		//Preview Report
		public static By previewReport = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[6]/div[1]/div[2]/button[2]/span[1]");
		public static By reportClose = By.xpath("//body/jw-modal[@id='custom-modal-for-endo-report-in-ris']/div[1]/div[1]/span[1]");
		
		//Switch to another study type
		public static By reportSwitch = By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/ris-result[1]/app-ris-five-reporting[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[3]/p-inputswitch[1]/div[1]/span[1]");
		public static By confirmSwitch = By.xpath("//body/jw-modal[@id='confirm-to-change-study']/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]");
		
		//Go to White board
		public static By goToWhiteboard = By.xpath("//span[contains(text(),'Go to Whiteboard')]");
		
		// Go to Completed
		public static By goToCompleted = By.xpath("//span[contains(text(),'Completed')]");
		
		// Logout
		public static By testAutomation = By.xpath("//h3[contains(text(),'Test Automation')]");
		public static By signOut = By.xpath("//button[contains(text(),'Sign Out')]");
		
		
		
	}

