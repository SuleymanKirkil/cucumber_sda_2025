package stepdefinitions.eviltester;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.eviltesters.FormDetailsPage;
import pages.eviltesters.FormPage;
import utilities.Driver;


public class EvilTesterStepDefs {
    FormPage formPage = new FormPage();
    FormDetailsPage detailsPage = new FormDetailsPage();

    @Given("user goes to url {string}")
    public void user_goes_to_url(String url) {
        Driver.getDriver().get(url);
    }
    @When("user enters form username {string}")
    public void user_enters_form_username(String username) {
        formPage.enterUserName(username);
    }
    @When("user enters form password {string}")
    public void user_enters_form_password(String password) {
        formPage.enterPassword(password);
    }
    @When("user enters form comment {string}")
    public void user_enters_form_comment(String comment) {
        formPage.enterComment(comment);
    }
    @When("user clicks on form submit")
    public void user_clicks_on_form_submit() {
        formPage.clickSubmit();
    }
    @Then("user validates comment include {string}")
    public void user_validates_comment_include(String string) {
        Assert.assertTrue(detailsPage.isCommentInclude(string));
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.quitDriver();
    }

}
