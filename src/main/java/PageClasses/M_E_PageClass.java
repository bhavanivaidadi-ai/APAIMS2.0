package PageClasses;

import Utilities.Xpaths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class M_E_PageClass {
    WebDriver driver;
    WebDriverWait wait;

    public M_E_PageClass(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver ,Duration.ofSeconds(100));
    }
    public void close_popup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.Mobile_Number_Not_Verified_popup));
        driver.findElement(Xpaths.Mobile_Number_Not_Verified_popup).click();

    }
}
