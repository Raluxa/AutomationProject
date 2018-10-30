package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ContactPage;

public class ContactSteps extends ScenarioSteps {

    ContactPage sp;

    @Step("Test 1 : Test the functionality of the Contact option")
    public void contactOptionFunctionality() {
        sp.contactOption();
    }

    @Step("Test 2 : Test the presence of elements")

    public void contactsElements() {
        sp.contactsElements();
    }

    @Step("Test 3 : Send a message from contact")
    public void succesfullMessageSend() {
        sp.sendMessage();
    }

    @Step("Test 4: Test the contact form with blank fields")
    public void blankFields() {
        sp.blankFields();
    }

    @Step("Test 5: Test the contact form with invalid credentials")
    public void invalidCredentials() throws InterruptedException {
        sp.invalidCredentials();
    }
}