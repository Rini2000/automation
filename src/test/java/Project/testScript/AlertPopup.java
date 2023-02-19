package Project.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Project.genericLib.Baseclass;
import Project.genericLib.CommonUtility;

public class AlertPopup extends Baseclass{
     @Test
     public void alertHandling()
     {
    	 driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
 		driver.findElement(By.xpath("//a[contains(text(),'Types of')]")).click();
 		driver.findElement(By.id("ext-comp-1002")).click();
 		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Ankita");
 		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click();
 		CommonUtility cu=new CommonUtility();
 		String msg=cu.getAlertmsg(driver);
 		System.out.println(msg);
 		cu.getCancel(driver);
 		 
     }
    
}
