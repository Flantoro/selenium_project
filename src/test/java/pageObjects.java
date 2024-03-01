import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class pageObjects{
    WebDriver driver;
    String websiteUrl = "https://www.saucedemo.com/";
    String standartUsername = "standard_user";
    String password = "secret_sauce";
    By usernameInputField = By.cssSelector("[data-test='username']");
    By passwordInputField = By.cssSelector("[data-test='password']");
    By loginButton = By.cssSelector("[id='login-button']");

    @BeforeEach
    public void start(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterEach
    public void finish(){
        driver.quit();
    }
    public void openWebsite(){
        driver.get(websiteUrl);
    }

    public void loginAsStandartUser(){
        driver.findElement(usernameInputField).sendKeys(standartUsername);
        driver.findElement(passwordInputField).sendKeys(password);
        driver.findElement(loginButton).click();
    }


}