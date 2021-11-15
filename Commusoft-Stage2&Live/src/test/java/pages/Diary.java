package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Diary extends Wrapper {
	public Diary(WebDriver ldriver)
	{
		this.driver = ldriver;
		ldriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void Diary_Module()
	{
		click("//a[text()='Diary']");
	}
	
	public void Diary_Daily()
	{
		try
		{
		click("//button[text()='Daily']");
		}catch(Exception e)
		{
			
		}
		
	}
	public void Diary_Today() throws InterruptedException
	{
		Thread.sleep(3000);
		try {
			click("//a[text()='Today']");
			Thread.sleep(3000);
			click("(//div[@class='fc-row fc-week fc-widget-content'])[2]");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			Thread.sleep(3000);
			click("(//a[@class='icon ss-navigateright'])[1]");
			Thread.sleep(3000);
			click("//a[text()='Today']");
			Thread.sleep(3000);
		}
	}
	public void Diary_PM() throws InterruptedException
	{
		click("(//div[@class='fc-row fc-week fc-widget-content'])[2]");
	}
	public void Diary_EventFromJob() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//button[@ng-click='saveDiaryEvent()']");
		//click("//span[//*[@id=\"side-panel\"]/section[1]/div/form/div[2]/div/button/span[1]]");
	}
	
	public void Diary_Timing()
	{
		click("(//td[@class=\"fc-widget-content\"])[10]");
	}
	public void Diary_Timing1()
	{
		click("(//td[@class=\"fc-widget-content\"])[11]");
	}
	public void Diary_Timing2()
	{
		click("(//td[@class=\"fc-widget-content\"])[13]");
	}
	public void Diary_Timing3()
	{
		click("(//td[@class=\"fc-widget-content\"])[15]");
	}
	public void Diary_Normal_EvenDescription()
	{
		type("//input[@name='description']", "Normal Event");
	}
	public void Diary_Save()  //used to click on save button on create diary event side panel
	{
		click("(//span[text()='Save'])[2]");
	}
	public void Diary_Estimate()
	{
		click("//a[text()='Estimate']");
	}
	public void Diary_job()
	{
		click("//a[text()='Job']");
	}
	public void Diary_propertysearch() throws InterruptedException
	{
		type("//input[@id='top-input-in-event-type']", "Ranjit");
		typeenter("//input[@id='top-input-in-event-type']");
		Thread.sleep(5000);
		click("(//input[@name='selected_property'])[1]");
		Thread.sleep(5000);
	}
	public void Diary_propertysearch(String name) throws InterruptedException
	{
		type("//input[@id='top-input-in-event-type']", name);
		typeenter("//input[@id='top-input-in-event-type']");
		Thread.sleep(5000);
		click("(//input[@name='selected_property'])[1]");
		Thread.sleep(5000);
	}
	public void Diary_Estimate_EventDescription()
	{
		selectdropdownvalue("//select[@ng-change='setEstimateDescription()']", "1");
	}
	public void Diary_Job_EventDescription()
	{
		selectdropdownvalue("//select[@name='description']", "1");
	}
	
	public void Diary_Monthly_view() throws InterruptedException
	{
	click("//button[text()='Monthly']");
	Thread.sleep(4000);
	}
	
	public void Diary_Monthly_Date()
	{
		try
		{
			click("//td[@class='fc-day-top fc-tue fc-today ']");
		}catch(Exception E)
		{
			try
			{
				click("(//td[@rowspan='3'])[6]");
			}
			catch(Exception q)
			{
				try
				{
					click("(//td[@rowspan='3'])[7]");
				}catch(Exception w)
				{
					try
					{
						click("(//td[@rowspan='3'])[8]");
					}catch(Exception e)
					{
						try
						{
							click("(//td[@rowspan='3'])[9]");
						}catch(Exception r)
						{
							try
							{
								click("(//td[@rowspan='3'])[10]");
							}catch(Exception j)
							{
								click("(//td[@rowspan='3'])[11]");	
							}
						}
					}
				}}}
						
	}
	public void Diary_currentdate_datepicker()
	{
		click("//span[@class='ss-calendar']");
		click("//a[@class='daterange-day ng-binding today']");
		
	}
	
	public void Diary_job_Add_Property()
	{
		//click("//*[@id=\"page-panel-main\"]/div[2]/div/section[1]/section[2]/div/div/div[2]/a");
		click("//a[@ng-click='addNewProperty(event_type)']");
		
	}
	public void Diary_TypesOfProperty_Customer()
	{
		selectdropdown("//select[@id='new-property-type-input']","Customer");
	}

	public void Diary_TypesOfCustomer()
	{
		selectdropdownvalue("//select[@ng-change='setCustomerType()']","0");
	}
	public String name(String name)
	{
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 name = name + date1;
		return name;
	}
	public void Diary_AddProperty_CustomerName()
	{
		type("//input[@ng-model='add_new_customer_inputs.first_name']",name("Customer-"));
	}
	public void Diary_AddProperty_CustomerSurName()
	{
		type("//input[@ng-model='add_new_customer_inputs.surname']","Diary");
	}
	public void Diary_AddProperty_CustomerSurName(String Surname)
	{
		type("//input[@ng-model='add_new_customer_inputs.surname']",Surname);
	}
	public void Diary_AddProperty_CustomerEmail()
	{
		type("//input[@ng-model='add_new_customer_inputs.email']","ranjit@commusoft.com");
	}
	public void Diary_AddProperty_CustomerEmail(String Email)
	{
		type("//input[@ng-model='add_new_customer_inputs.email']",Email);
	}
	public void Diary_AddProperty_CustomerAdd1()
	{
		type("//input[@ng-model='add_new_customer_inputs.addrs_1']","Madurai");
	}
	public void Diary_AddProperty_CustomerAdd1(String addrs1)
	{
		type("//input[@ng-model='add_new_customer_inputs.addrs_1']",addrs1);
	}
	public void Diary_AddProperty_CustomerSave() throws InterruptedException
	{
		click("//button[@ng-show=\"selected_customer_type == 'new_customer'\"]");
		Thread.sleep(15000);
	}
	
	//*******Work address adding in diary screen*****
	
	public void Diary_TypesOfProperty_WorkAddress()
	{
		selectdropdown("//select[@id='new-property-type-input']","Work address");
	}
	
	
	public void Diary_SearchCustomer_Add_WorkAddress()
	{
		click("//span[@//*[@id=\"s2id_selectCustomer\"]/a/span[1]");
		type("//input[@id=\"select2-drop\"]/div/input","Bala-");
		click("//span[@id=\"select2-drop\"]/ul/li[1]/div/span");
	}
	public String wa_name(String wa_name)
	{
		 SimpleDateFormat timeformat = new SimpleDateFormat("hh-mm");
		 Time time = new Time(totalTime);
		 String time1= timeformat.format(time);
		 wa_name = wa_name + time1;
		return wa_name;
	}
	public void Diary_AddProperty_WAName()
	{
		type("//input[@ng-model='add_new_work_address_inputs.first_name']",wa_name("work-"));
	}
	public void Diary_AddProperty_WASurName()
	{
		type("//input[@ng-model='add_new_work_address_inputs.surname']","Diary");
	}
	public void Diary_AddProperty_WASurName(String Surname)
	{
		type("//input[@ng-model='add_new_work_address_inputs.surname']",Surname);
	}
	public void Diary_AddProperty_WAEmail()
	{
		type("//input[@ng-model='add_new_work_address_inputs.email']","workaddress@commusoft.com");
	}
	public void Diary_AddProperty_WAEmail(String Email)
	{
		type("//input[@ng-model='add_new_work_address_inputs.email']",Email);
	}
	public void Diary_AddProperty_WAAdd1()
	{
		type("//input[@ng-model='add_new_work_address_inputs.addrs_1']","Trafalgar Sq");
	}
	public void Diary_AddProperty_WAAdd1(String address1)
	{
		type("//input[@ng-model='add_new_work_address_inputs.addrs_1']",address1);
	}
	public void Diary_AddProperty_WAAdd2()
	{
		type("//input[@ng-model='add_new_work_address_inputs.addrs_2']","London");
	}
	public void Diary_AddProperty_WAAdd2(String address2)
	{
		type("//input[@ng-model='add_new_work_address_inputs.addrs_2']",address2);
	}
	public void Diary_AddProperty_WASave() throws InterruptedException
	{
		click("//button[@ng-show=\"selected_property_type == 'work_address'\"]");
		Thread.sleep(15000);
	}
	
	//*********Adding company in diary screen ******//
	
	
	
	
	public void Diary_TypesOfCompany()
	{
		selectdropdownvalue("//select[@ng-change='setCustomerType()']","1");
	}
	public String companyname(String companyname)
	{
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 companyname = companyname + date1;
		return companyname;
	}
	public void Diary_AddProperty_CompanyName()
	{
		type("//input[@ng-model='add_new_company_inputs.company_name']",companyname("company-"));
	}
	public void Diary_AddProperty_CompanyAdd1()
	{
		type("//input[@ng-model='add_new_company_inputs.addrs_1']","Greater london");
	}
	public void Diary_AddProperty_CompanyAdd1(String addrs1)
	{
		type("//input[@ng-model='add_new_company_inputs.addrs_1']",addrs1);
	}
	public void Diary_AddProperty_CompanySave() throws InterruptedException
	{
		click("//button[@ng-show=\"selected_customer_type == 'new_company'\"]");
		Thread.sleep(15000);
	}
	
	
	public void Diary_PrintJobSheet() throws InterruptedException
	{
		click("//span[text()='Print job sheets']");
		Thread.sleep(1000);
		tab(Location);
	}
	public void Diary_PrintSummarySheet()
	{
		click("//span[text()='Print summary sheets']");
		String windowHandle1 = driver.getWindowHandle();
		driver.switchTo().window(windowHandle1);
	}

}
