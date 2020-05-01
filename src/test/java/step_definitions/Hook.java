package step_definitions;

import io.cucumber.java.After;
import utilities.Driver;

public class Hook {

    //@After imported from cucumber will work after the scenario steps are done. A hook.
    @After("@etsy")
    public void closingDriver(){
        Driver.quit();

    }

    @After("@etsy")
    public void randomMethod(){
        System.out.println("Random Print Out");
    }
}
