package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Property_search extends Wrapper {
	
	public String Customer_AccountNo;
	public String WorkAddress_AccountNo;
	public String Company_AccountNo;
	public String WAasCompany_AccountNo;
	public Property_search(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	
	public void Customer_AccountNo()
	{
		String Customer_AccountNo = gettext("//span[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[2]/div[1]/span[2]");
	}

	public void search_customer()
	{
		clear ("$q");
		type("$q", Customer_AccountNo);
		typeenter("$q");
	}

	public void click_customer()

	{
       click("//a[@id=\"top-table\"]/table/tbody/tr/td[1]/span/a");
	}
	
	public void WorkAddress_AccountNo()
	{
		String WorkAddress_AccountNo = gettext("//span[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/section/div/div/div[1]/div/section[2]/div[2]/div/div/div[1]/div/div[2]/div[1]/span[2]");
	}
	public void search_workaddress()
	{
		clear ("$q");
		type("$q", WorkAddress_AccountNo);
		typeenter("$q");
	}

	public void click_workaddress()

	{
		click("//a[@id=\"top-table\"]/table/tbody/tr/td[1]/span/a");
	}
	
	public void Company_AccountNo()
	{
		String Company_AccountNo = gettext("//span[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[2]/div[1]/span[2]");
	}
	public void search_company()
	{
		clear ("$q");
		type("$q",Company_AccountNo);
		typeenter("$q");
	}
	public void click_company()
	{
		click("//a[@id=\"top-table\"]/table/tbody/tr/td[1]/span/a");
	}
	
	public void WAasCompany_AccountNo()
	{
		String WAasCompany_AccountNo = gettext("//span[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[2]/div[1]/span[2]");
	}
	public void search_WA_as_company()
	{
		clear ("$q");
		type("$q",WAasCompany_AccountNo);
		typeenter("$q");
	}
	public void click_WA_as_company()
	{
		click("//a[@id=\"top-table\"]/table/tbody/tr/td[1]/span/a");
	}
	
	

}
