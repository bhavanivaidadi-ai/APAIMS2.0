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



    //M&E module Started
    public static By Mobile_Number_Not_Verified_popup = By.xpath("//div[@class=\"ng-tns-c2196985156-8 p-dialog-header-actions\"]");
    public static By m_E_Button = By.xpath("//a[@href=\"/monitoring-evaluation\"]");
    public static By district_wise_normal_area_tab = By.xpath("//span[normalize-space()='District Wise Normal Areas']");
    public static By mis_tab = By.xpath("//input[@id='mis']");
    public static By pest_disease_tab = By.xpath("//span[normalize-space()='Pest & Disease Reports']");
    public static By harvest_report_tab = By.xpath("//span[normalize-space()='Harvest Reports']");
    public static By analytics_reports_tab = By.xpath("//span[normalize-space()='Analytics Reports']");
    public static By reconciliation_Reports_tab = By.xpath("//span[normalize-space()='Reconciliation Reports']");
}
