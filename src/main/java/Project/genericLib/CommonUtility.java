package Project.genericLib;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility
{
	public int getRandomNumber(int n)
	{
		Random r=new Random();
		int num=r.nextInt(n);
		return num;
	}
	public String getAlertmsg(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		return msg;
	}
	public void getCancel(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public void getDropdown(WebElement wb,String visibletext)
	{
		Select s=new Select(wb);
		s.selectByVisibleText(visibletext);
		
		
	}
	
}
