package pages.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "inventory_list")
    private WebElement inventoryList;

    @FindBy(className = "title")
    public WebElement pageTitle;

    public boolean isInventoryDisplayed() {
        try {
            return inventoryList.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }
}
