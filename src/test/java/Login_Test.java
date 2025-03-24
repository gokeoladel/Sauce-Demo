import library.Browsers;
import library.Constant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BaseUtil;

public class Login_Test extends BaseUtil {
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
        ;
    }

}
