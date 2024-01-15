package sampledemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RoboImage 
{
  WebDriver driver;
  @BeforeTest
  public void browserLaunch() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.foundit.in");
	  
  }
  
  
  @Test
  public void chooseFile() throws AWTException, InterruptedException 
  {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]")).click();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  WebElement file_upload=driver.findElement(By.id("file-upload"));
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();",file_upload);
	  Thread.sleep(6000);
	  StringSelection sel=new StringSelection("C:\\Users\\HP\\Downloads\\CV.docx.pdf");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	  Robot robot=new Robot();
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_V);
	  Thread.sleep(6000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(6000);
	  driver.findElement(By.id("pop_upload")).click();
	  
}
}
