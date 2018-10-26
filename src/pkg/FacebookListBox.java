package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement listbox = driver.findElement(By.id("month"));
		Select select=new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		//System.out.println(allOptions.size());
		/*if(allOptions.size()<=0) {
			System.out.println("Listbox is empty");
		}
		else {
			System.out.println("Data is there in the listbox");
		}*/
		List<String> allText=new ArrayList<String>();
		Set<WebElement> tset=new TreeSet<WebElement>();
	    
		
		

		
		
		 
		//int size = allOptions.size();
		for(int i=1;i<allOptions.size();i++) {
			WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(i + " = "+ text);
			
			allText.add(option.getText());
			//System.out.println(allText.add(option.getText()));
		}
		/*for(WebElement option:allOptions) {
			allText.add(option.getText());
		}*/
		/*Collections.sort(allText);//sorting is done or not 
		if(allOptions.equals(allText)) {
			System.out.println("base list is sorted");
		}
		else {
			System.out.println("not sorted");
		}*/
		/*for(String text:allText) {
			System.out.println(text);
		}*/

		driver.close();
		/*for(int i=0;i<allOptions.size();i++) {
			System.out.println(i);
		}*/
	}

}
