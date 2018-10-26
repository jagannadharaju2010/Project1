package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//Step1 : Open the Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        //Step2 : Enter the url
		driver.get("https://demo.actitime.com/login.do");
		//Verify Login page is displayed
		//Check point 1 > Verify Title
		String expectedTitle="actiTIME - Login";
		System.out.println("Expected:"+expectedTitle);
		String actualTitle=driver.getTitle();
		System.out.println("actualTitle:"+actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("pass: Title is matching");
		}
		else {
			System.out.println("Fail: Title is not matcing");
		}
		
		//CheckPoint 2 > Verify Elements are present or not
		WebElement userName = driver.findElement(By.id("username"));
		
		if(userName.isDisplayed()) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		WebElement password = driver.findElement(By.name("pwd"));
		if(password.isDisplayed()) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		if(loginButton.isDisplayed()) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		String eTitle="actiTIME - Enter Time-Track";
		System.out.println("expTitle:"+eTitle);
		String aTitle = driver.getTitle();
		System.out.println("aTitle:"+aTitle);
		if(aTitle.equals(eTitle)) {
			System.out.println("Title is matching");
		}
		else {
			System.out.println("Title is not matching");
		}
	}

}
