package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// Open the Browser
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    // Enter the URL
    driver.get("https://www.facebook.com/");
    //Verify the login page is displayed
    //Check 1 > Verify Title
    String expectedTitle="Facebook – log in or sign up";
    System.out.println("expectedTitle: "+expectedTitle);
    String actualTitle = driver.getTitle();
    System.out.println("actualTitle:" +actualTitle);
    if(actualTitle.equals(expectedTitle)) {
    	System.out.println("Title is matching");
    }
    else {
    	System.out.println("Title is not matching");
    }
    //Verify elements are present or not
    WebElement userName = driver.findElement(By.id("email"));
    if(userName.isDisplayed()) {
    	System.out.println("Pass");
    }
    else {
    	System.out.println("Fail");
    }
    WebElement password = driver.findElement(By.id("pass"));
    if(password.isDisplayed()) {
    	System.out.println("Pass");
    }
    else {
    	System.out.println("fail");
    }
    WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
    if(loginButton.isDisplayed()) {
    	System.out.println("Pass");
    }
    else {
    	System.out.println("Fail");
    }
    if(userName.isDisplayed()&&password.isDisplayed()&&loginButton.isDisplayed()) {
    	System.out.println("Pass");
    }
    else {
    	System.out.println("Pass");
    }
	}

}
