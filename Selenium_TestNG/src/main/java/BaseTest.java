

import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest{
    protected WebDriver driver;
    protected String baseUrl = "https://www.saucedemo.com/";

    @BeforeMethod
	@BeforeClass
    @Parameters({"headless"})
    public void setUp(@Optional("false") String headless) {
        WebDriverManager.chromedriver().setup();
        // Optionally add headless if needed
        if ("true".equalsIgnoreCase(headless)) {
            // headless setup if desired (left basic)
            System.setProperty("webdriver.chrome.silentOutput", "true");
            driver = new ChromeDriver();
        } else {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get(baseUrl);
    }

   
}