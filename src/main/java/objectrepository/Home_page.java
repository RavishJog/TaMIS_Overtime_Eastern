package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {
    private static WebElement element = null;

    //Objects
    //Object for Welcome title
    private static By lbl_Welcome = By.xpath("//strong[contains(text(),'Welcome to Our Website!')]");
    public static WebElement Welcome(WebDriver driver) {
        element = driver.findElement(lbl_Welcome);
        return element;
    }

    //Object for Login Button
    private static By btn_login_fo = By.xpath("//a[@class='complainbtn'][contains(.,'Login')]");
    public static WebElement login_fo(WebDriver driver) {
        element = driver.findElement(btn_login_fo);
        return element;
    }


}


    //Object for About Us
//    private static By XXXX = By.xpath("XXXX");
//    public static WebElement XXXX(WebDriver driver) {
//        element = driver.findElement(XXXX);
//        return element;
//    }