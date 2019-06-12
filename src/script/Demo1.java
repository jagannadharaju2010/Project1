package script;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.DashboardPage;
import page.DashboardPageP2P;
import page.DirectoryPage;
import page.LoginPage;
import page.LoginPageP2P;

public class Demo1 extends BaseTest {
	@Test
	public void testA(){
		String un = Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);
		String pw=Utility.getXLData(DATA_PATH, "Sheet1", 1, 2);
		/*LoginPage l=new LoginPage(driver);
		l.setUserName(un);
        l.setPassword(pw);
        l.clickLogin();
        DirectoryPage dp=new DirectoryPage(driver);
        dp.clickbtn();
        DashboardPage d=new DashboardPage(driver);
        d.clickWelcome();
        d.clickLogout(driver, 10);*/
		LoginPageP2P l=new LoginPageP2P(driver);
		l.username(un);
		l.password(pw);
		l.signButton();
		DashboardPageP2P d=new DashboardPageP2P(driver);
		d.sideBar();
		d.reqLink();
		
	}
}
