package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogoutPage {
	//Declaration
	@FindBy(id="userNavigationLabel")
	private WebElement logoutLink;
	//private WebElement logoutButton;

	//initialization
	public FBLogoutPage(WebDriver driver) {
		//logoutLink=driver.findElement(By.id("userNavigationLabel"));
		//logoutButton=driver.findElement(By.xpath("(//span[@class='_54nh'])[6]"));
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void clickLink() {
		logoutLink.click();
	}
	/*public void clickLogout() {
		logoutButton.click();
	}*/
}
