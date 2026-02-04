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
    public static By SchemesModuleClick = By.xpath("//a[@href='/schemes/polam-badi']");



    //M&E module Started
    public static By Mobile_Number_Not_Verified_popup = By.xpath("//div[@class=\"ng-tns-c2196985156-8 p-dialog-header-actions\"]");
    public static By m_E_Button = By.xpath("//a[@href='/monitoring-evaluation']");

    //ClusterDemonstration
    public static By ClusterDemonstration_Button= By.xpath("//div[@class=\"p-panelmenu-header-content ng-tns-c1770405469-16\"]");
    public static By ClusterDemonstration_Tab = By.xpath("//span[normalize-space()='Cluster Demonstration']");
    public static By ClusterDemonstration_MIS = By.xpath("//span[normalize-space()='MIS']");
    public static By ClusterDemonstration_DistTR = By.xpath("//span[normalize-space()='District Targets Report']");
    public static By ClusterDemonstration_MandalTR = By.xpath("//p-button[@label='Mandal Targets Report']");


    //SMS Module Started

    public static By SMS_module_click = By.xpath("//span[text() = ' SMS Farmer Advisory ']");



}
