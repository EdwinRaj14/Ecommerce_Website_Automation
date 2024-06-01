package Usecases;

import org.checkerframework.checker.units.qual.A;
import org.example.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class useCasestoTest {

    WebDriver driver = new ChromeDriver();

    PageFactory pageFactory = new PageFactory();


    public  void waitForSync( int seconds) {
        driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
    }
    public void lauchBrowser(String url)
    {
        driver.get(url);

    }
    public String titleValidation()
    {
        String ActualTitle= driver.getTitle();
        return ActualTitle;
    }

    public void moveCursor()

    {
        WebElement element= driver.findElement(By.id("nav-link-amazonprime"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        String primeIsExist =  driver.findElement(By.id("nav-link-amazonprime")).getText();
        Assert.assertEquals("Prime",primeIsExist);
    }
    public void ChromeClose()
    {
        driver.quit();
    }


}
