import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create driver, get webpage, maximize for visibility
        WebDriver foxDriver = new FirefoxDriver();
        foxDriver.get("https://artoftesting.com/sampleSiteForSelenium");
        foxDriver.manage().window().maximize();

        // Retrieve page title, url and display them in console
        System.out.println("\nSite: " + foxDriver.getCurrentUrl());
        System.out.println("Title: " + foxDriver.getTitle());

        // Find and enter text in textbox
        foxDriver.findElement(By.id("fname")).sendKeys("Hello!");
        Thread.sleep(5000);

        foxDriver.quit(); // End program

    }
}