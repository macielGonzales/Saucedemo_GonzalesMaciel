package com.nttdata.page;

import org.openqa.selenium.By;

public class CartPage {
    public static By itemCardShopping = By.xpath("//div[@class='cart_item']");
    public static By itemCardName = By.xpath("//div[@class='inventory_item_name'][last()]");
}
