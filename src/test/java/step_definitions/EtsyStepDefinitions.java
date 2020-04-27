package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.Driver;

public class EtsyStepDefinitions {

    @Given("I am on the etsy homepage")
    public void i_am_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com/");
    }

    @When("I click on {string}")
    public void i_click_on_Clothing_Shoes(String submodule) {
        if(submodule.equals("Clothing & Shoes")) {
            Driver.getDriver().findElement(By.id("catnav-primary-link-10923")).click();
        }else if (submodule.equals("Home & Living")){
            Driver.getDriver().findElement(By.id("catnav-primary-link-891")).click();
        }
    }

    @Then("the site subtitle will be {string}")
    public void the_site_subtitle_will_be_Clothing_Shoes(String subtitle) throws InterruptedException {
        Thread.sleep(2000);
        String expected = subtitle;
        String actual = Driver.getDriver().findElement(By.xpath("//h1[contains(text(),'"+subtitle+"')]")).getText();
        Assert.assertEquals(actual,expected,"Subtitle does not match");
    }




}
