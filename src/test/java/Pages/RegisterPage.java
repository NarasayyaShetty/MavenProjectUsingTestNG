package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
    }

    @FindBy(xpath ="//h2[normalize-space(text())='Register']")
    private WebElement registerText;

    @FindBy(css = "input#floatingInput")
    private WebElement emailTextField;

    @FindBy(name="password")
    private WebElement passWordField;

    @FindBy(name="confirmpassword")
    private WebElement confirmPasswordField;

    @FindBy(xpath="//button[normalize-space(text())='Register Now']")
    private WebElement registerButton;

    public boolean isRegisterPage(){
        return registerText.getText().equalsIgnoreCase("Register");
    }

}
