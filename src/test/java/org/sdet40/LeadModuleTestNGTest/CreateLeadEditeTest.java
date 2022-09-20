package org.sdet40.LeadModuleTestNGTest;

import org.generic.BaseClass;
import org.sdet40.ObjectRepository.CreateNewLeadEditeTestPage;
import org.sdet40.ObjectRepository.CreateNewLeadPage;
import org.sdet40.ObjectRepository.LeadEditeTestPage;
import org.sdet40.ObjectRepository.LeadInformationPage;
import org.sdet40.ObjectRepository.LeadPage;
import org.sdet40.ObjectRepository.TabNames;

public class CreateLeadEditeTest extends BaseClass {
	String expectedLeadFirstName=excelUtility.getDataFromExcel("Sheet4","FristName")+randomNumber;
	String expectedLeadLastName=excelUtility.getDataFromExcel("Sheet4","LastName")+randomNumber;
	//String PhoneNumber=excelUtility.getDataFromExcel("Lead", mtd.getName(),"phone");
	//System.out.println(expectedLeadLastName);
	LeadPage LeadPage=new LeadPage(driver);
	CreateNewLeadPage createNewLeadPage=new CreateNewLeadPage(driver);
	LeadInformationPage LeadInformationPage=new LeadInformationPage(driver);
//	commonPage.clickRequiredTab(TabNames.Leads, webDriverUtility);
//
//	//CreateNewLeadPage.clickOnCreateNewLeadPageIcon();
//	LeadEditeTestPage.clickLeadEditeTestButton();
//	createNewLeadPage.CreateNewLeadPage(expectedLeadFirstName, expectedLeadLastName);
//
//	String actualFristName=LeadEditeTestInformationPage.getFristNameText();
//
//	String actualLastName=LeadEditeTestInformationPage.getFristNameText();
//	if(actualLastName.equals(actualLastName))
//		webDriverUtility.verfyREsult(actualLastName, expectedLeadLastName);
//	{
//		System.out.println("Lead creared successfully---> TC is Pass");
//	}	
}
