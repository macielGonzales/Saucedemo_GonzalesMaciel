package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class InventorySteps {
    private WebDriver driver;

    public InventorySteps(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }

    public int getItemSize() {
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsCards);
        return items.size();
    }

    public void addItemCard() {
        this.driver.findElement(InventoryPage.addToCardButton).click();
    }

    public void selectShoppingCard() {
        this.driver.findElement(InventoryPage.shoppingCardLink).click();
    }
}
