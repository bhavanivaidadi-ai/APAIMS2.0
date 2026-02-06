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
    public static By ClusterDemonstartion_header = By.xpath("//span[@class='font-bold']");

    //SMS Module Started

    public static By SMS_module_click = By.xpath("//span[contains(normalize-space(),'SMS Farmer Advisory')]/ancestor::a");
    public static By Seson_dropdown = By.xpath("//p-select[@id = 'year']");
    public static By select_year = By.xpath("//span[text()='2023-24']");
    public static By select_season = By.xpath("//p-select[@id = 'season']");
    public static By select_season_value = By.xpath("//li[@id = 'season_1']");
    public static By select_department = By.xpath("//p-select[@id = 'dept']");
    public static By select_deprt_value = By.xpath("//li[@id ='dept_0']");
    public static By select_group = By.xpath("//p-multi-select[@id = 'group']");
    public static By select_group_value = By.xpath("//li[@id ='group_3']");
    public static By selct_crop_name = By.xpath("//p-multi-select[@id ='crop']");
    public static By select_crop_value = By.xpath("//li[@id ='crop_4']");
    public static By select_broadcast = By.xpath("//p-select[@id = 'broadCast']");
    public static By select_value_brodcast = By.xpath("//li[@id = 'broadCast_0']");
    public static By select_template = By.xpath("//span[text()='Select Master Template']");

}
