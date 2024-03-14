import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptException;
import java.io.IOException;

public class seleniumAutomation {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Init drivers, get webpage, maximize
        WebDriver foxDriver = new FirefoxDriver();
        foxDriver.get("https://artoftesting.com/sampleSiteForSelenium");
        JavascriptExecutor exe = (JavascriptExecutor) foxDriver;
        foxDriver.manage().window().maximize();

        // Retrieve page title, url and display them in console
        System.out.println("\nSite: " + foxDriver.getCurrentUrl());
        System.out.println("Title: " + foxDriver.getTitle());

        // Find and enter text in textbox
        foxDriver.findElement(By.id("fname")).sendKeys("Hello!");
        Thread.sleep(500);

        // Scroll a full page down for visibility
        exe.executeScript("window.scroll(0,800)","");

        // Find and tick radio buttons and checkboxes
        foxDriver.findElement(By.id("female")).click();
        foxDriver.findElement(By.className("Automation")).click();


        Thread.sleep(3000);
        foxDriver.quit(); // End program

    }
}