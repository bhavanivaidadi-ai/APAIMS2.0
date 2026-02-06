package PageClasses;

import Utilities.Xpaths;
import org.junit.Assert;
import org.openqa.selenium.By;
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
    public void close_popup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.Mobile_Number_Not_Verified_popup));
        driver.findElement(Xpaths.Mobile_Number_Not_Verified_popup).click();
    }
    public void click_on_ClusterDemonstration_Button(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.ClusterDemonstration_Button));
        driver.findElement(Xpaths.ClusterDemonstration_Button).click();
    }
    public void click_on_ClusterDemonstration_Tab() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.ClusterDemonstration_Tab));
        driver.findElement(Xpaths.ClusterDemonstration_Tab).click();
    }
    public void click_on_ClusterDemonstration_MIS() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.ClusterDemonstration_MIS));
        driver.findElement(Xpaths.ClusterDemonstration_MIS).click();
    }
    public void click_on_ClusterDemonstration_DistTR() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.ClusterDemonstration_DistTR));
        driver.findElement(Xpaths.ClusterDemonstration_DistTR).click();
    }
    public void click_on_ClusterDemonstration_MandalTR() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.ClusterDemonstration_MandalTR));
        driver.findElement(Xpaths.ClusterDemonstration_MandalTR).click();
    }
    public void verify_ClusterDemonstration_Header() {
        String expectedText = "Andhra Pradesh ( STATE )";
        String actualText = driver.findElement(Xpaths.ClusterDemonstartion_header).getText();
        Assert.assertEquals(actualText, expectedText);
    }


}
