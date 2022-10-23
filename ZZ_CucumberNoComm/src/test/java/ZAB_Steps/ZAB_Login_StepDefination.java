package ZAB_Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import actions.LoginPage_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZAB_Login_StepDefination
{
	static WebDriver driver;
	LoginPage_actions action;
	
	@Given("ZAB User enters url {string}")
	public void a_user_enters_url(String str) 
	{
		driver.get(str);
	}

	@When("ZAB user click on login button")
	public void a_user_click_on_login_button() 
	{
		action.clickSigninBtn();                                   //driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("ZAB Validate user successfully logged in application")
	public void validate_user_successfully_logged_in_application() throws InterruptedException 
	{
		System.out.println(driver.findElement(By.xpath("(//h1)[2]")).getText());
	}
	
	@Then("ZAB validate remember_me checkbox status")
	public void a_validate_remember_me_checkbox_status() throws InterruptedException 
	{
	    boolean actStatus = action.checkBox();                    //driver.findElement(By.xpath("//*[@type='checkbox']")).isSelected();
	    Assert.assertEquals(actStatus, false);
	}
	
	@When("ZAB User enters login credentials as {string} and {string}")
	public void ab_user_enters_login_credentials_as_and(String str1, String str2) throws InterruptedException 
	{
		action.enterEmail(str1);                                    //driver.findElement(By.xpath("//input[@id='Email']")).clear();
																//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(str1);
		
		action.enterPassword(str2);                                 //driver.findElement(By.xpath("//input[@id='Password']")).clear();
																//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(str2); 
	}
}