package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPage {

	@FindBy(xpath="//li/./a/b[text()='Directory']")
	private WebElement btnDirectory;
	
	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickbtn() {
		btnDirectory.click();
	}
}
