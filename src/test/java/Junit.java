import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Junit {
    WebDriver driver;
    @BeforeAll
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    @DisplayName("Visit Website")
    @Test
    public void visitWebsite(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title= driver.getTitle();
        String currentUrl= driver.getCurrentUrl();

        System.out.println(title);
        System.out.println(currentUrl);

        Assertions.assertTrue(title.contains("OrangeHRM"));
    }
}
