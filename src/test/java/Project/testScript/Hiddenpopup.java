package Project.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Project.genericLib.Baseclass;

public class Hiddenpopup extends Baseclass{
      @Test
      public void getHidden() throws InterruptedException
      {
    	  driver.findElement(By.id("container_tasks")).click();
     	 // Thread.sleep(2000);
     	   driver.findElement(By.xpath("//td[@class='selection']/div/div[1]")).click();
     	 // Thread.sleep(2000);
     	   driver.findElement(By.cssSelector("[class='delete button']")).click();
     	  Thread.sleep(2000);
     	  driver.findElement(By.xpath("//div/span[contains(text(),'Delete with users')]")).click();
     	  // System.out.println(result);
      }
}
