import gherkin.lexer.Th;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import common.Application;
import common.Constants;
import steps.LoginLogoutPageSteps;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestLoginLogout {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private LoginLogoutPageSteps step;

    private String url;
    private String username1;
    private String password1;

    @Before
    public void setupBrowser() {
        //open url
        getDriver().get(url);

        // make sure the window is maximized
        getDriver().manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }

    @Test
    @Title("Login button functionality and elements are present")
    public void loginOptionFunctionality() throws InterruptedException {

        step.loginOptionFunctionality();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Test 2 : Test the presence of elements")
    public void loginElements() throws InterruptedException {

        step.loginElements();
        Thread.sleep(3000);
        getDriver().quit();
    }

    @Test
    @Title("Test 3 :  Test the close button with blank fields")
    public void closeButtonFunctionality() throws InterruptedException {
        step.closeButtonFunctionality();
        Thread.sleep(3000);
        getDriver().quit();
    }

    @Test
    @Title("Test 4 : Test the successful login")
    public void successfulLogin() throws InterruptedException {
        step.successfulLogin(username1,password1);
        Thread.sleep(3000);
        getDriver().quit();
    }

    @Test
    @Title("Test 5 : Test the functionality of logout button")
    public void logoutUser() throws InterruptedException {
        step.logoutUser();
        Thread.sleep(2000);
        getDriver().quit();
    }

    @Test
    @Title("Log in with invalid credentials")
    public void invalidCredential() throws InterruptedException {
        step.invalidCredentials();
        Thread.sleep(3000);
        getDriver().quit();

    }
}