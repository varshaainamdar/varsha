package Pomscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(name="login")
			private WebElement Loginbtn;
  public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
   public void setUsername(String un)
   {
	   username.sendKeys(un);
   }
   public void setPassword(String pwd)
   {
	   password.sendKeys(pwd);
   }
   public void clicklogin()
   {
	   Loginbtn.click();
   }
  
}
