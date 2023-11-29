package CucumberOrangeCRMTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class CucumberOrangeCRMTest {
    private WebDriver driver;

    @Given("the user is on the OrangeHRM login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Replace with the actual URL
    }

    @When("the user enters valid {string} and {string}")
    public void user_enters_valid_credentials(String username, String password) {

        WebElement usernameField = driver.findElement(By.id("username")); // Replace with actual element locator
        WebElement passwordField = driver.findElement(By.id("password")); // Replace with actual element locator

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("the user clicks the login button")
    public void user_clicks_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")); // Replace with actual element locator
        loginButton.click();
    }

    @Then("the user should be successfully logged in and see the dashboard")
    public void user_should_see_dashboard() {
        WebElement dashboardText = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
        String actual = dashboardText.getText();
        Assert.assertEquals(actual,"Dashboard");
    }

    @When("the user enters invalid {string} and {string}")
    public void user_enters_invalid_credentials(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username")); // Replace with actual element locator
        WebElement passwordField = driver.findElement(By.id("password")); // Replace with actual element locator

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @Then("the user should see a login failure message {string}")
    public void user_should_see_login_failure_message(String expectedMessage) {

        WebElement InvalidText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));

        Assert.assertEquals(expectedMessage, InvalidText.getText());

    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}
