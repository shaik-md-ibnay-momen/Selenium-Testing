import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class Main {
    private static WebDriver driver;

    public static void driver() {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium-Testing\\Selenium Jar & Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    static void browser_link(){
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4/index.php");
    }

    static void login()  {
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr419643");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("ebEZAqy");
        System.out.println("Hello, World!");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Hello, World!");
        menu();
        System.out.println("Hello, World!");
    }

    static void menu() {
        System.out.println("Hello, World!");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(3)")).click();
        System.out.println("Hello, World!");
        testcase1();
    }

    static void testcase1() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td > table > tbody > tr:nth-child(6) > td:nth-child(2) > input[type=text]")).sendKeys("Shaikh Mohammad");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        driver();
        browser_link();
        login();

    }
}