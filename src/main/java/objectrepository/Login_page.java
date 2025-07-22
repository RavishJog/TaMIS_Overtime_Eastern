package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
    private static WebElement element = null;

    //Objects
    //Object for User Login Title
    private static By lbl_User_login = By.xpath("//h3[contains(.,'User Login')]");
    public static WebElement User_login(WebDriver driver) {
        element = driver.findElement(lbl_User_login);
        return element;
    }

    //Object for User Name
    private static By txt_User_name = By.xpath("//input[contains(@placeholder,'Username')]");
    public static WebElement User_name(WebDriver driver) {
        element = driver.findElement(txt_User_name);
        return element;
    }

    //Object for Password
    private static By txt_Password = By.xpath("//input[@placeholder='Password']");
    public static WebElement Password(WebDriver driver) {
        element = driver.findElement(txt_Password);
        return element;
    }

    //Object for Sign In Button
    private static By btn_Sign_in = By.xpath("//button[contains(.,'Sign In')]");
    public static WebElement Sign_in(WebDriver driver) {
        element = driver.findElement(btn_Sign_in);
        return element;
    }

    //Object for Error Message - Invalid User Name or Password
    private static By lbl_Invalid_username_password = By.xpath("//div[@class='alert alert-danger'][contains(.,'Invalid Username Or Password')]");
    public static WebElement Invalid_username_password(WebDriver driver) {
        element = driver.findElement(lbl_Invalid_username_password);
        return element;
    }

    //Object for Error Message - User Name Empty
    private static By lbl_Username_empty = By.xpath("//p[contains(.,'The Username field is required.')]");
    public static WebElement Username_empty(WebDriver driver) {
        element = driver.findElement(lbl_Username_empty);
        return element;
    }

    //Object for Error Message - Password Empty
    private static By lbl_Password_empty = By.xpath("//p[contains(.,'The Password field is required.')]");
    public static WebElement Password_empty(WebDriver driver) {
        element = driver.findElement(lbl_Password_empty);
        return element;
    }


}


//Object for About Us
//    private static By XXXX = By.xpath("XXXX");
//    public static WebElement XXXX(WebDriver driver) {
//        element = driver.findElement(XXXX);
//        return element;
//    }

