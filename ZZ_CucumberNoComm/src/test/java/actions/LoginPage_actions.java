package actions;
import org.openqa.selenium.WebDriver;
import ZAB_Steps.CommonActions;
import elements.LoginPage_elements;

public class LoginPage_actions 
{
	static WebDriver driver;
	LoginPage_elements LP_elements;
	
	public LoginPage_actions(CommonActions ca)
	{
		LoginPage_actions.driver = ca.getDriver();
		LP_elements = new LoginPage_elements(driver);
	}
	
	public void enterEmail(String str1)
	{
		LP_elements.email.clear();
		LP_elements.email.sendKeys(str1);
	}
	public void enterPassword(String str2)
	{
		LP_elements.password.clear();
		LP_elements.password.sendKeys(str2);
	}
	public void clickSigninBtn()
	{
		LP_elements.loginButton.click();	
	}
	public boolean checkBox()
	{
		Boolean checkboxStatus = LP_elements.cheBox.isSelected();
		return checkboxStatus;
	}
}
