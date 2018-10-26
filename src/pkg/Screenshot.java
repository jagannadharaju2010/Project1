package pkg;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		Date d=new Date();
		String	v=d.toString();//date time contains : OS will not allow it as file name
		System.out.println(v);
		String	v2=v.replaceAll(":", "-");//replace all by - from :
		System.out.println(v2);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./photo/"+v2+".png");
		FileUtils.copyFile(srcFile, destFile);//Source file and destination file to set
		driver.close();

	}

}
