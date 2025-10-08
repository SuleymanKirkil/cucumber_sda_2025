package stepdefinitions.eviltester;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.eviltesters.FormDetailsPage;
import pages.eviltesters.FormPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;


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
    public void user_closes_the_browser() throws InterruptedException {
        Thread.sleep(2000);
        Driver.quitDriver();
    }

    @Given("user select following items from multi-select:")
    public void user_select_following_items_from_multi_select(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<String > optionsList = dataTable.asList();
        formPage.selectFromMultipleSelect(optionsList);
    }
    @Then("user verifies all items should be selected")
    public void user_verifies_all_items_should_be_selected() {
        Assert.assertTrue(formPage.isAllItemsSelected());
    }

    @When("user enters username password and comment")
    public void user_enters_username_password_and_comment(io.cucumber.datatable.DataTable dataTable) {
    List<List<String>> rowList =   dataTable.asLists();
    for (List<String> row : rowList){
        String name = row.get(0);
        String password = row.get(1);
        String comm = row.get(2);

        formPage.fillDataTableElements(name,password,comm);
        Driver.getDriver().navigate().back();
    }
    }

    @When("user enters username password and comment with heading")
    public void user_enters_username_password_and_comment_with_heading(io.cucumber.datatable.DataTable dataTable) {
    List<Map<String,String>> dataMap =  dataTable.asMaps();

    for (Map<String,String> data : dataMap){
        String name = data.get("name");
        String pass = data.get("pass");
        String comm = data.get("comm");

        formPage.fillDataTableElements(name,pass,comm);
        Driver.getDriver().navigate().back();
    }
    }

    @When("user fills the form with")
    public void user_fills_the_form_with(io.cucumber.datatable.DataTable dataTable) {
    Map<String,String > dataMap = dataTable.asMap();
    String name = dataMap.get("name");
    String pass = dataMap.get("pass");
    String comm = dataMap.get("comm");
    formPage.fillDataTableElements(name,pass,comm);

    Assert.assertTrue(detailsPage.isCommentInclude(comm));
    }

}
