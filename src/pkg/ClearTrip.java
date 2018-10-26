package pkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("FromTag")).sendKeys("bang");
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
		driver.findElement(By.id("ToTag")).sendKeys("Goa");
		driver.findElement(By.xpath("//a[contains(text(),' Dabolim')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		driver.findElement(By.id("SearchBtn")).click();
		List<WebElement> findElements = driver.findElements(By.id("BaggageBundlingTemplate"));
		int	count=findElements.size();
		for(WebElement e:findElements) {
			String text = e.getText();
			System.out.println("original:"+text);
			String formatedText = text.substring(1).replaceAll(",", "");
			System.out.println("formated:"+formatedText);
			int parseInt = Integer.parseInt(formatedText);
			System.out.println("Int:"+parseInt);
			/*for(int i=1;i<findElements.size();i++) {
				String p1 = findElements.get(i-1).getText().substring(1).replaceAll(",", "");
				String p2 = findElements.get(i).getText().substring(1).replaceAll(",", "");
				int v1=Integer.parseInt(p1);
				int v2=Integer.parseInt(p2);
				System.out.println("Comparing "+v1+" with "+v2);
                if(v1<=v2) {
                	System.out.println("pass...");
                }
                else {
                	System.out.println("Fail...");
                }

			}*/

//driver.close();
		}
	}

}
