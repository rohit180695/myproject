package org.sdet40.LeadModuleTestNGTest;

import org.generic.BaseClass;
import org.sdet40.ObjectRepository.CreateNewLeadPage;
import org.sdet40.ObjectRepository.LeadInformationPage;
import org.sdet40.ObjectRepository.LeadPage;
import org.sdet40.ObjectRepository.TabNames;
import org.testng.annotations.Test;

public class CreateLeadsTest extends BaseClass {


	//private static final String LeadHomePage = null;
	@Test(groups="sanity")
	public CreateLeadsTest() {
		
		String expectedLeadFirstName=excelUtility.getDataFromExcel("Sheet4","FristName")+randomNumber;
		String expectedLeadLastName=excelUtility.getDataFromExcel("Sheet4","LastName")+randomNumber;
		//String PhoneNumber=excelUtility.getDataFromExcel("Lead", mtd.getName(),"phone");
		System.out.println(expectedLeadLastName);
		LeadPage LeadPage=new LeadPage(driver);
		CreateNewLeadPage createNewLeadPage=new CreateNewLeadPage(driver);
		LeadInformationPage LeadInformationPage=new LeadInformationPage(driver);
		commonPage.clickRequiredTab(TabNames.Leads, webDriverUtility);

		//CreateNewLeadPage.clickOnCreateNewLeadPageIcon();
		LeadPage.clickLeadButton();
		createNewLeadPage.CreateNewLeadPage(expectedLeadFirstName, expectedLeadLastName);
		String actualLastName=LeadInformationPage.getFristNameText();
		if(actualLastName.equals(actualLastName))
			webDriverUtility.verfyREsult(actualLastName, expectedLeadLastName);
		{
			System.out.println("Lead creared successfully---> TC is Pass");
		}	
	}	
}







