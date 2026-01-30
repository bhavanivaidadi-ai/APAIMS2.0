package Utilities;

import org.openqa.selenium.By;

public class Xpaths {



    // Login page(started)

    public static By UserName = By.xpath("//input[@id = 'username']");
    public static By PassWord = By.xpath("//input[@id = 'password']");
    public static By Login = By.xpath("//button[@type ='submit']/span[text()='Login']");
    public static By ValidationOfSuccess = By.xpath("//div[text()='Success']");

    // Login page(closed)


    // Polam Pilusthundhi(Started)

    public static By SchemesModuleClick = By.xpath("//span[normalize-space()='Schemes']");

}
