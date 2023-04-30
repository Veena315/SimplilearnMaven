package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;

public class LoginPage {
	
	WebDriver pagedriver;
	
	//=========================Objects==================
	
	@FindBy(linkText="Log in")
	WebElement Loginlink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement rememberMe;
	
	@FindBy(name="btn_login")
	WebElement Submit;
	
	
	//=========================Methods==================
	
	public LoginPage(WebDriver driver) {
		
		this.pagedriver = driver;
		PageFactory.initElements(pagedriver, this);
	}
	
public void LoginFunction(String UserNameVal , String PwdVal) {
		
		//WebElement Loginlink = driver.findElement(By.linkText("Log in"));
		Loginlink.click();
	
		//WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);
		
		
		//WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PwdVal);
		
		
		//WebElement rememberMe = driver.findElement(By.className("rememberMe"));
		rememberMe.click();
		

		//WebElement Submit = driver.findElement(By.name("btn_login"));
		Submit.click();
		
	}


}
