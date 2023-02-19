package Project.testScript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Project.genericLib.Baseclass;
import Project.genericLib.CommonUtility;
import Project.genericLib.DataUtility;

public class CustomerCreation extends Baseclass{
	@Test
    public void createCustomer() throws EncryptedDocumentException, IOException
    {
		DataUtility du=new DataUtility();
		CommonUtility cu=new CommonUtility();
		int num=cu.getRandomNumber(1000);
		String expcustomername=du.getDataFromExcelsheet("Sheet1",0,0);
		expcustomername=expcustomername+num;
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.className("downIcon")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		  
		driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("TechMahindra");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
			 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), expcustomername));
		String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(actualcustomername);
	}
	
}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

