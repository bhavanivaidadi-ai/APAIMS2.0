package StepDefinition;

import PageClasses.SmsPage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

public class SmsStep {

    SmsPage smsPage = new SmsPage(WebDriverInitializer.getDriver());

    @And("user should be able to click on the SMS module")
    public void click_sms_module(){
        smsPage.SMS_module_click();
    }

    @Then("user should be able to click on year dropdown")
    public void Select_year(){
        smsPage.Seson_dropdown();
    }

    @And("user select their required option")
    public void select_year(){
        smsPage.select_year();
    }

    @Then("user should be able to click on season dropdown")
    public void season_dropdown(){
        smsPage.select_season();
    }

    @And("user select their required season crop")
    public void season_crop(){
        smsPage.select_season_value();
    }

    @Then("user click on department dropdown")
    public void departmnet_dropdown(){
        smsPage.select_department();
    }

    @And("user select value in department dropdown")
    public void select_value_in_dept_dropdown(){
        smsPage.select_deprt_value();
    }

    @Then("user click on group names dropdown")
    public void group_name_drpdon(){
        smsPage.select_group();
    }

    @And("select value in group names dropdown")
    public void select_group_name(){
        smsPage.select_group_value();
    }

    @Then("user click on crop names dropdown")
    public void crop_name_dropdown(){
        smsPage.select_group();
    }

    @And("select value in crop names dropdown")
    public void select_crop_name(){
        smsPage.selct_crop_name();
    }

    @Then("user click on broadcast dropdown")
    public void click_broadcast_drpdown(){
        smsPage.select_broadcast();
    }

    @And("select value on broadcast dropdown")
    public void select_Value_broadcast(){
        smsPage.select_value_brodcast();
    }

    @Then("user should able to select the master template")
    public void select_master_template(){
        smsPage.select_template();
    }


}

