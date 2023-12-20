package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductListPage;

public class Mystepdef{
		

WebDriver driver= TestBase.getDriver();
LoginPage loginpage;
ProductListPage listPage;
CartPage cartPage;
CheckoutPage chkoutPage;

   public Mystepdef() {
	   loginpage = new LoginPage(driver);
	   listPage=new ProductListPage(driver);
	   cartPage = new CartPage(driver);
	   chkoutPage = new CheckoutPage();
	    }

@Given("User is on Login Page")
public void user_is_on_login_page() {
       TestBase.openUrl("https://www.demoblaze.com/index.html");
}

@When("User enters  {string}  and {string}")
public void user_enters_and(String strUser, String strPwd) throws InterruptedException {
	  loginpage.loginIntoApp(strUser, strPwd);
    
}
@Then("User Should on Home page")
public void user_should_on_home_page() {
      Assert.assertTrue(listPage.isOnproducts());
}

@When("User add item to cart")
public void user_add_item_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Item must be added")
public void item_must_be_added() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

		
	}


