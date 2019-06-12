package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageP2P {
	@FindBy(id="userNameId")
	private WebElement unTB;
	
	@FindBy(id="passwordId")
	private WebElement pwTB;
	
	@FindBy(id="sighInId")
	private WebElement btnClick;
	
	public LoginPageP2P(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username(String un) {
		unTB.sendKeys(un);
	}
	
	public void password(String pw) {
		pwTB.sendKeys(pw);
	}
	
	public void signButton() {
		btnClick.click();
	}
}
