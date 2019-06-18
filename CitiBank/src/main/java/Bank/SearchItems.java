package Bank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SearchItems extends CommonAPI {

    @Test
    public void Search () {
        driver.findElement(By.xpath("//*[@id=\"personetics-citi-menu\"]")).click();
        sleepFor(1);
    }

    //-------------Initializing all the WebElements of Search page--------------

    @FindBy(xpath = "//*[@id=\"SummaryRecentTransactions-label\"]]")
    public static WebElement WhereCan;
    @FindBy(xpath = "//*[@id=\"Howactivatenewcard-label\"]")
    public static WebElement HowActivate;
    @FindBy(xpath = "//*[@id=\"cxcmarketing_zelle-label\"]")
    public static WebElement WhatZelle;
    @FindBy(xpath = "//*[@id=\"SpecialServicesCitibankFinancialCenters-label\"]")
    public static WebElement Branches;
    @FindBy(xpath = "//*[@id=\"lang-switcher\"]")
    public static WebElement AnnualRate;
    @FindBy(xpath = "//*[@id=\"WmyAPRCitiCreditCard-label\"]")
    public static WebElement articleHelpful;


    //-------------List of click methods of all the WebElements of Search page--------------


    public void WhereCanClick(){
        WhereCan.click();
    }
    public void HowActivate(String key){
        HowActivate.sendKeys(key);
        driver.findElement(By.xpath("//*[@id=\"cmlink_ActivateCard\"]")).click();
    }
    public void WhatZelleClick(){
        WhatZelle.click();
    }
    public void BranchesClick(){
        Branches.click();
    }
    public void AnnualRateClick(){
        AnnualRate.click();
    }





}
