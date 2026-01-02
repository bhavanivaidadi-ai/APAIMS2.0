package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.Xpaths.*;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    private boolean flagEmptyUsername = false;
    private boolean flagEmptyPassword = false;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void UserName(String UserNameAp) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserName));
        if (UserNameAp.isEmpty()) {
            flagEmptyUsername = true;
        }
        driver.findElement(UserName).sendKeys(UserNameAp);

        if (flagEmptyUsername) {
            System.out.println("Username is empty");
        }
    }

    public void PassWord(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PassWord));
        if (password.isEmpty()) {
            flagEmptyPassword = true;
        }
        driver.findElement(PassWord).sendKeys(password);

        if (flagEmptyPassword) {
            System.out.println("Password is empty");
        }
    }

    public void Login() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
        driver.findElement(Login).click();
    }

    public void navigate_loginPage() {

        //boolean cookiesLoaded = CookieManager.loadCookies(driver);

        //driver.navigate().refresh();

//        if (cookiesLoaded) {
//            System.out.println("Logged in using existing cookies. Skipping login page.");
//        } else {
//            System.out.println("No cookies. Login page will open normally.");
//        }
    }

    public void ValidationOfSuccess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ValidationOfSuccess));

        String text = driver.findElement(ValidationOfSuccess).getText();

        if (text.trim().equals("Success")) {
            System.out.println("Login successful → " + text);
        } else {
            System.out.println("Login failed → Found: " + text);
        }
    }

}
