

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SelenTest {
    public static void main(String[] args) throws Exception {
        FirefoxOptions options = new FirefoxOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        FirefoxDriver driver = new FirefoxDriver(options);
        driver.get("http://localhost:8080/Thoughts/");

        loginTest(driver);
        makeNewPostTest(driver);
        deletePostTest(driver);
        
        driver.quit();
    }

    static void webDriverCon(WebDriver driver) {
        driver.get("http://localhost:8080/Thoughts/");
        Options options = driver.manage();
        String source = driver.getPageSource();
    }

    static void clickNewUser(WebDriver driver) {
        driver.findElement(By.xpath("//a[text()='New user?']"));
    }

    static void loginTest(WebDriver driver) {
         driver.findElement(By.xpath("//input[starts-with(@name, 'username')]")).sendKeys("kailas");
         driver.findElement(By.xpath("//input[starts-with(@name, 'password')]")).sendKeys("test123");
         driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
    }

    static void makeNewPostTest(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"side-btns\"]/div[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/form/textarea")).sendKeys("Sample");
        driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
    }

    static void deletePostTest(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
    }
}
