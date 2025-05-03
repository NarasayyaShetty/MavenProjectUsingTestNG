package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import static SingleTon.DriverSingleTon.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCase01 {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    WebDriver driver;


    @BeforeTest(alwaysRun = true)
    public void setUp(){
       driver=driverInIt("chrome");
       homePage=new HomePage(driver);
       loginPage=new LoginPage(driver);
       registerPage=new RegisterPage(driver);
       driver.get("https://qtripdynamic-qa-frontend.vercel.app/");
    }

    @Test(description="testcase o1")
    public void testcase01() throws InterruptedException {


       Assert.assertTrue(homePage.isHomePage());
       homePage.clickRegisterButton();
       

    }

}
