package gfbgf;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchItems extends CommonAPI {


    public void Search () {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("search items");
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        sleepFor(1);
        // Buy
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[1]/h2/a/span")).click();
        sleepFor(2);

    }



}
