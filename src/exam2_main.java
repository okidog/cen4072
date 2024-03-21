import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class exam2_main {
    @Test(timeOut = 0, priority = 1)
    void gmailLogin() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://accounts.google.com");
        Thread.sleep(1000);

        // Enter credentials
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("laneoki65", Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.xpath(
                "/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"
        )).sendKeys("okidog55", Keys.ENTER); // Both boxes use same class

        // Output page title and URL
        System.out.println("Title: "+driver.getTitle()); // Print title and current URL
        System.out.println("Current URL: "+driver.getCurrentUrl());
    }

    @Test(timeOut = 1000, priority = 2)
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
    }

    @Test(timeOut = 1000, priority = 3)
    void tutorialspointScreenshot() throws InterruptedException, IOException { // Test 3 - Screenshot
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

    @Test(timeOut = 1000, priority = 4)
    void tutorialspointUpload() throws InterruptedException, IOException { // Test 4 - Upload image
        // Init drivers
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        // Upload image to file picker
        driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div[1]/h2/button")).click(); // Click dropdown
        Thread.sleep(250);
        driver.findElement(By.linkText("Upload and Download")).click();
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\oki\\Downloads\\meowskulls.jpg");

        Thread.sleep(1000);
        driver.quit();
    }

    @Test(timeOut = 1000, priority = 5)
    void dragAndDropTest() throws InterruptedException { // Test 5 - Drag and drop
        // Init drivers
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");

        // Drag and drop
        WebElement image = driver.findElement(By.id("draggable"));
        WebElement box = driver.findElement(By.id("droppable"));
        action.dragAndDrop(image, box).build().perform();

        Thread.sleep(1000);
        driver.quit();
    }
}


