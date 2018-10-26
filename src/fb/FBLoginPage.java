package fb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBLoginPage {

	//Declaration
	@FindBy(id="email")
	private WebElement unTC;
	@FindBy(id="pass")
	private WebElement pwTC;
	@FindBy(id="u_0_2")
	private WebElement loginBTN;

	//initialization
	public FBLoginPage(WebDriver driver) {
		/* unTC=driver.findElement(By.id("email"));
	  pwTC=driver.findElement(By.id("pass"));
	  loginBTN=driver.findElement(By.id("u_0_2"));*/
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void setUserName(String un) {
		unTC.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwTC.sendKeys(pw);
	}
	public void clickLogin() {
		loginBTN.click();
	}
}
