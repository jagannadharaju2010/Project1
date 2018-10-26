package pkg;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class YatraTicket {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		ChromeOptions options=new ChromeOptions();
		FirefoxOptions options1=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		
    // WebDriver driver=new ChromeDriver(options);
     WebDriver driver=new FirefoxDriver(options1);
     driver.manage().window().maximize();
     driver.get("https://www.yatra.com/");
     Robot r=new Robot();
    // r.keyPress(keyEvent.);
	}

}
