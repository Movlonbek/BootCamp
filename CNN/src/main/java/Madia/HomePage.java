package Madia;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {
    @Test
    public void US() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"us-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/div/div[2]/h3/a/span[1]")).click();
        sleepFor(1);

    }

    @Test
    public void LiveTV() {
        clickByXpath("//*[@id=\"nav-mobileTV\"]");
        sleepFor(2);

    }

}
