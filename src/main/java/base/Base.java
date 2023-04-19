package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	
	 public static WebDriver driver;	
	   public void setUp()
	   {
		   driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   }
	   public void openUrl(String url)
	   {
		   driver.get(url);
	   }
	   public void tearDown()
	   {
		   driver.quit();
	   }
}
