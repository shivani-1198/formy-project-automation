import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//importing the action class
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        // defined a new element and adked to find an elemetnt by its id name
        WebElement name = driver.findElement(By.id("name"));

        // to use the action class 
        Actions actions = new Actions(driver);
        //to be able to able to move to the element we need to use the method called moveToElement from action class
        // /using the object actions to move to the new class
        actions.moveToElement(name);
        name.sendKeys("Meaghan Lewis");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");

        driver.quit();
    }
}
