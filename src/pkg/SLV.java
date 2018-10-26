package pkg;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SLV {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("file:///C:/Users/bob/Desktop/SLV.html");
		WebElement listbox = driver.findElement(By.id("SLV"));
		Select select=new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		for(WebElement option:allOptions) {
			String key = option.getText();
			if(map.containsKey(key)) {
				Integer value=map.get(key);
				value++;
				map.put(key, value);
			}
			else {
				map.put(key, 1);
			}
		}
		//Q5
		System.out.println(map);
		//Q6
		String s="Idly";
		if(map.get(s)>1) {
			System.out.println(s+" is duplicate");
		}
		else{
			System.out.println(s+" is not duplicate");
		}
		//Q7
		System.out.println(map.keySet());
		//Q8
		for(String key:map.keySet()) {
			if(map.get(key)==1) {
				System.out.println(key);
			}
		}
		//Q9
		for(String key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key);
			}
		}
		driver.close();
	}

}
