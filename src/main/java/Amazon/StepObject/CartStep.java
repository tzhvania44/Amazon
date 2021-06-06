package Amazon.StepObject;

import Amazon.PageObject.CartPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

public class CartStep extends CartPage {

    @Step("Go To Cart Page")
    public CartStep goToCart() {
        cart.click();
        return this;
    }

    @Step("Click on gift checkbox")
    public CartStep clickGiftButton() {
        gift.click();
        return this;
    }

    @Step("Click on qty")
    public CartStep setQty() {

        qty.click();
        return this;

    }

    @Step("Change qty")
    public CartStep changeQty() {

        qt.click();
        return this;
    }

    @Step("Delete Product")
    public CartStep deleteProduct() {
        deleteButton.click();
        return this;
    }

}
