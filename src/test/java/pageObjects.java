import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class pageObjects{
    WebDriver driver;
    String websiteUrl = "https://www.saucedemo.com/";

    @BeforeEach
    public void start(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }
    public void openWebsite(){
        driver.get(websiteUrl);
    }
}