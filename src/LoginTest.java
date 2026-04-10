import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // 1️⃣ Open Website
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // 2️⃣ Enter Username
        driver.findElement(By.id("username")).sendKeys("student");

        // 3️⃣ Enter Password
        driver.findElement(By.id("password")).sendKeys("Password123");

        Thread.sleep(2000);

        // 4️⃣ Click Login
        driver.findElement(By.id("submit")).click();

        Thread.sleep(3000);

        // 5️⃣ Verify Successful Login
        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.equals(expectedURL)){
            System.out.println("✅ TEST PASSED : Login Successful");
        } else {
            System.out.println("❌ TEST FAILED : Login Failed");
        }

        Thread.sleep(2000);

        // 6️⃣ Click Logout
        driver.findElement(By.linkText("Log out")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}