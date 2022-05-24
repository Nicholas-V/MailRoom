package mailroom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import mailroom.utilities.Driver;

import java.util.List;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public abstract WebElement getElement(String element);
    public abstract String getTitleCustomMethod();
    public abstract String getAttributeCustomMethod(String attributeName, String element);
    public abstract List<WebElement> getList(String listName);
    public abstract boolean elementIsDisplayed(String element);
    public abstract void clickElementMethod(String element);


}
