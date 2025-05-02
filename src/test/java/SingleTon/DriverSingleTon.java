package SingleTon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleTon {
    private static WebDriver driver=null;

    private DriverSingleTon(){}

    public static WebDriver driverInIt(String browserName){
        if(driver==null){
            switch (browserName){
                case "chrome":
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    driver=new FirefoxDriver();
                    break;
                default:
                    System.out.println("Please provide proper browser name");
                    break;
            }
        }
        return driver;
    }

}
