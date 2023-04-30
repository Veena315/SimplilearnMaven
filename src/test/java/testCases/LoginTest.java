package testCases;



import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import pages.LoginPage;



public class LoginTest extends BaseClass {
	
	@Test
	public void test1() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("Veenajannu315@gmail.com","Shoveen@1705");
		
		WebElement error = driver.findElement(By.id("msg_box"));
		String ActualError = error.getText();
		String ExpectedError = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActualError, ExpectedError);
	
	}
	
	@Test
	public void test2() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("shivakmr755@gmail.com","Shoveen@1705");
	
	}
	
	@Test
	public void test4(Method method) throws FilloException {
		
		Recordset rs = connection.executeQuery("Select * from data where TestName='" + method.getName() + "'" );
		rs.next();
		
		String UserName = rs.getField("UserName");
		String Password = rs.getField("Password");
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction(UserName, Password);
		
		
		
		 
		
	}
	
	
}
