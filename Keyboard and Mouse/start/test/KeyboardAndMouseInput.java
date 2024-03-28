import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {
//        Sets the location for the chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/shivani/Downloads/chromedriver");
//  a new instance of chrome driver is created
        WebDriver driver = new ChromeDriver();
//the driver navigates to the test application key press page
        driver.get("https://formy-project.herokuapp.com/keypress");
// STEPS TO AUTOMATE THIS KEYPRESS PAGE:
//        got the name of the from the inspect part of the page.
        WebElement name = driver.findElement(By.id("name"));
//       to click and make the field active so that the name can be inputed
        name.click();
//      sending an input in the field to check if it is working or not
        name.sendKeys("Shivani Agarwal");


        WebElement button = driver.findElement((By.id ("button")));
        button.click();
        driver.quit();
    }
}
