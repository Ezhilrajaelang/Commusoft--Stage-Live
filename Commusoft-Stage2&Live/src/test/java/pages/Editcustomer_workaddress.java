package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import action.Wrapper;

public class Editcustomer_workaddress extends Wrapper {

	public Editcustomer_workaddress (WebDriver ldriver)
	{
		this.driver = ldriver;
	}



	public void View_customer()
	{
		click("//a [@id='Name']");
	}

	public void Editcustomer_link() throws InterruptedException
	{

		click("//a [@id='editcustomer']");
		Thread.sleep(3000);
	}
	public void Editcustomer_title() throws InterruptedException


	{
		click ("//select [@id='title']");
		Thread.sleep(3000);
		click("//option [text() = 'Mr & Mrs']");
	}
	public void Editcustomer_Name()
	{
		clear("//input [@id='name']");
		type("//input [@id='name']", "Testing ");
	}

	public void Editcustomer_SurName()
	{
		clear("//input [@name='customerDetails.surname']");
		type("//input [@name='customerDetails.surname']", "Customer");
	}
	public void Editcustomer_Mobile()
	{
		clear("//input [@name='customerMobileNumber']");
		type("//input [@name='customerMobileNumber']", "8056179594");
	}
	public void Editcustomer_email()
	{
		clear("//input [@name='customerEmail']");
		type("//input [@name='customerEmail']", "Balasubramanyan@commusoft.com");
	}
	public void Editcustomer_AddressLine1()
	{
		type("//input [@name='addressline1']", "Peninsula Square, London");
	}
	public void Editcustomer_Save()
	{
		click("//button [@class='btn btn-primary loading_btn save_btn']");
	}


	public void EditWorkaddress_view()
	{
		click ("//span [text() = 'View']");
	}

	public void Edit_workaddress()
	{
		click("//span [text() = 'Edit work address']");
		//click("//span[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/section/div/div/div[1]/div/section[2]/div[1]/a/span]");

	}

	public void Edit_WAtitle()
	{
		//click("#title");
		Select value = new Select(driver.findElement(By.id("title")));
		value.selectByValue("3");

	}

	public void Edit_waname()
	{
		click("#name");
		clear ("$customerDetails.name");
		type("#name", "Update");

	}
	public void Edit_wasurname()
	{
		clear ("$customerDetails.surname");
		type("$customerDetails.surname"," name");

	}

	public void Edit_walandline()
	{

		clear("$customerLandlineNumber");
		type("$customerLandlineNumber","04426120526");

	}

	public void Edit_wamobile()

	{
		clear("$customerMobileNumber");	
		type("$customerMobileNumber","9789929937");

	}

	public void Edit_waemail()

	{
		clear ("$customerEmail");
		type  ("$customerEmail","ezhilraja@commusoft.com");

	}

	public void Edit_waaddress1()
	{
		clear("$addressline1");
		type("$addressline1","Demo1");
	}

	public void Edit_wasavebutton()
	{
		click("//button [@class='btn btn-primary loading_btn save_btn']");

	}

	public void Edit_WAcompanyname()
	{
		click("$customerDetails.companyname");
		clear ("$customerDetails.companyname");
		type("$customerDetails.companyname", "WA as company");

	}
	

}






