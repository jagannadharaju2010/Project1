package pkg;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		Date d=new Date();
		String t = d.toString();
		System.out.println(t);
		String t2 = t.replaceAll(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Set<String> v = driver.getWindowHandles();  
		System.out.println(v.size());
		System.out.println(v);
		String title = driver.getTitle();
		System.out.println(title);
		/*String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);*/
		String url = driver.getCurrentUrl();
		System.out.println(url);
		TakesScreenshot scrn=(TakesScreenshot)driver;
		File s= scrn.getScreenshotAs(OutputType.FILE);
		File f=new File("./photo/"+t2+".png");
		FileUtils.copyFile(s, f);
		driver.quit();
		
		/* WebElement ele = driver.switchTo().activeElement();
       ele.sendKeys("dummy");*/
		//driver.quit();
	}

}
