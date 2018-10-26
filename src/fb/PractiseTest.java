package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PractiseTest {
@Test
public void meth() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.google.com");
	Practiseone p=new Practiseone(driver);
	p.enterText();
	Thread.sleep(2000);
	p.allSearchLinks();
	
}
}
