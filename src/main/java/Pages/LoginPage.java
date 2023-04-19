package Pages;

import org.openqa.selenium.By;

import base.Base;

public class LoginPage extends Base
{
	By usrname=By.id("user-name");
	By psword=By.id("password");
	By loginbtn=By.id("login-button");
	By heading=By.xpath("//div[@class='header_secondary_container']");
	By errmsg=By.xpath("//h3[@data-test='error']");
	
	public void LoginBtn(String username,String password)
	{
		driver.findElement(usrname).sendKeys(username);
		driver.findElement(psword).sendKeys(password);
		driver.findElement(loginbtn).click();
		
	}
	public boolean getHeading()
	{
	
		if(driver.findElement(heading).getText().isEmpty()==false)
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
		
	}
	public String getErrorMessage()
	{
	
		return driver.findElement(errmsg).getText();
		
		
	}

}
