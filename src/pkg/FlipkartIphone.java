package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone x");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='iphone x mobile']/..")).click();
		String xp="//div[starts-with(text(),'Apple iphone')]/../../div[2]/div[1]/div[1]/div[1]";
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		int count = findElements.size();
		List<Integer> parseInt1=new ArrayList<Integer>();

		for(WebElement price:findElements) {
			//System.out.println(price.getText());
			String e = price.getText();
			String s = e.substring(1).replaceAll(",", "");
			// System.out.println(s);
			int parseInt = Integer.parseInt(s);
			//  System.out.println(parseInt);
			parseInt1.add(parseInt);

		}
		Collections.sort(parseInt1);
		// System.out.println(parseInt1);
		for(int i=0;i<parseInt1.size();i++) {
			System.out.println(parseInt1.get(i));
		}
		//System.out.println(Collections.lastIndexOfSubList(parseInt1, parseInt1));
		System.out.println(Collections.max(parseInt1));
		System.out.println(Collections.min(parseInt1));
	}

}