package page;

import org.openqa.selenium.WebDriver;
import generic.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageP2P {
	
	public WebDriver driver;
	
	@FindBy(id="sidebar-wrapper")
	private WebElement sidebar;
	
	@FindBy(xpath="(//span)[2]")
	private WebElement Reqlink;

	public DashboardPageP2P(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sideBar() {
		Actions actions=new Actions(driver);
		actions.moveToElement(sidebar).perform();
	}
	
	public void reqLink() {
		Reqlink.click();
	}
}
