package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps {
	static WebDriver driver;
	
	@Given("user launch demo telecom applications")
	public void user_launch_demo_telecom_applications() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("http://www.demo.guru99.com/telecom/");
	   driver.manage().window();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("user enter all the fields")
	public void user_enter_all_the_fields() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.name("fname")).sendKeys("Gautam");
		driver.findElement(By.name("lname")).sendKeys("M");
		driver.findElement(By.id("email")).sendKeys("gautambe@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("potheri");
		driver.findElement(By.id("telephoneno")).sendKeys("7845506049");
		
		}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@Then("user verify customer id is generted")
	public void user_verify_customer_id_is_generted() {
		
	    WebElement equal = driver.findElement(By.xpath("(//table//tr//td)[3]"));
	    Assert.assertNotEquals(equal, "Please Note Down Your CustomerID");
}
	@When("user enter all the fields by one dim list concep")
	public void user_enter_all_the_fields_by_one_dim_list_concep(DataTable dataTable) {
		List<String> datas = dataTable.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.name("fname")).sendKeys(datas.get(0));
		driver.findElement(By.name("lname")).sendKeys(datas.get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
		
	}
	@When("user enter all the fields by one dim map concep")
	public void user_enter_all_the_fields_by_one_dim_map_concep(DataTable dataTable) {
		Map<String,String> datas =  dataTable.asMap(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.name("fname")).sendKeys(datas.get("fname"));
		driver.findElement(By.name("lname")).sendKeys(datas.get("lname"));
		driver.findElement(By.id("email")).sendKeys(datas.get("email"));
		driver.findElement(By.name("addr")).sendKeys(datas.get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phone"));
}

	@When("user enter all the fields by two dim list concep")
	public void user_enter_all_the_fields_by_two_dim_list_concep(DataTable dataTable) {
		
		List<List<String>> datas= dataTable.asLists(String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.name("fname")).sendKeys(datas.get(0).get(0));
		driver.findElement(By.name("lname")).sendKeys(datas.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(2).get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(3).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4).get(4));
}
	@When("user enter all the fields by two dim map concep")
	public void user_enter_all_the_fields_by_two_dim_map_concep(DataTable dataTable) {
		
		List<Map<String,String>> datas= dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.name("fname")).sendKeys(datas.get(1).get("fname"));
		driver.findElement(By.name("lname")).sendKeys(datas.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(datas.get(3).get("email"));
		driver.findElement(By.name("addr")).sendKeys(datas.get(2).get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(1).get("telephoneno"));
}
}
