import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testCSS() {
        wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));
        wd.findElement(By.xpath("//table //tr[7] //td[3]"));

        System.out.println(wd.findElements(By.cssSelector("#customers tr")).size());
        System.out.println(wd.findElements(By.xpath("//table[@id='customers'] //tr")).size());

        System.out.println(wd.findElements(By.cssSelector("#customers th")).size());
        System.out.println(wd.findElements(By.xpath("//table[@id='customers'] //th")).size());

        wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        wd.findElement(By.xpath("//table[@id='customers'] //tr[3]"));

        wd.findElement(By.cssSelector("#customers tr:last-child"));
        wd.findElement(By.xpath("//table[@id='customers'] //tr[9]"));
    }

    @AfterMethod
    public void tearDown() {
       wd.quit();
    }


}
