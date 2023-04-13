package llc.eventa.stepDefination;




import org.junit.Assert;

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



    @Given("^user is on login page$")
    
        public void user_is_on_login_page() 
        {
            System.out.println("Navigating to Eventa homepage...............!!!!");
            
            homepage testHomepage = new homepage();
            pageActions pa = new pageActions();
            testHomepage.LaunchBrowser("chrome");
            testHomepage.NavigateToUrl("https://www.eventa.llc");
            pa.ManageBrowserUtilities();
            
            

        }
    @When("^user enters username and password$")
    public void user_enters_username_and_password()
    {
        System.out.println(">>>>>>> Login with Valid Credentials <<<<<<<<<<<<");
        testHomepage.login();
       
    }
        
    @Then("^user profile name is techno71$")
    public void user_profile_name_is_techno71()
    {
        System.out.println("I can see my name as Techno71 ... !!!!!!!!!!");
        Assert.assertEquals("Failed Profile Name is not found", testHomepage.validateProfileNameExist("Techno71"), true);
    }








}







