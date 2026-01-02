package Utilities;

import org.openqa.selenium.By;

public class Xpaths {


    public static By UserName = By.xpath("//input[@id = 'username']");
    public static By PassWord = By.xpath("//input[@id = 'password']");
    public static By Login = By.xpath("//button[@type ='submit']/span[text()='Login']");
    public static By ValidationOfSuccess = By.xpath("//div[text()='Success']");

}
