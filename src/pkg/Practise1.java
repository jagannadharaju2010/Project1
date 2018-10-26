package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.cricbuzz.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("cb-ovr-flo")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Scorecard")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[title='Google apps']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[id='gb36']")).click();
		/*driver.findElement(By.className("gb_b gb_ec")).click();
		driver.findElement(By.className("gb_W")).click();*/
		driver.findElement(By.id("search")).sendKeys("prabhas");
		driver.findElement(By.id("search-icon-legacy")).click();
	}

}
