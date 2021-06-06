import Amazon.PageObject.ShoppingPage;
import Amazon.StepObject.ShoppingStep;
import Amazon.Utills.AmazonLogin;
import Amazon.Utills.Retry;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;

import static Amazon.DataObject.ShoppingData.isbn;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(Amazon.Utills.TestLister.class)
public class ShoppingTest extends AmazonLogin {

    ShoppingStep step = new ShoppingStep();


    @Test(retryAnalyzer = Retry.class)
    @Description("Search and add product to the cart")
    @Severity(SeverityLevel.CRITICAL)
    public void addProduct() {
        SoftAssert asser = new SoftAssert();
        step.wait.waitUntil(Condition.visible, 3000);
        step.setSearchField(isbn)
                .searchProduct()
                .goToProductPage();
        asser.assertEquals($("#availability").getText(), "In Stock.");
        step.addProduct();
        asser.assertEquals(step.cart.getText(), "1");
        asser.assertAll();


    }

    @Test(retryAnalyzer = Retry.class)
    @Description("Check order's page")
    @Severity(SeverityLevel.CRITICAL)
    public void checkOrder() {
        SoftAssert asser = new SoftAssert();
        step.goToOrderPage();
        sleep(2000);
        asser.assertEquals(step.orderCheck.getText(), "0 orders");
        asser.assertAll();

    }


}
