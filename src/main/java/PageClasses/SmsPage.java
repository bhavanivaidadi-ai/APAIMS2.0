package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.reporters.jq.BasePanel.S;

public class SmsPage {
    WebDriver driver;
    WebDriverWait wait;
    public SmsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

//    public void SMS_module_click(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated());
//    }
}
