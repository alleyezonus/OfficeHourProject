package practice;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class WebTables {

    /*
      Preconditions:
         1. We navigate to the practice website
         2. Click on the Sortable Table Link

         Tests Cases:
          Verify that row 2, column 4 is $51.00

          Verify the number of rows is 4 in the table1 body

          Verify the number of columns is 6 in table1

     */

    @BeforeMethod
    public void setUp(){
        //PreCondition Step 1
        Driver.getDriver().get("https://practice-cybertekschool.herokuapp.com/");
        //Step 2
        Driver.getDriver().findElement(By.linkText("Sortable Data Tables")).click();
    }

    @Test(description = " Verify that row 2, column 4 is $51.00")
    public void testCase1(){
        WebElement data = Driver.getDriver().findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[4]"));
        String actualData = data.getText();
        String expectedData = "$51.00";
        Assert.assertEquals(actualData,expectedData,"The data does not match");
    }

    @Test(description = "Verify the number of rows is 4 in the table1 body")
    public void testCase2(){
        List<WebElement> rowsOfTable1 = Driver.getDriver().findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        int actualRows=rowsOfTable1.size();
        int expectedRows =4;
        Assert.assertEquals(actualRows,expectedRows,"Number of rows do not match");
    }

    @Test(description = "Verify the number of columns is 6 in table1")
    public void testCase3(){
        List<WebElement> columnsOfTable1 = Driver.getDriver().findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
        int actualColumns = columnsOfTable1.size();
        int expectedColumns = 6;
        Assert.assertEquals(actualColumns,expectedColumns,"Number of columns do not match");
    }

    @AfterMethod
    public void shutdown(){
        Driver.quit();
    }

}
