package stepdefinitions.sauceDemoStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.saucedemo.ProductsPage;
import pages.saucedemo.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SignInStepDefs {
    SignInPage signInPage = new SignInPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("I am on sauceDemo application")
    public void i_am_on_sauce_demo_application() {
        Driver.getDriver().get(ConfigReader.getProperty("sd_url"));
    }
    @When("I enter standart_user as username")
    public void i_enter_standart_user_as_username() {
        signInPage.enterUserName("standard_user");
    }
    @When("I enter secret_sauce as password")
    public void i_enter_secret_sauce_as_password() {
        signInPage.enterPassword("secret_sauce");
    }
    @When("I click on sign in button")
    public void i_click_on_sign_in_button() {
        signInPage.clickSignin();
    }
    @Then("I should be redirected to Products page")
    public void i_should_be_redirected_to_products_page() {
        System.out.println("productsPage.getPageTitle() = " + productsPage.getPageTitle());
        Assert.assertEquals("Products",productsPage.getPageTitle());
        Assert.assertTrue(productsPage.pageTitle.isDisplayed());

    }
    @Then("I should see product inventory")
    public void i_should_see_product_inventory() throws InterruptedException {
        Assert.assertTrue(productsPage.isInventoryDisplayed());
        Thread.sleep(2000);
        Driver.quitDriver();
    }

    @When("I enter {string} as username")
    public void iEnterAsUsername(String username) {
        signInPage.enterUserName(username);
    }

    @And("I enter {string} as password")
    public void iEnterAsPassword(String password) {
        signInPage.enterPassword(password);
    }
    @Then("I should see error message {string}")
    public void i_should_see_error_message(String message) {
        signInPage.isErrorMessageVisible(message);
    }
    @Then("I should remain on login page")
    public void i_should_remain_on_login_page() {
        Assert.assertFalse(Driver.getDriver().getCurrentUrl().contains("inventory"));
        Assert.assertTrue(signInPage.isLogginButtonVisible());
    }

}
