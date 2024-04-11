import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class testngAssertion {/*
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
        System.out.println("I'll finish this later");
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
    } */

    @Test(priority = 5)
    public void pageUrl() {
        // Init driver, navigate to subpage
        WebDriver driver = new FirefoxDriver();
        driver.get("http://oki.gay");
    }
}
