package fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practiseone {

	@FindBy(id="lst-ib")
	private WebElement search;
	@FindBy(xpath="//div[@class='sbqs_c']")
	private List<WebElement> links;

	public  Practiseone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

   public void enterText() {
	   search.sendKeys("cricbuzz");
   }
   public void allSearchLinks() {
	   List<WebElement> allLinks=links;
	  int count=allLinks.size();
	  System.out.println(count);
	  for(WebElement e:allLinks) {
		 System.out.println(e.getText());
	  }
	  WebElement third = allLinks.get(3);
	  third.click();
   }



}
