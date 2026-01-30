package StepDefinition;

import PageClasses.ClusterDemonstration;
import PageClasses.M_E_PageClass;
import driver.WebDriverInitializer;
import io.cucumber.java.en.Then;

public class ClusterDemonstrationStep {
    ClusterDemonstration CD = new ClusterDemonstration(WebDriverInitializer.getDriver());

    @Then("Click on ClusterDemonstration icon")
    public void click_on_CD_icon() {
        CD.click_on_ClusterDemonstration_Button();

    }
    @Then("Click on ClusterDemonstration Tab")
    public void click_on_CD_Tab() {
        CD.click_on_ClusterDemonstration_Button();
    }
}