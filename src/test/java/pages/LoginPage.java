package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"cconsent-bar\"]/div/div[2]/div/button")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@id='mat-input-0']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='mat-input-1']")
    public WebElement password;

    @FindBy(xpath = "//span[contains(text(),'GİRİŞ YAP')]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[contains(text(),' username or password')]")
    public WebElement invalidMessage;



}
