import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    static void login(){
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr419643");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("ebEZAqy");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        System.out.println("Hello, World!");

        menu();
        System.out.println("Hello, World!");
    }

    static void menu(){
        System.out.println("Hello, World!");
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]")).click();
        System.out.println("Hello, World!");
        testcase1();
    }

    static void testcase1(){
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("Shaikh Mohammad");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        driver();
        browser_link();
        login();
       driver.quit();
    }
}