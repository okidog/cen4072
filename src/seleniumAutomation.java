import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class seleniumAutomation {
    public static void main(String[] args) throws InterruptedException {
        // Init drivers, get webpage, maximize
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();

        // Retrieve page title, url and display them in console
        System.out.println("\nSite: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());

        // Find and enter text in textbox
        driver.findElement(By.id("fname")).sendKeys("Hello!");
        Thread.sleep(500);

        // Click link, refreshes page
        driver.findElement(By.linkText("This is a link")).click();

        // Scroll a full page down for visibility
        exe.executeScript("window.scroll(0,800)","");

        // Find and tick radio buttons and checkboxes
        driver.findElement(By.id("female")).click();
        driver.findElement(By.className("Automation")).click();

        // Init var for dropdown, select text
        WebElement dropdown = driver.findElement(By.id("testingDropdown"));
        Select dd = new Select(dropdown);
        dd.selectByIndex(2);
        Thread.sleep(1000);

        // Scroll to and perform drag and drop
        exe.executeScript("window.scroll(0,1600)", "");
        WebElement image = driver.findElement(By.cssSelector("img#myImage"));
        WebElement box = driver.findElement(By.xpath("//*[@id=\"targetDiv\"]"));
        action.dragAndDrop(image, box).build().perform();

        // Loop to find all browser elements, display them w/ total size
        List<WebElement> allElements = driver.findElements(By.xpath("//*[@id]")); // xpath selects all elements with id
        System.out.println("The size of all elements is: "+allElements.size()+'\n');
        for (WebElement l : allElements) {
            System.out.print(l.getText() + ' ');
        }


        Thread.sleep(3000);
        driver.quit(); // End program

    }
}