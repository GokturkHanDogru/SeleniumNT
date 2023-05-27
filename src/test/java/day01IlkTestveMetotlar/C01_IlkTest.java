package day01IlkTestveMetotlar;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

       driver.get("https://www.adidas.de/");
        try {
            driver.wait(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
