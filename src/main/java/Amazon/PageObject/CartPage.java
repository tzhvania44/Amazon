package Amazon.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public SelenideElement
            cart = $("#nav-cart-count"),
            shoppingCartCheck = $(byText("Shopping Cart")),
            gift = $(byText("This will be a gift")),
            qty = $(".a-dropdown-label"),
            qt = $(byText("8")),
            deleteButton = $(".a-declarative", 5),
            wait=$(byText("Hello, Tako"));


}
