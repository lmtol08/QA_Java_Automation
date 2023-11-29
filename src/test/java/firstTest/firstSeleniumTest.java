package firstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
public class firstSeleniumTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void openGoogle(){
        String url = "https://www.google.com";
        driver.get(url);

        String title = driver.getTitle();
        Assert.assertEquals(title,"Google");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("Amazon");
        searchBox.submit();

    }
    @Test(dependsOnMethods = "openGoogle")
    public void clickOnAmazon(){
        WebElement amazonLink = driver.findElement(By.partialLinkText("Amazon"));

        Assert.assertNotNull(amazonLink);

        amazonLink.click();
    }

    @Test(dependsOnMethods = "clickOnAmazon")
    public void assertAmazon(){
        String pageTitle = driver.getTitle();

        Assert.assertTrue(pageTitle.contains("Amazon"));


        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        searchBox.submit();
    }
    @Test(dependsOnMethods = "assertAmazon")
    public void countResults(){
        WebElement searchResultContainer = driver.findElement(By.cssSelector("div.s-main-slot"));

        List<WebElement> searchResults = searchResultContainer.findElements(By.cssSelector("div.s-result-item"));

        int numberOfResults = searchResults.size();
        System.out.println("Number of results: " + numberOfResults);

        Assert.assertTrue(numberOfResults >= 10,"Expected at least 10 results");
    }



    @AfterTest(enabled = false)
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }






}