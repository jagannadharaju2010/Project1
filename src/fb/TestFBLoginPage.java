package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFBLoginPage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		FBLoginPage fb=new FBLoginPage(driver);
		fb.setUserName("jagannadharaju2010@gmail.com");
		fb.setPassword("Bob@1234");
		fb.clickLogin();

		FBLogoutPage fbLogOut=new FBLogoutPage(driver);
		/*WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains(" Facebook"));*/
		fbLogOut.clickLink();

		FBLogoutPage2 fbLogOut2=new FBLogoutPage2(driver);
		fbLogOut2.clickLogOut();
	}

}
