
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Set;
public class exam2Main {
    @Test
    void demoblaze() throws InterruptedException { // Run tests on demoblaze website
        WebDriver driver = new ChromeDriver(); // Init driver
        driver.get("http://demoblaze.com");
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/a/img")).click(); // Click image of samsung
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click(); // Click add to cart
        Thread.sleep(500); // Delay to show confirmation message
        System.out.println("Title: "+driver.getTitle()); // Print title and current URL
        System.out.println("Current URL: "+driver.getCurrentUrl());
        driver.quit();
    } /*
    @Test
    void screenshot_url() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fgcu.edu/canvas/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File src=screenshot.getScreenshotAs(OutputType.FILE);
        File des=new File("C:\\Pictures\\screenshotnew.png");
        FileHandler.copy(src,des);
    }
    @Test
    void Web_handles()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/windows");
        String windowhandle = driver.getWindowHandle();
        System.out.println("Parent Window : " + windowhandle);
        driver.findElement(By.id("home")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);
        driver.findElement(By.id("multi")).click();
        Set<String> windowhandles2 = driver.getWindowHandles();
        System.out.println(windowhandles2);
        System.out.println("This is my Parent ID" +
                driver.getCurrentUrl());
    } */
    @Test
    void close()
    {
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}


