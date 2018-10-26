package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://www.google.com/");
      WebElement e = driver.switchTo().activeElement();
      e.sendKeys("cricbuzz.com");
      driver.get("https://www.google.com/gmail/about/#");
      String url = driver.getCurrentUrl();
      System.out.println(url);
	}

}
