package stepDefinitons;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JacksonInject.Value;

public class DemoWebShop {
	static WebDriver driver;
	static WebDriverWait wait; 
	@Given("User launches the DemoWebShop app")
	public void user_launches_the_DemoWebShop_app() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("http://demowebshop.tricentis.com/");
		
		
		driver.manage().window().maximize();
		
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on SignIn Button")
	public void user_clicks_on_SignIn_Button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	
	    //throw new cucumber.api.PendingException();
	}

	@Then("User provides the valid data for all the fields")
	public void user_provides_the_valid_data_for_all_the_fields() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label")).click();
		
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Poulami");
		
		driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Kushari");
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("poulami12345678901@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("poulami123");

		driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys("poulami123");
	
	
		
	    //throw new cucumber.api.PendingException();
	}

	@When("User clicks on Submit button at the end of the form")
	public void user_clicks_on_Submit_button_at_the_end_of_the_form() {
		driver.findElement(By.xpath("//*[@id='register-button']")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Verifies the result of the registration")
	public void verifies_the_result_of_the_registration() {
		//Assert.assertTrue(driver.findElement(By.xpath("")).equals("poulami123456789@gmail.com"));

		WebElement signin = driver.findElement(By.xpath(".//*[@class='account']")); 
		String Value = signin.getText(); 
		Assert.assertTrue(Value.contains("poulami12345678901@gmail.com"));
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}


	@Then("prints the message")
	public void prints_the_message() {
		
		driver.close();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Application launched by registered user")
	public void application_launched_by_registered_user() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("http://demowebshop.tricentis.com/");
		
		
		driver.manage().window().maximize();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User acess the Login link")
	public void user_acess_the_Login_link() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("provides the valid data as input")
	public void provides_the_valid_data_as_input() {
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("poulami123456789@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("poulami123");
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("verifies the login status")
	public void verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='account']")).equals("poulami123456789@gmail.com"));

		WebElement login = driver.findElement(By.xpath(".//*[@class='account']")); 
		String Value1=login.getText(); 
		Assert.assertTrue(Value1.contains("poulami123456789@gmail.com"));
	}



}
