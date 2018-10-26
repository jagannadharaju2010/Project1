package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
        //Open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Enter the URl
		driver.get("https://accounts.google.com/");
		//Get the page title
		//check point 1 : Verify Title
		String expctedTitle="Sign in – Google accounts";
		System.out.println("expectedTitle:"+expctedTitle);
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle:"+actualTitle);
		if(actualTitle.equals(expctedTitle)) {
			System.out.println("Title is matching");
		}
		else {
			System.out.println("Title is not matching");
		}
		//checkpoint 2: Verify elements
		WebElement email = driver.findElement(By.id("identifierId"));
		if(email.isDisplayed()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		if(nextButton.isDisplayed()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
