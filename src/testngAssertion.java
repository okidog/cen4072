import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class testngAssertion {
    @Test(priority=1)
    public void reverseNumber() {
        // Read input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:");
        String input = in.nextLine();

        // Reverse string into newString
        String newString = "" + input.charAt(input.length() - 1);
        for (int i = input.length() - 2; i >= 0; i--) {
            newString += input.charAt(i);
        }
        // Assert
        Assert.assertEquals(input, newString, "This number is not a palindrome!");
    }

    @Test(priority = 2)
    public void factorial() {
        // Generate a random int to ask factorial
        Random rand = new Random();
        int randInt = rand.nextInt(6) + 1;
        System.out.println("What is "+ randInt +"! equal to?");

        // Read input
        Scanner in = new Scanner(System.in);
        int input = parseInt(in.nextLine());

        // Calculate factorial of randomly generated integer
        int calculatedFactorial = 1;
        for (int i = randInt; i > 1; i--) {
            calculatedFactorial *= i;
        }
        // Assert
        Assert.assertEquals(input, calculatedFactorial, "Factorials do not match!");

    }

    @Test(priority = 3)
    public void prime() {
        // Init var for assertion later
        boolean isPrime = true;

        // Read input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:");
        int input = parseInt(in.nextLine());

        // Check for a prime number
        for (int i = 2; i <= input/2; i++)  {
            if (input%i == 0) {
                isPrime = false;
            }
        }
        // Assert
        Assert.assertTrue(isPrime, "Number is not prime!");
    }

    @Test(priority = 4)
    public void pageTitle() {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://oki.gay");

        // Store title in String var for assertion
        String currentTitle = driver.getTitle();

        driver.quit();

        Assert.assertEquals(currentTitle, "oki.gay", "Title does not match!");
    }

    @Test(priority = 5)
    public void pageUrl() {
        // Init driver, navigate to subpage
        WebDriver driver = new FirefoxDriver();
        driver.get("http://oki.gay");
        driver.findElement(By.xpath("/html/body/a[3]")).click();

        // Store current url as string for assertion
        String currentUrl = driver.getCurrentUrl();
        driver.quit();

        Assert.assertEquals(currentUrl, "http://oki.gay/ccinfo/", "URL does not match!");

    }

    @Test(priority = 6)
    public void elementSize() {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://oki.gay");

        // Find all elements and output total size
        List<WebElement> allElements = driver.findElements(By.xpath("//*")); // xpath selects all elements

        Assert.assertEquals(allElements.size(), 55, "Sizes do not match!");

        driver.quit();

    }
}
