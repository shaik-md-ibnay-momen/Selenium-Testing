import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    private static WebDriver driver;

    public static void driver() {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium-Testing\\Selenium Jar & Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    static void browser_link(){
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
    }

    static void selectPassNumber(){
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div[1]")).click();
    }

    public static void main(String[] args) {
        driver();
        browser_link();
        selectPassNumber();

    }


}
