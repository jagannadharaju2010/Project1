package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.get("http://nectar.enivida.com:8080/upeg/");
      driver.findElement(By.id("userNameId")).sendKeys("Rohankeer");
      driver.findElement(By.id("passwordId")).sendKeys("Bob@1234");
      driver.findElement(By.id("sighInId")).click();
     // Thread.sleep(1000);
      //driver.findElement(By.xpath("(//th[text()='Rejected'])[1]/../../../tbody/tr/td[5]/a")).click();
     //driver.findElement(By.id("//*[@class='drawerImgClass']")).click();
      //driver.findElement(By.xpath("//span[text()='Catalog']")).click();
      WebElement text = driver.findElement(By.xpath("//span[text()='My Dashboard']"));
      Actions actions=new Actions(driver);
      actions.moveToElement(text).perform();
      driver.findElement(By.xpath("(//span[text()='Catalog'])[1]")).click();
	}

}
