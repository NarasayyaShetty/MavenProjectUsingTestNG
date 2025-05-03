package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {
   static WebDriverWait wait;

    public static void clickElement(WebElement element, WebDriver driver){
        try{
            wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element)).click();
        }catch (NoSuchElementException | StaleElementReferenceException e){
            e.printStackTrace();
        }
    }
}
