package firstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.h2.command.query.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class slackTest {
    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void DropDownTest() {

    }
}
