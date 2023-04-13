package llc.eventa.stepDefination;




import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import llc.eventa.PageObjectModel.homepage;
import llc.eventa.PageObjectModel.pageActions;


public class Manual_Login_StepDefination
{
        //Global Variables and objects
        pageActions pa = new pageActions();
        homepage testHomepage = new homepage();
        
    @After
            public void teardown()
            {
                System.out.println(".......... I am Tearing Down browsers ...............");
                testHomepage.CloseBrowser();
            }

    @Before
            public void browserSetup()
            {
                testHomepage.LaunchBrowser("chrome");
                pa.ManageBrowserUtilities();
            }




    @Given("^user is on landing page$")
        public void user_is_on_landing_page() 
        {
            System.out.println("Navigating to Eventa homepage...............!!!!");
            testHomepage.NavigateToUrl("https://www.eventa.llc");
            
        }

    @When("^user enters username and password$")
        public void user_enters_username_and_password()
    {
        System.out.println(">>>>>>> Login with Valid Credentials <<<<<<<<<<<<");
        testHomepage.login();
       
    }
        
    @Then("^user profile name is techno$")
        public void user_profile_name_is_techno()
    {
        System.out.println("I can see my name as Techno ... !!!!!!!!!!");
        Assert.assertEquals("Failed Profile Name is not found", testHomepage.validateProfileNameExist("Techno"), true);
    }








}







