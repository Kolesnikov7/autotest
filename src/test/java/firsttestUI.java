import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class firsttestUI {

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new  ChromeDriver();
    }

    @Test
    public void testOpenJavaRush() {
        driver.get("https://javarush.ipnodns.ru/");
        Assert.assertEquals(driver.getTitle(),"План / InfoJavaRush");

        List ListLesson = driver.findElements( By.xpath("//li"));
        Assert.assertEquals(listLesson.size() , );
    }
    @AfterMethod
    Public void close(){
        driver.close();
    }

}
