package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDrive {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.com/");
       driver.findElement(By.id("lst-ib")).sendKeys("make my trip");
       driver.findElement(By.xpath("//span[text()='India']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@name='btnK']")).click();
       driver.findElement(By.xpath("//a[contains(text(),'MakeMyTrip - #1')]")).click();
       Thread.sleep(1000);
       //driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys("Bangalore");
       driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys("Rajahmundry");
       driver.findElement(By.xpath("(//button[text()='Search'])[1]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//span[text()='SG-1233']/../../div[last()]/p/a")).click();
	}

}
