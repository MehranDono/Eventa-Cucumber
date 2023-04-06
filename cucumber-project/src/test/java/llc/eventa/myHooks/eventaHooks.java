package llc.eventa.myHooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import llc.eventa.PageObjectModel.homepage;
import llc.eventa.PageObjectModel.pageActions;

public class eventaHooks extends pageActions 
{
    homepage Homepage;
    pageActions PageA;
    WebDriver driver;




    

    @After
    public void rampDown() 
    {
        driver.quit();
    }


}
