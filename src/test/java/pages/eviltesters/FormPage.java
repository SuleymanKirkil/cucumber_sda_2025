package pages.eviltesters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FormPage {

    public FormPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//textarea[@name='comments']")
    private WebElement commentField;

    @FindBy(xpath = "//input[@name='submitbutton'][2]")
    private WebElement submitButton;

    public void enterUserName(String name){
        usernameField.clear();
        usernameField.sendKeys(name);
    }
    public void enterPassword(String pass){
        passwordField.clear();
        passwordField.sendKeys(pass);
    }
    public void enterComment(String comm){
        commentField.clear();
        commentField.sendKeys(comm);
    }

    public void clickSubmit(){
        submitButton.click();
    }

}
