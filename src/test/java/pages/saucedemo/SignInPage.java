package pages.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(xpath = "//h3[@data-test]")
    private WebElement errorMessage;


    public void enterUserName(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignin(){
        loginButton.click();
    }

    public void signIn(String username, String password){
     enterUserName(username);
     enterPassword(password);
     clickSignin();
    }


    public boolean isErrorMessageVisible(String message) {
        return errorMessage.getText().contains(message);
    }
    public boolean isLogginButtonVisible() {
        return loginButton.isDisplayed();
    }
}
