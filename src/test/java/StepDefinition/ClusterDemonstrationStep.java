package StepDefinition;

import PageClasses.ClusterDemonstration;
import PageClasses.M_E_PageClass;
import driver.WebDriverInitializer;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ClusterDemonstrationStep {
    ClusterDemonstration CD = new ClusterDemonstration(WebDriverInitializer.getDriver());

    @Then("Click on ClusterDemonstration icon")
    public void click_on_CD_icon() {
        CD.click_on_ClusterDemonstration_Button();

    }
    @Then("Click on ClusterDemonstration Tab")
    public void click_on_CD_Tab() throws InterruptedException {
        CD.click_on_ClusterDemonstration_Tab();
        Thread.sleep(1000);
    }
    @Then("Click on ClusterDemonstration MIS")
    public void click_on_CD_MIS() {
        CD.click_on_ClusterDemonstration_MIS();
    }
    @Then("Click on ClusterDemonstration District Target Report")
    public void click_on_CD_District_Target_Report() throws InterruptedException {
        CD.click_on_ClusterDemonstration_DistTR();
        Thread.sleep(1000);
    }
    @Then("Click on ClusterDemonstration Mandal Target Report")
    public void click_on_CD_Mandal_Target_Report() throws InterruptedException {
        CD.click_on_ClusterDemonstration_MandalTR();
        Thread.sleep(1000);
    }
    @Then("I should see the header as {string}")
    public void i_should_see_the_header_as(String expectedText ) {
        CD.verify_ClusterDemonstration_Header();

    }



}