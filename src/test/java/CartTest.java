import Amazon.StepObject.CartStep;
import Amazon.Utills.AmazonLogin;
import Amazon.Utills.Retry;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(Amazon.Utills.TestLister.class)
public class CartTest extends AmazonLogin {

    CartStep step = new CartStep();


    @Test(retryAnalyzer = Retry.class)
    @Description("Change qty")
    @Severity(SeverityLevel.NORMAL)
    public void itemTest() {
        SoftAssert asser = new SoftAssert();
        step.wait.waitUntil(Condition.visible, 3000);
        step.goToCart();
        asser.assertNotEquals(step.shoppingCartCheck.getText(), "Your Amazon Cart is empty");
        step.clickGiftButton();
        step.setQty();
        step.changeQty();
        Selenide.sleep(1000);


        asser.assertEquals(step.cart.getText(), "8");
        asser.assertAll();


    }


    @Test(retryAnalyzer = Retry.class)
    @Description("Remove product from cart")
    @Severity(SeverityLevel.CRITICAL)
    public void removeProduct() {
        SoftAssert asser = new SoftAssert();
        step.goToCart();
        asser.assertEquals(step.shoppingCartCheck.getText(), "Shopping Cart");
        step.deleteProduct();
        asser.assertEquals(step.cart.getText(), "0");
        asser.assertAll();
    }
}
