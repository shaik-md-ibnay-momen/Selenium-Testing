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
        driver.get("https://www.google.com/");
    }

    public static void main(String[] args) {
        driver();
        browser_link();
    }
}