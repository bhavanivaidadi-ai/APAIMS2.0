package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.Xpaths.*;
import static org.testng.reporters.jq.BasePanel.S;

public class SmsPage {
    WebDriver driver;
    WebDriverWait wait;
    public SmsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void SMS_module_click(){

        WebElement smsModule = wait.until(
                ExpectedConditions.presenceOfElementLocated(SMS_module_click)
        );

        // 2️⃣ Scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                smsModule
        );

        // 3️⃣ Wait until clickable
        wait.until(ExpectedConditions.elementToBeClickable(smsModule));

        // 4️⃣ Click
        smsModule.click();
    }

    public void Seson_dropdown(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Seson_dropdown));
        driver.findElement(Seson_dropdown).click();
    }

    public void select_year(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_year));
        driver.findElement(select_year).click();
    }

    public void select_season(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_season));
        driver.findElement(select_season).click();
    }

    public void select_season_value(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_season_value));
        driver.findElement(select_season_value).click();
    }

    public void select_department(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_department));
        driver.findElement(select_department).click();
    }

    public void select_deprt_value(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_deprt_value));
        driver.findElement(select_deprt_value).click();
    }

    public void select_group(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_group));
        driver.findElement(select_group).click();
    }

    public void select_group_value(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_group_value));
        driver.findElement(select_group_value).click();
    }

    public void selct_crop_name(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selct_crop_name));
        driver.findElement(selct_crop_name).click();
    }

    public void select_crop_value(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_crop_value));
        driver.findElement(select_crop_value).click();
    }

    public void select_broadcast(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_broadcast));
        driver.findElement(select_broadcast).click();
    }

    public void select_value_brodcast(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_value_brodcast));
        driver.findElement(select_value_brodcast).click();
    }

    public void select_template(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_template));
        driver.findElement(select_template).click();
    }


}
