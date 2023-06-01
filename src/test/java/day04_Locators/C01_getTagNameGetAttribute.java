package day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");

        // aramakutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));



        // arama kutusunun tagName'inin "input" oldugunu test edin
        String tagName = aramaKutusu.getTagName();
        if (tagName.equals("input")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        // arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin
        String attName = aramaKutusu.getAttribute("name");

        if (attName.equals("field-keywords")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        // sayfayı kapatın
        driver.close();
    }
}
