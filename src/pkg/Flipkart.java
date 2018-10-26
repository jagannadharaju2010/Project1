package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		/*driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("jagan");
		Thread.sleep(1000);
        driver.findElement(By.xpath("(//button)[2]")).click();
        driver.close();*/
        driver.get("https://retail.starhealth.in/renewal");
        driver.findElement(By.id("nqame2")).sendKeys("12345");
        driver.findElement(By.id("dtDOB")).click();
        //driver.findElement(By.xpath("//div[@class='spritimg dob-sprit-img']")).click();
        //driver.findElement(By.linkText("15")).click();
      driver.findElement(By.xpath("//li[@class='currentdate']/a")).click();
        driver.findElement(By.id("proceed")).click();
	}

}
