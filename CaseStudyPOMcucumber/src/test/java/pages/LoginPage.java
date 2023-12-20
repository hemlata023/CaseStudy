package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
       @FindBy(id="login2")
       WebElement login;
       
       @FindBy(id="loginusername")
       WebElement userId;
       
       @FindBy(id="loginpassword")
       WebElement pwd;
       
       
       
       @FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
       WebElement loginBtn;
       
      public LoginPage(WebDriver driver) {
    	  PageFactory.initElements(driver,this);
      }
      
      public void loginIntoApp(String strUser, String strPwd) throws InterruptedException {
    	  login.click();
    	  userId.sendKeys(strUser);
    	  pwd.sendKeys(strPwd);
    	  loginBtn.click();
    	  Thread.sleep(5000);
      }
}