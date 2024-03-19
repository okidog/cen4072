import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class seleniumScreenshot {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new FirefoxDriver(); // Init driver, screenshot, open webpage
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        driver.get("http://publix.com");

        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\oki\\Desktop\\screenshot.png");
        FileHandler.copy(source, destination);

        driver.quit();
    }
}
