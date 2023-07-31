package CloudText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCloudFirst {
  

	public static void main(String[] args) throws InterruptedException {
    	

        // Setup Firefox driver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        System.out.println("Yes Its Setup on cloud");  

		Thread.sleep(4000);  

        // Close the browser
        driver.quit();
    }
}

