package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.Xpaths.SchemesModuleClick;

public class PolamPilusthundhiPage {
   WebDriver driver;
   WebDriverWait wait;
    public PolamPilusthundhiPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    public void SchemesModuleClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SchemesModuleClick));
        driver.findElement(SchemesModuleClick).click();
    }
}
