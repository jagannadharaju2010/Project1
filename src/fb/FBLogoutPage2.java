package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogoutPage2 {
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logoutBTN;

	public FBLogoutPage2(WebDriver driver) {
		//logoutBTN=driver.findElement(By.xpath("//span[text()='Log Out']"));
		PageFactory.initElements(driver, this);
	}

	public void clickLogOut() {
		logoutBTN.click();
	}
}
