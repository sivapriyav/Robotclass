package sampledemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotclassDemo {
  @Test
  public void f() throws AWTException,InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div[3]/a")).click();
	  Robot robot = new Robot();  
      Thread.sleep(3000); 
      robot.keyPress(KeyEvent.VK_DOWN);
      System.out.println("down key pressed");	
      Thread.sleep(3000);  
      robot.keyPress(KeyEvent.VK_TAB);
      System.out.println("Tb key pressed");	
      robot.keyPress(KeyEvent.VK_TAB);
      System.out.println("Tb key2 pressed");	
      robot.mouseMove(30,100);
      System.out.println("Mouse moved");	
  }
}
