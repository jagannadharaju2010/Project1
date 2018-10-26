package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://nectar.enivida.com:8080/upeg/");
		/*driver.findElement(By.id("lst-ib")).sendKeys("Amazon");
		driver.findElement(By.cssSelector("span[class='Q8LRLc']")).click();
		driver.findElement(By.cssSelector("input[value='Google Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Amazon.in")).click();*/
		List<WebElement> linkcount = driver.findElements(By.xpath("//a"));
		int count=linkcount.size();
		System.out.println(count);
       for(int i=0;i<=count;i++) {
    	   System.out.println(linkcount.get(i).getText());
       }

	}

}
