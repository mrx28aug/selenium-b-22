import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://yandex.ru";
        driver.get(baseUrl);
        driver.close();
    }
}
