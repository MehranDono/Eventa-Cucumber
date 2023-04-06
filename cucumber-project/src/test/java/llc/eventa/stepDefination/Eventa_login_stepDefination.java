package llc.eventa.stepDefination;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
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







        /** Common Steps For Our Gherkin **/
    @Given("^I open chrome browser$")
        public void i_open_chrome_browser()
        {
            System.out.println("I have opened Chrome !!!!!!!!!!!!!");
            Homepage.LaunchBrowser("chrome");
            PageA.ManageBrowserUtilities();
        }  
         
    
    @And("^I navigate to eventa landing page$")
	    public void i_navigate_to_eventa_landing_page() 
        {
		    System.out.println("######I land on eventa landing page#####");
		    Homepage.NavigateToUrl("https://www.eventa.llc"); // Driver 001 [ Chrome ] - go to eventa.llc
	    }


        /** Steps Code For Login.feature FIle's GHERKIN **/
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
