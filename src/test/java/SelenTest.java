import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelenTest {
    public static void main(String[] args) throws Exception {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8080/Thoughts/");

        //login 
        driver.findElement(By.xpath("//*[@id=\"main-body\"]/form/input[1]")).sendKeys("kailas");
        driver.findElement(By.xpath("//*[@id=\"main-body\"]/form/input[2]")).sendKeys("test123");
        driver.findElement(By.xpath("//*[@id=\"main-body\"]/form/input[3]")).click();

        //go to profile
        driver.findElement(By.xpath("//*[@id=\"side-btns\"]/div[1]/a")).click();

        // add sample post
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/form/textarea")).sendKeys("Sample");
        driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
    }
}
