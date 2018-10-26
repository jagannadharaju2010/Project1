package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.get("https://jqueryui.com/droppable/");
   driver.switchTo().frame(0);
  // WebElement source = driver.findElement(By.id("draggable"));
   WebElement source1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
  // WebElement destination = driver.findElement(By.id("droppable"));
   WebElement destination1 = driver.findElement(By.xpath("//p[text()='Drop here']"));
   Actions actions=new Actions(driver);
   actions.dragAndDrop(source1, destination1).perform();
	}

}
