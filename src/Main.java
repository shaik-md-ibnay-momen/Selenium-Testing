import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    private static WebDriver driver;

    public static void driver() {
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Testing\\Selenium Jar & Drivers\\chromedriver_win32\\chromedriver.exe");
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
    }

    static void menu(){
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]")).click();
    }

    public static void main(String[] args) {
        driver();
        browser_link();
        login();
        menu();


    }
}