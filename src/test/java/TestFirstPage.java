import common.Application;
import common.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.FirstPageSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)

public class TestFirstPage {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver webdriver;

    @Steps
    private FirstPageSteps step;

    private String url;

    @Test
    @Title("All elements are displayed")
    public void allElements() {
        //open url
        getDriver().get(url);

        // make sure the window is maximized
        getDriver().manage().window().maximize();

        step.importantElements();
        step.pageBar();
        step.footerElements();
        step.productContainer();
        step.buttons();
        step.elementsCategories();

        getDriver().quit();
    }
}

   /* @Test
    @Title("Elements are displayed on the first page")
    public void firstPageElements() throws InterruptedException {

        //open url
        getDriver().get(url);

        // make sure the window is maximized
        getDriver().manage().window().maximize();

        step.productStoreIsDisplayed();
        step.homeIsDisplayed();
        step.contactIsDisplayed();
        step.audioIsDisplayed();
        step.cartIsDisplayed();
        step.logInIsDisplayed();
        step.signInIsDisplayed();
        step.categoriesIsDisplayed();
        step.sliderIsDisplayed();
        step.phonesIsDisplayed();
        step.laptopsIsDisplayed();
        step.monitorIsDisplayed();
        step.previousButtonIsDisplayed();
        step.nextButtonIsDisplayed();

        getDriver().quit();

    }
}*/