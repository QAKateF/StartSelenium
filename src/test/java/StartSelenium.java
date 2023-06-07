import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @BeforeTest
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
    }

    @Test
    public void test(){
        //old strategies
        wd.findElements(By.tagName("a"));
        wd.findElements(By.cssSelector("a"));

        wd.findElements(By.id("root"));
        wd.findElements(By.cssSelector("#root"));

        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));

        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("OM"));

        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[href*='og']"));
        wd.findElement(By.cssSelector("[href^='/log']"));
        wd.findElement(By.cssSelector("[href$='gin']"));
    }

    @AfterTest
    public void postcondition(){
        wd.quit();
    }
}
