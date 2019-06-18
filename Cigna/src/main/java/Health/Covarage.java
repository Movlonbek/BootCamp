package Health;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Covarage extends CommonAPI {

    @Test
    public void HealthCovarage () {
        driver.findElement(By.xpath("//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[1]/div[2]/a")).click();
        sleepFor(1);
    }
}
