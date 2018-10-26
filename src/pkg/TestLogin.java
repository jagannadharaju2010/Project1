package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://demo.actitime.com/login.do");
    LoginPage login=new LoginPage(driver);
    login.setUserName("abc");
    login.setPassword("xyz");
    login.clickLogin();
    Thread.sleep(2000);
    login.setUserName("admin");
    login.setPassword("manager");
    login.clickLogin();
	}

}
