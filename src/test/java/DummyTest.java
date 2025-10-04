import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DummyTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void testBeforeAll(){
        System.out.println("We are going to do our testing");

        driver.get("https://www.google.com/");
    }
    @AfterTest
    public void testAfterAll(){
        driver.quit();
        System.out.println("We are done with our test");
    }

    @Test
    public void testNothingHere(){
        System.out.println("!!!YAY Testing noww");
        System.out.println("Title is "+driver.getTitle());
        Assert.assertTrue(true);
    }
}
