package Usecases;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Utitlities {
    WebDriver driver = new ChromeDriver();

    public void moveCursor()
    {
        WebElement element= driver.findElement(By.id("nav-link-amazonprime"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
    public  void waitForSync( int seconds) {
        driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
    }
}
