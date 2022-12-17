import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KongaWebTest {

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;
    public class kongawebtest {
        //import the selenium WebDriver
        private WebDriver driver;
        //We want to automate the ordering flow of Konga as an existing customer
        @BeforeTest
        public void startWebPage() throws InterruptedException {
            //locate where the chromedriver is
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            //1. Open your Chrome browser
            driver = new ChromeDriver();
            //2. Input your selected app URL (https://konga.com).
            driver.get("https://konga.com");
            Thread.sleep(5000);
            //3. Maximise the window
            driver.manage().window().maximize();
            //4. Get the page title
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/a/img"));
            //5. Click on Sign-in/Login button to open the Signup page
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
            Thread.sleep(5000);
        }
        @Test
        public void negativelogin() throws InterruptedException {
            //6. Input wrong email address
            driver.findElement(By.id("username")).sendKeys("cyndystest@yahoo.co.uk");
            //7. Input wrong password
            driver.findElement(By.id("password")).sendKeys("password");
            //8. Click on the Sign in/login/Continue button
            driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
            Thread.sleep(5000);
        }
        @Test
        public void positivelogin() throws InterruptedException {
            //9. Input your email address
            driver.findElement(By.id("username")).sendKeys("cyndysworld2000@yahoo.co.uk");
            //10. Input your password
            driver.findElement(By.id("password")).sendKeys("cinderella");
            //11. Click on the Sign in/login/Continue button
            driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
            Thread.sleep(5000);
            //12. Click on logout
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/ul/li[7]/a")).click();
        }
        @AfterTest
        public void closeBrowser() {
            //Quit the browser
            driver.quit();
        }
}
