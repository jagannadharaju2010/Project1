package pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadLinkOfJava {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
     // WebDriver driver=new ChromeDriver();
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.seleniumhq.org/download/");
      driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
      Thread.sleep(1000);
      Robot r=new Robot();
      r.keyPress(KeyEvent.VK_DOWN);
      Thread.sleep(1000);
      r.keyPress(KeyEvent.VK_ENTER);
	}

}
