package script;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.DashboardPage;
import page.LoginPage;

public class Demo1 extends BaseTest {
	@Test
	public void testA(){
		String un = Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);
		String pw=Utility.getXLData(DATA_PATH, "Sheet1", 1, 2);
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
        l.setPassword(pw);
        l.clickLogin();
        DashboardPage d=new DashboardPage(driver);
        d.clickWelcome();
        d.clickLogout(driver, 10);
		
	}
}
