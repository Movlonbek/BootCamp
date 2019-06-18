package Health;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogIn extends CommonAPI {
@Test
    public void myCigna () {
        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")).click();
        sleepFor(1);

    }

}
