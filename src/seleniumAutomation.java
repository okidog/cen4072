import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class seleniumAutomation {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Init drivers, get webpage, maximize
        WebDriver foxDriver = new FirefoxDriver();
        JavascriptExecutor exe = (JavascriptExecutor) foxDriver;
        Actions action = new Actions(foxDriver);
        foxDriver.get("https://artoftesting.com/sampleSiteForSelenium");
        foxDriver.manage().window().maximize();
/*
        // Retrieve page title, url and display them in console
        System.out.println("\nSite: " + foxDriver.getCurrentUrl());
        System.out.println("Title: " + foxDriver.getTitle());

        // Find and enter text in textbox
        foxDriver.findElement(By.id("fname")).sendKeys("Hello!");
        Thread.sleep(500);
*/
        // Scroll a full page down for visibility
        exe.executeScript("window.scroll(0,800)","");
/*
        // Find and tick radio buttons and checkboxes
        foxDriver.findElement(By.id("female")).click();
        foxDriver.findElement(By.className("Automation")).click();

        // Init var for dropdown, select text
        WebElement dropdown = foxDriver.findElement(By.id("testingDropdown"));
        Select dd = new Select(dropdown);
        dd.selectByIndex(2);
        Thread.sleep(1000);

        // Get size of web elements
        System.out.println("The size of all links on the page is: " + foxDriver.findElements(By.tagName("a")).size());
*/
        // Scroll to and perform drag and drop
        exe.executeScript("window.scroll(0,1600)", "");
        action.dragAndDrop(foxDriver.findElement(By.id("myImage")), foxDriver.findElement(By.xpath("//*[@id=\"targetDiv\"]")))
                        .perform();

        Thread.sleep(3000);
        foxDriver.quit(); // End program

    }
}