package ZAB_Steps;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonActions // Hooks class
{
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\ZZ_CucumberNoComm\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
//	@After
//	public void tearDown() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		driver.quit();		
//	}
	
	public WebDriver getDriver()
	{
		return this.driver;
	}
}
