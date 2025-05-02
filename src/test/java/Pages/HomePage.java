package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);

    }

    private final String HOME_PAGE_VALIDATION="https://qtripdynamic-qa-frontend.vercel.app/";


    @FindBy(xpath = "//a[normalize-space(text())='Register']" )
    private WebElement registerButton;

    @FindBy(xpath="//a[normalize-space(text())='Login Here']")
    private WebElement loginButton;


    public void clickRegisterButton(){
        registerButton.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public boolean isHomePage(){
        return registerButton.isDisplayed();
    }



}
