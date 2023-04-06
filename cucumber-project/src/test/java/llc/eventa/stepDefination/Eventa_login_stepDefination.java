package llc.eventa.stepDefination;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import llc.eventa.PageObjectModel.homepage;
import llc.eventa.PageObjectModel.pageActions;

public class Eventa_login_stepDefination {
    






    //Global Variables and objects
    homepage Homepage;
    pageActions PageA;
    WebDriver driver;








    /*@Before("@openChrome")
        public void I_open_chrome_browser()
        {
            System.out.println("I have opened Chrome !!!!!!!!!!!!!");
            Homepage.LaunchBrowser("chrome");
            PageA.ManageBrowserUtilities();
        }  */
         
    
    @Given("^I land on eventa landing page$")
	    public void i_land_on_eventa_landing_page() 
        {
		    System.out.println("######I land on eventa landing page#####");
		    Homepage.NavigateToUrl("https://www.eventa.llc"); // Driver 001 [ Chrome ] - go to eventa.llc
	    }

    @When("^I type in username and password$")
        public void i_type_in_username_and_password()
        {
            System.out.println("######Typing in username and password#####");
            Homepage.login();
        }
    @Then("I expect to see matching username")
        public void i_excepct_to_see_matching_username()
        {
            System.out.println("######I expect to username as Techno#####");
            Homepage.validateProfileNameExist("Techno");
        }

  
}
