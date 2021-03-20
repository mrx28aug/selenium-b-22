import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AuthPage {
    public static void main (String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String Url = " http://localhost/litecart/admin/";
        driver.get(Url);
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement checkboxRememberMe = driver.findElement(By.name("remember_me"));
        WebElement submitButton = driver.findElement(By.name("login"));
        username.sendKeys("admin");
        password.sendKeys("admin");
        checkboxRememberMe.click();
        submitButton.click();

    }
}