package pkg;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void myTest(WebDriver driver) {
		driver.get("https://www.google.com/");
		//driver.get("https://www.naukri.com/");
		Set<String> v = driver.getWindowHandles();
		System.out.println(v.size());
		System.out.println(v);
		/*String	t=driver.getTitle();
		System.out.println(t);*/
		//driver.close();
		//driver.quit();
		/*String	src=driver.getPageSource();
		System.out.println(src);
		String	url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();*/
		/*driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cricbuzz.com/");
		driver.navigate().back();
		String	curl=driver.getCurrentUrl();
		System.out.println(curl);
		driver.navigate().forward();
		String	curl1=driver.getCurrentUrl();
		System.out.println(curl1);
		driver.navigate().refresh();//It will refresh the browser
		driver.manage().deleteAllCookies();//It will delete the cookies in the browser
		driver.quit();*///It will close to 
		/*driver.get("https://demo.actitime.com");
		WebElement e = driver.switchTo().activeElement();//Where the cursor is active it will go to that element
		e.sendKeys("bhanu");*/
		driver.get("");

	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//A.myTest(driver);
		//System.out.println(driver);//to get the java object address
		
		//String wh = driver.getWindowHandle();//to get the browser address (GUI object address)
		//System.out.println(wh);
		/*WebDriver driver1=new FirefoxDriver();
		A.myTest(driver1);*/


	}
}
