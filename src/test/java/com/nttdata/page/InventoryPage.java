package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {
    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.xpath("//div[@class='inventory_item']");
    public static By addToCardButton = By.xpath("//button[contains(@data-test,'add-to-cart-sauce-labs-bike-light')]");
    public static By shoppingCardLink = By.xpath("//a[@class='shopping_cart_link']");
}
