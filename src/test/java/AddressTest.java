import Amazon.StepObject.AddressStep;
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

import static Amazon.DataObject.AddressData.*;

@Listeners(Amazon.Utills.TestLister.class)
public class AddressTest extends AmazonLogin {

    AddressStep step = new AddressStep();

    @Test(retryAnalyzer = Retry.class)
    @Description("Fill out address form")
    @Severity(SeverityLevel.BLOCKER)
    public void addressForm() {
        SoftAssert asser = new SoftAssert();
        step.wait.waitUntil(Condition.visible, 3000);
        step.clickDeliverTo();
        Selenide.sleep(2000);
        step.manageAddressBook();
        step.addAddress();
        asser.assertEquals(step.asserCnadaCheck.getText(), "Canada");
        step.setFullName(fullName)
                .setAddress1(adLine1)
                .setAddress2(adLine2)
                .setCity(city)
                .dropProvince()
                .setProvince()
                .setZip(zip)
                .setTel(mobile);
        Selenide.sleep(2000);

        step.submitAdd();
        asser.assertEquals(step.addOrRemoveCheck.getText(), "Address saved");

        asser.assertAll();


    }

    @Test(retryAnalyzer = Retry.class)
    @Description("Delete address")
    @Severity(SeverityLevel.NORMAL)
    public void deleteAddress() {

        SoftAssert asser = new SoftAssert();
        step.clickDeliverTo();
        Selenide.sleep(2000);
        step.manageAddressBook();
        step.deleteAddress();
        Selenide.sleep(3000);
        step.confirmDel();
        Selenide.sleep(3000);
        asser.assertEquals(step.addOrRemoveCheck.getText(), "Address deleted");
        asser.assertAll();
    }

}
