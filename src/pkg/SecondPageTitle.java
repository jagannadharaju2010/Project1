package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPageTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("Enter"));
		/*while(true) {
		try {
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("LogoutLink is present and Clicked");
		break;
		}
		catch(Exception e){
			System.out.println("LogoutLink in NOT present");
		}
		}*/
		driver.findElement(By.id("logoutLink")).click();
		/*for(int i=1;i<=100;i++) {
		String title = driver.getTitle();
		if(title.contains("Enter ")) {
			System.out.println(title);
			break;
		}
		else {
			System.out.println("Still in the loop"+i);
		}
	}*/
          driver.close();
}
}
