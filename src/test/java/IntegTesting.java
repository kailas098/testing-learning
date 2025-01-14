import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntegTesting {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");

        driver.findElement(By.id("id-field")).sendKeys("101");
        driver.findElement(By.id("pass-field")).sendKeys("abcd");
        driver.findElement(By.xpath("/html/body/div/div[3]/button")).click();
    }
}
