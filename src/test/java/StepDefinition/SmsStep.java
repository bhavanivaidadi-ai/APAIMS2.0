package StepDefinition;

import PageClasses.SmsPage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;

public class SmsStep {

    SmsPage smsPage = new SmsPage(WebDriverInitializer.getDriver());

    @And("user should be able to click on the SMS module")
    public void click_sms_module(){

    }
}
