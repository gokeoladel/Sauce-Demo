import library.Browsers;
import library.Constant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BaseUtil;
import pages.LoginPage;

public class Login_Test{
WebDriver driver;
    @Before
    public void OpenBrowser(){
        driver = Browsers.launchBrowser("Chrome");
        driver.get(Constant.URL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginWithValidUser(){
        LoginPage login = new LoginPage(driver);
        login.sauceDemoLogin(Constant.USERNAME,Constant.PASSWORD);
        login.setLoginButton();
    }

}
