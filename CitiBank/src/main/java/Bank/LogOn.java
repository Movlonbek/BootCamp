package Bank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LogOn extends CommonAPI {


    public void Registration (){
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Mavl");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password");
        driver.findElement(By.xpath("//*[@id=\"signInBtn\"]")).click();
        sleepFor(1);

    }
    @Test
    public void activate () {
        driver.findElement(By.xpath("//*[@id=\"activate_card\"]")).click();
        sleepFor(2);
    }

    @FindBy(css = "//*[@id=\"3b9e0807-922c-8e2a-688a-e0332762b342\"]")
    public static WebElement CreditCards;
    @FindBy(css = "//*[@id=\"98cf8fa3-ae8f-eb63-e2f1-f21a66ae5c66\"]")
    public static WebElement Banking;
    @FindBy(css = "//*[@id=\"eb84fb51-15e4-7954-1893-7b79c2e238f6\"]")
    public static WebElement Lending;
    @FindBy(css = "//*[@id=\"b543fbff-48a0-db1f-792e-62dd38a84099\"]")
    public static WebElement Investing;
    @FindBy(css = "//*[@id=\"215c2b6c-05d0-1fa2-b499-2bdde26c79a4\"]")
    public static WebElement Citigold;


    //-------------List of click methods of all the WebElements of Banking page--------------


    public void CreditCardsClick(){
        CreditCards.click();
    }
    public void BankingClick(){
        Banking.click();
    }

    public void LendingClick(){
        Lending.click();
    }

    public void InvestingClick(){
        Investing.click();
    }

    public void CitigoldClick(){
        Citigold.click();
    }



}
