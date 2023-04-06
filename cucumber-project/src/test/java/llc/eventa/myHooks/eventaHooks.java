package llc.eventa.myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import llc.eventa.PageObjectModel.homepage;
import llc.eventa.PageObjectModel.pageActions;

public class eventaHooks extends pageActions 
{
    homepage Homepage;
    pageActions PageA;    



    @Before
    public void I_open_chrome_browser() 
    {
        System.out.println("I have opened Chrome !!!!!!!!!!!!!");
        Homepage.LaunchBrowser("chrome");
        PageA.ManageBrowserUtilities();
    }

    @After
    public void CloseBrowser() 
    {
        driver.quit();
    }


}
