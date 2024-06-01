import Locators.PageElements;
import org.checkerframework.checker.units.qual.C;
import org.example.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Usecases.useCasestoTest;

import java.util.logging.Logger;

public class TestFile {


    useCasestoTest us = new useCasestoTest();
    Constants constants = new Constants();

@Test
public void ChromeLaunch()
{
    us.lauchBrowser(constants.AMAZON_WEB_URL);
    }

    @Test
    public void TitleCheck()
    {
        String actualTitle=us.titleValidation();
        Logger.getLogger(actualTitle);
        String expectedTitle = constants.EXPECTED_TITLE;
        System.out.println("Actual :"+actualTitle);
        System.out.println("Expected :"+expectedTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void primeCheck(){
    us.moveCursor();
    }
    @AfterTest
    public void BrowserClose()
    {
      us.waitForSync(constants.PAGE_LOAD_TIMEOUT);
        //  us.ChromeClose();

    }
}
