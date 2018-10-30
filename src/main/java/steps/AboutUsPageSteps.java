package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.AboutUsPage;

public class AboutUsPageSteps extends ScenarioSteps {

    AboutUsPage sp;

    @Step("Test the functionality of About us page")
public void aboutUsPage() {
        sp.aboutUsPage();
    }

    @Step(" Test the functionality of close button")
    public  void closeButton() {
        sp.closeButton();

    }

     @Step("Test the functionality of x button")
    public void xIcon () {
        sp.xIcon();
     }

     @Step ("Test the presence of video and play button")
        public void video() {
        sp.video();
     }

}
