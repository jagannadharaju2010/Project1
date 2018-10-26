package pkg;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		WebDriver d;
		
		WebElement w;
		
		JavascriptExecutor j;
		
		
		TakesScreenshot t;
		
		SearchContext s;
		
		
		
		
		driver.close();
	}
}
