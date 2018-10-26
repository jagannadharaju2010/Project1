package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/bob/Desktop/sampleWebpage.html");
    driver.findElement(By.xpath("//input")).click(); //A1 B1 A2 B2 C1
    driver.findElement(By.xpath("//input[@type='text']")).click(); //A1 B1
    driver.findElement(By.xpath("//input[@value='A']")).click(); //A1 A2
    driver.findElement(By.xpath("//input[@type='Button' and @value='B']")).click(); //B2
    driver.findElement(By.xpath("//input[@type='checkbox']")).click(); //c1
    driver.findElement(By.xpath("//input[@type='text' or @type='Button']")).click(); //A1 B1 A2 B2
    driver.findElement(By.xpath("")).click();
    driver.findElement(By.xpath("")).click();
	}

}
