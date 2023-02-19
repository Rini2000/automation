package Project.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {
   public WebDriver driver;
   public DataUtility du=new DataUtility();
   @BeforeClass(alwaysRun=true)
   public void LaunchBrowser()
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankita\\OneDrive\\Pictures\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
   }
   @BeforeMethod(alwaysRun=true)
   public void login() throws IOException
   {
	   driver.get(du.getDataFromproperties("Url"));
		driver.findElement(By.id("username")).sendKeys(du.getDataFromproperties("Usename"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromproperties("Password"));
	    driver.findElement(By.className("initial")).click();
	    
   }
   @AfterMethod(alwaysRun=true)
   public void logout()
   {
	   driver.findElement(By.id("logoutLink")).click();
   }
   @AfterClass(alwaysRun=true)
   public void closeBrowser()
   {
	   driver.close();
   }
   
}
