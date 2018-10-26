package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declaration
public class LoginPage {
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
//initialization
	public LoginPage(WebDriver driver) {
		//unTB=driver.findElement(By.id("username"));
		//pwTB=driver.findElement(By.name("pwd"));
		//loginBTN=driver.findElement(By.xpath("//div[text()='Login ']"));
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	public void clickLogin() {
		loginBTN.click();
	}
}


