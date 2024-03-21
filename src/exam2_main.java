
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class exam2_main { /*
    @Test
    void demoblaze() throws InterruptedException { // Test 2 - Run tests on demoblaze website
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demoblaze.com");
        Thread.sleep(1000);

        // Select phone, add to cart, dismiss text
        driver.findElement(By.linkText("Samsung galaxy s6")).click(); // Click image of samsung
        Thread.sleep(1000);
        driver.findElement(By.linkText("Add to cart")).click(); // Click add to cart
        Thread.sleep(500); // Delay to show confirmation message
        driver.switchTo().alert().dismiss(); // Dismiss confirmation

        // Retrieve webpage title, url, output
        System.out.println("Title: "+driver.getTitle()); // Print title and current URL
        System.out.println("Current URL: "+driver.getCurrentUrl());

        driver.quit();
    } */

    @Test
    void tutorialspointScreenshot() throws InterruptedException, IOException { // Test 3
        // Init drivers
        WebDriver driver = new FirefoxDriver();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        // Navigate to home page
        driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div[1]/h2/button")).click(); // Click dropdown
        Thread.sleep(250);
        driver.findElement(By.linkText("Links")).click();
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(5000);

        // Take screenshot
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\oki\\Desktop\\screenshot.png");
        FileHandler.copy(source, destination);

        driver.quit();
    }

    @Test
    void tutorialspointUpload() throws InterruptedException, IOException {

    }
}


