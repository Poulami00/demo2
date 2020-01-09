package stepDefinitons;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TagDemo1 {
	@Given("I launch app")
	public void i_launch_app() {
		System.out.println("i_launch_app");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("I register with valid data")
	public void i_register_with_valid_data() {
		System.out.println("I register with valid data"); 
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("application is working")
	public void application_is_working() {
		System.out.println("application is working");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("I provide vald data")
	public void i_provide_vald_data() {
		System.out.println("I provide vald data");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("I am placing order for my selected items")
	public void i_am_placing_order_for_my_selected_items() {
		System.out.println("I am placing order for my selected items");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("i cancel the order as it does not meet my expectations")
	public void i_cancel_the_order_as_it_does_not_meet_my_expectations() {
		System.out.println("i cancel the order as it does not meet my expectations");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}



}
