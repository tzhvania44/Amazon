package Amazon.PageObject;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class AddressPage {

    public SelenideElement
            asserCnadaCheck = $(".a-dropdown-prompt", 0),
            deliverTo = $("#glow-ingress-line2"),
            manageAddress = $("#GLUXManageAddressLink"),
            addAddressBt = $("#ya-myab-plus-address-icon"),
            fullNameField = $("#address-ui-widgets-enterAddressFullName"),
            addressLine1F = $("#address-ui-widgets-enterAddressLine1"),
            addressLine2F = $("#address-ui-widgets-enterAddressLine2"),
            cityF = $("#address-ui-widgets-enterAddressCity"),
            provinceDropDown = $(".a-dropdown-prompt", 1),
            provinceId = $("#address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8"),
            zipF = $("#address-ui-widgets-enterAddressPostalCode"),
            tel = $("#address-ui-widgets-enterAddressPhoneNumber"),
            submitBT = $(".a-button-input"),
            addOrRemoveCheck = $(".a-alert-heading"),
            deleteaddress = $("#ya-myab-address-delete-btn-0"),
            checkAddressText = $(byText("Add Address")),
            confirmDelete = $("#deleteAddressModal-0-submit-btn", 0),
            wait=$(byText("Hello, Tako"));


}
