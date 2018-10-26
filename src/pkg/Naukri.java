package pkg;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> allwhs = driver.getWindowHandles();
		System.out.println(allwhs.size());
		allwhs.remove(parent);
		for(String wh:allwhs) {
			WebDriver window = driver.switchTo().window(wh);
			window.close();
			/*String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("Amazon")) {
				driver.close();*/
		}
		driver.switchTo().window(parent);
		File f=new File("./cv/jagan QA resume.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		//driver.findElement(By.xpath("(//input[@type='button'])[2]")).sendKeys(path);
		System.out.println("Pass");
		
		String text = driver.findElement(By.className("success")).getText();
		System.out.println(text);
		
		driver.close();
		}
	//driver.switchTo().window(parent).close();
	}
	


