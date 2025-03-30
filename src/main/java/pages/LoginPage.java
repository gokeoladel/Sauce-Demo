package pages;

import library.Constant;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseUtil{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void sauceDemoLogin(String username, String password){
        USERNAME_FIELD.clear();
        USERNAME_FIELD.sendKeys(Constant.USERNAME);
        PASSWORD_FIELD.clear();
        PASSWORD_FIELD.sendKeys(Constant.PASSWORD);
    }

}
