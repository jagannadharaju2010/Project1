package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledHtml {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("file:///C:/Users/bob/Desktop/a.html");
       //driver.findElement(By.id("t1")).sendKeys("hi");
       String code="document.getElementById('t1').value='abc';";
       JavascriptExecutor j=(JavascriptExecutor)driver;
       j.executeScript(code);
	}

}
