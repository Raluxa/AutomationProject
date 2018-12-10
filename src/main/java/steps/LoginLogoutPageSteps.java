package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginLogoutPage;

public class LoginLogoutPageSteps extends ScenarioSteps {

    LoginLogoutPage sp;

    @Step("Test 1: Login button functionality ")
    public void loginOptionFunctionality() {
        sp.loginOption();
    }

    @Step("Test 2 : Test the presence of elements")
    public void loginElements()  {
        sp.loginElements();
    }

    @Step("Test 3 :  Test the close button with blank fields")
    public void closeButtonFunctionality() {
        sp.closeButtonFunctionality();
    }

    @Step("Test 4 : Test the successful login")
    public void successfulLogin(String user, String pass) {
        sp.successfulLogin(user,pass);
    }

    @Step("Test 5 : Test the functionality of logout button")
    public void logoutUser() {
        sp.logoutUser();
    }

    @Step("Test 6 : Log in with invalid credentials")
    public void invalidCredentials ()  {
        sp.invalidCredentials();
    }
}

