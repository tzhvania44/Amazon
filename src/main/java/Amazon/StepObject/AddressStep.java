package Amazon.StepObject;

import Amazon.PageObject.AddressPage;
import io.qameta.allure.Step;

public class AddressStep extends AddressPage {


    @Step("Click on Delive To Button")
    public AddressStep clickDeliverTo() {
        deliverTo.click();
        return this;
    }

    @Step("Manage Address Book")
    public AddressStep manageAddressBook() {
        manageAddress.click();
        return this;
    }

    @Step("Add new Address")
    public AddressStep addAddress() {
        addAddressBt.doubleClick();
        return this;
    }

    @Step("Fill in Full Name - {FullName}")
    public AddressStep setFullName(String FullName) {
        fullNameField.setValue(FullName);
        return this;
    }

    @Step("Fill in Address 1 - {address1}")
    public AddressStep setAddress1(String address1) {
        addressLine1F.setValue(address1);
        return this;
    }

    @Step("Fill in Address 2 - {address2}")
    public AddressStep setAddress2(String address2) {
        addressLine2F.setValue(address2);
        return this;
    }

    @Step("Fill in city - {city}")
    public AddressStep setCity(String city) {
        cityF.setValue(city);
        return this;
    }

    @Step("Provinces")
    public AddressStep dropProvince() {
        provinceDropDown.click();
        return this;
    }

    @Step("Choose Province")
    public AddressStep setProvince() {
        provinceId.click();
        return this;
    }

    @Step("Fill in zip- {postalCode}")
    public AddressStep setZip(String postalCode) {

        zipF.setValue(postalCode);
        return this;
    }

    @Step("Fill in Telephone - {telephone}")
    public AddressStep setTel(String telephone) {

        tel.setValue(telephone);
        return this;

    }

    @Step("Submit My address details")
    public AddressStep submitAdd() {

        submitBT.click();
        return this;
    }

    @Step("delete address")
    public AddressStep deleteAddress() {
        deleteaddress.click();
        return this;

    }

    @Step("confirm deletion")
    public AddressStep confirmDel() {
        confirmDelete.doubleClick();
        return this;

    }
}
