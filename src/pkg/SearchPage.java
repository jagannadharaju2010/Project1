package pkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class SearchPage {
     @FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setValue() {
		int count = allLinks.size();
		System.out.println(count);
	}
}
