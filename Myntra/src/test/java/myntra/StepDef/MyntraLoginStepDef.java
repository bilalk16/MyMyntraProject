package myntra.StepDef;

import static org.testng.Assert.fail;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myntra.Actions.MyntraLoginActions;
import myntra.Utilites.SetupDriver;

public class MyntraLoginStepDef {
	
	MyntraLoginActions loginAction = new MyntraLoginActions();
	
	@Given("^myntra login page is launched$")
	public void myntra_login_page_is_launched()  {
		loginAction.launchLoginPage();

		/*
		 * if (SetupDriver.driver.getTitle().toLowerCase().contains("login")) {
		 * System.out.println("mySuccessfylly launched login page for Myntra"); } else {
		 * System.out.println("my Myntra failed"); fail(); }
		 */
			
	} 

	@When("^user input right \"([^\"]*)\" and right \"([^\"]*)\"$")
	public void user_input_right_and_right(String Email, String password)  {
	    
		loginAction.inputEmail(Email);
		loginAction.inputPassword(password);
		loginAction.submit();
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully()  {
	    
		
	}

}

	

