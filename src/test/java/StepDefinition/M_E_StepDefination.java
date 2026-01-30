package StepDefinition;

import PageClasses.M_E_PageClass;
import driver.WebDriverInitializer;
import io.cucumber.java.en.Then;

public class M_E_StepDefination {
    M_E_PageClass ME = new M_E_PageClass(WebDriverInitializer.getDriver());

    @Then("close the Mobile Number Not Verified pop up")
    public void close_the_mobile_number_not_verified_pop_up() {
        ME.close_popup();
    }

    @Then("Click on M&E icon")
    public void click_on_m_e_icon() {
        ME.click_on_M_E_Button();

    }

}
