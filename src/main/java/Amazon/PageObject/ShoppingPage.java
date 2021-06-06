package Amazon.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ShoppingPage {
    public SelenideElement
            searchField = $("#twotabsearchtextbox"),
            searchButton = $("#nav-search-submit-button"),
            product = $(byText("The Book of Unusual Knowledge")),
            addToCartButton = $("#add-to-cart-button"),
            cart = $("#nav-cart-count"),
            order = $(".nav-line-2", 3),
            orderCheck = $(byText("0 orders")),
            wait=$(byText("Hello, Tako"));


}
