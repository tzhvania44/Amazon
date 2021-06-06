
package Amazon.StepObject;

import Amazon.PageObject.ShoppingPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

public class ShoppingStep extends ShoppingPage {


    @Step("Fill in Search Field")
    public ShoppingStep setSearchField(String product) {
        searchField.setValue(product);
        return this;
    }

    @Step("Find Product")
    public ShoppingStep searchProduct() {
        searchButton.click();
        return this;
    }

    @Step("Go To Product Page")
    public ShoppingStep goToProductPage() {
        product.shouldBe(Condition.appear);
        product.click();
        return this;
    }

    @Step("Add Product")
    public ShoppingStep addProduct() {
        addToCartButton.click();
        return this;

    }

    @Step("Go To Cart Page")
    public ShoppingStep goToCart() {
        cart.click();
        return this;
    }

    @Step("Go To Order Page")
    public ShoppingStep goToOrderPage() {
        order.click();
        return this;
    }



}
