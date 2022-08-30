package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class UserCoursesPage {

    public UserCoursesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//img[@class='avatar-big avatar-bigger ng-star-inserted']")
    public WebElement bigAvatar;



}
