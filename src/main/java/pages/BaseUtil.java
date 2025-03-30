package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class BaseUtil {
    protected WebDriver driver;

    public BaseUtil(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement USERNAME_FIELD;
    @FindBy(id = "password")
    WebElement PASSWORD_FIELD;

    public static final By LOGIN_BUTTON = By.id("login-button");

    public void setLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
    }
}
