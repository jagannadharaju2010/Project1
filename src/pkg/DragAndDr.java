package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
     WebElement firstBlock = driver.findElement(By.xpath("//h1[text()='Block 1']"));
     WebElement secondBlock = driver.findElement(By.xpath("//h1[text()='Block 3']"));
     Actions actions=new Actions(driver);
     actions.dragAndDrop(firstBlock, secondBlock).perform();
	}

}
