package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationForm {
    private static WebElement element = null;

    //Objects
    //Object for Instructions
    private static By lbl_Instructions = By.xpath("//h4[contains(.,'Instructions')]");
    public static WebElement Instructions(WebDriver driver) {
        element = driver.findElement(lbl_Instructions);
        return element;
    }

    //Object for Basic Details
    private static By lbl_Basic_details = By.xpath("//h4[contains(.,'Basic Details')]");
    public static WebElement Basic_details(WebDriver driver) {
        element = driver.findElement(lbl_Basic_details);
        return element;
    }

}

//Object for XXX
//    private static By XXXX = By.xpath("XXXX");
//    public static WebElement XXXX(WebDriver driver) {
//        element = driver.findElement(XXXX);
//        return element;
//    }
