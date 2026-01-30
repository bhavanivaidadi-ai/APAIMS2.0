package StepDefinition;

import PageClasses.PolamPilusthundhiPage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.Then;

public class PolamPilusthundhiStep {

    PolamPilusthundhiPage polamPilusthundhiPage = new PolamPilusthundhiPage(WebDriverInitializer.getDriver());

    @Then("the user clicks on the schemes module")
    public void user_clicks_schemes_module(){
        polamPilusthundhiPage.SchemesModuleClick();
    }
}
