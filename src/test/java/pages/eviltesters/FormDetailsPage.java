package pages.eviltesters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FormDetailsPage {
    @FindBy(id = "_valuecomments")
    private WebElement commentField;


    public FormDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getCommentValue(){
        return commentField.getText();
    }

    public boolean isCommentInclude(String string) {
        return getCommentValue().contains(string);
    }
}
