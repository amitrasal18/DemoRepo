package ALLYTests;

import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonALLYTest {
	
	WebDriver driver;
	private static final URL scriptURL= amazonALLYTest.class.getResource("/axe.min.js");
	
	@BeforeMethod	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		System.out.println("no errors");
	}
	
	@Test
	public void amazonAllyTest()
	{
		JSONObject responseJson = new AXE.Builder(driver, scriptURL).analyze();
		JSONArray violations = responseJson.getJSONArray("violations");
		
		if(violations.length()==0)
		{
			System.out.println("no errors");
			System.out.println("Site looks good.");
		}
		else
		{
			AXE.writeResults("Amazon ALLy Report", violations);
			Assert.assertTrue(false, AXE.report(violations));
		}
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
