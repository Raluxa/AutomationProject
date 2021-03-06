import net.serenitybdd.core.pages.PageObject;
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
import steps.ContactSteps;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

    @Story(Application.SomeFeature.class)
    @RunWith(SerenityParameterizedRunner.class)
    @UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
    public class TestContact extends PageObject{

        @Managed(uniqueSession = true, driver = "Chrome")
        public WebDriver driver;

        @Steps
        private ContactSteps step;

        private String url;

        @Before
        public void setupBrowser (){
            //open url
            getDriver().get(url);

            // make sure the window is maximized
            getDriver().manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        }

        @Test
        @Title("Test 1 : Test the functionality of the Contact option")
        public void contactOptionFunctionality()  {

            step.contactOptionFunctionality();
            waitABit(1000);
            getDriver().quit();

        }

        @Test
        @Title("Test 2 : Test the presence of elements")
        public void contactsElements()  {

            step.contactOptionFunctionality();
            waitABit(1000);
            getDriver().quit();
        }

        @Test
        @Title("Test 3 : Send a message from contact")
        public void successfulContactForm ()  {

            step.succesfullMessageSend();
            waitABit(1000);
            getDriver().quit();
        }

        @Test
        @Title("Test 4: Test the contact form with blank fields")
        public void blankFields ()  {
            step.blankFields();
            waitABit(1000);
            getDriver().quit();
        }

        @Test
        @Title("Test 5: Test the contact form with invalid credentials")
        public void invalidCredentials()  {
            step.invalidCredentials();
            waitABit(1000);
            getDriver().quit();
        }
    }