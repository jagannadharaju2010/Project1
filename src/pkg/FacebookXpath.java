package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//i[@class='fb_logo img sp_TqdTTRwIEat sx_59d053']")).click();
		driver.findElement(By.xpath("//i[contains(@class,'fb_logo img sp_TqdTTRwIEat sx')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("jagannadharaju2010@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bob@1234");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		driver.findElement(By.xpath("//div[text()='Facebook helps you connect and share with the people in your life.']")).click();
		driver.findElement(By.xpath("//span[text()='Create an account']")).click();
		driver.findElement(By.xpath("//div[@class='_52lr fsm fwn fcg']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@id='u_0_l']")).click();
		driver.findElement(By.xpath("//input[@id='u_0_o']")).click();
		driver.findElement(By.xpath("//input[@id='u_0_v']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Birthd')]")).click();
		driver.findElement(By.xpath("//select[@id='day']")).click();
		driver.findElement(By.xpath("//select[@id='month']")).click();
		driver.findElement(By.xpath("//select[@id='year']")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//a[text()='Why do I need to provide my date of birth?']")).click();
		driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
		driver.findElement(By.xpath("//input[@id='u_0_7']")).click();
		driver.findElement(By.xpath("//p[@class='_58mv']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_11']")).click();

	}

}
