package org.sdet40.ObjectRepository;

public enum TabNames {
	Contacts("Contacts"), Opportunities("Opportunities"), Organizations("Organizations"),
	Email("Email"), Dashboad("Dashboad"), Signout("Sign Out"), More("More"), Leads("leads");
	
	private String tabName;
	private TabNames(String tabNames) {
		tabName=tabName;
	}
	public String getTabName() {
		return tabName;
	}

}
