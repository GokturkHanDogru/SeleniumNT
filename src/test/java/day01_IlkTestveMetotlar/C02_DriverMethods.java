package day01_IlkTestveMetotlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // getTitle()
        driver.get("http://amazon.com");
        System.out.println("Amazon Header:"+driver.getTitle());
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Value: "+amazonWindowHandle);

        driver.get("https://www.adidas.de/");
        System.out.println("Adidas Header: "+driver.getTitle());

        //getCurrentUrl()
        System.out.println("Adidas Actual Url: "+driver.getCurrentUrl());

        //getPageSource()
        //System.out.println(driver.getPageSource());

        //getWindowHandle() Gidilen sayfanin handle degerini verir. Bu handle degerini sayfalar arasi gecis icin kullaniriz
        System.out.println("Adidas Window Handle Value: "+driver.getWindowHandle());

    }
}
