package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTimeXpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.get("https://demo.actitime.com/login.do");
   driver.findElement(By.xpath("//td[@id='headerContainer']")).click();
   driver.findElement(By.xpath("//img[@src='/img/default/login/timer.png?hash=958080878']")).click();
   driver.findElement(By.xpath("//img[contains(@src,'timer.png')]")).click();
   driver.findElement(By.xpath("//img[contains(@src,'logo.png')]")).click();
   driver.findElement(By.xpath("//input[@id='username']")).click();
   driver.findElement(By.xpath("//input[@name='pwd']")).click();
   driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
   driver.findElement(By.xpath("//a[@id='loginButton']")).click();
   driver.findElement(By.xpath("//div[text()='Login ']")).click();
   driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).click();
   driver.findElement(By.xpath("//nobr[contains(text(),'acti')]")).click();
   driver.findElement(By.xpath("//a[@href='http://www.actitime.com']")).click();
	}

}
