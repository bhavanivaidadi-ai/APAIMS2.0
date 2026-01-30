package PageClasses;

import Utilities.Xpaths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClusterDemonstration {
    WebDriver driver;
    WebDriverWait wait;

    public ClusterDemonstration(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver ,Duration.ofSeconds(100));
    }
//    public void close_popup(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.Mobile_Number_Not_Verified_popup));
//        driver.findElement(Xpaths.Mobile_Number_Not_Verified_popup).click();
//    }
    public void click_on_ClusterDemonstration_Button(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.ClusterDemonstration_Button));
        driver.findElement(Xpaths.ClusterDemonstration_Button).click();
    }
    public void click_on_ClusterDemonstration_Tab() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.ClusterDemonstration_Tab));
        driver.findElement(Xpaths.ClusterDemonstration_Tab).click();
    }
}