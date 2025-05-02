package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
    WebDriver driver;
  public LoginPage(WebDriver driver){
      this.driver=driver;
      PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
  }

  @FindBy(css="h2.formtitle")
    private WebElement loginText;
  @FindBy(name="email")
    private WebElement loginTextField;
  @FindBy(name="password")
    private WebElement passwordText;
  @FindBy(xpath="//button[normalize-space(text())='Login to QTrip']")
    private WebElement loginButton;
  public boolean isLoginPage(){
      return loginText.getText().equalsIgnoreCase("Login");
  }



}
