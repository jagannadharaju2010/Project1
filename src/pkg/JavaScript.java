package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.get("https://demo.actitime.com/login.do");
   JavascriptExecutor j=(JavascriptExecutor)driver;
   String msg="Happy Festival";
   //j.executeScript("alert('msg')");
   j.executeScript("alert('"+msg+"')");
   
	}

}
