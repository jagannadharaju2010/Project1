package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void meth() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.close();
	}
	
	public static void meth2() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		driver.close();
	}

	public static void main(String[] args) {
      FirstProgram.meth();
	}

}
