package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow_CountHyperlinks {
    ChromeDriver driver;

    public BookMyShow_CountHyperlinks() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        //Open URL  "https://in.bookmyshow.com/explore/home/chennai"
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        Thread.sleep(50000);
        //Locate all the anchor links Using Locator "Tag Name" "a"
        List <WebElement> links=driver.findElementsByTagName("a");
        //Print  the count of hyperlinks   Using links.size() method
        System.out.println("The count of hyperlinks in the website "+links.size());
     
    }

}
