package pkg;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollectionCheckBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.get("file:///C:/Users/bob/Desktop/TextBox.html");
   WebElement listBox = driver.findElement(By.id("SLV"));
   Select select=new Select(listBox);
   Thread.sleep(1000);
   select.selectByIndex(0);
   Thread.sleep(1000);
   select.selectByValue("v");
   Thread.sleep(1000);
   select.selectByVisibleText("Poori");
   
   List<WebElement> a = select.getAllSelectedOptions();
   System.out.println(a.size());
   WebElement b = select.getFirstSelectedOption();
   System.out.println(b.getText());
   List<WebElement> c = select.getOptions();
   System.out.println(c.size());
   
   if(select.isMultiple()) {
	   System.out.println("Yes, We can deselect...");
	   select.deselectByIndex(0);
	   Thread.sleep(1000);
	   select.deselectByValue("v");
	   Thread.sleep(1000);
	   select.deselectByVisibleText("Poori");
	   select.deselectAll();
   }
   else {
	   System.out.println("Sorry, We canno deselct");
   }
	}

}
