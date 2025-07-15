package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_front {
    private static WebElement element = null;

    //Objects
    //Object for Dashboard Label
    private static By lbl_Dashboard_front_user = By.xpath("//span[contains(.,'Dashboard')]");
    public static WebElement Dashboard_front_user(WebDriver driver) {
        element = driver.findElement(lbl_Dashboard_front_user);
        return element;
    }

    //Object for Apply
    private static By lbl_Apply = By.xpath("//span[contains(.,'Apply')]");
    public static WebElement Apply(WebDriver driver) {
        element = driver.findElement(lbl_Apply);
        return element;
    }

    //Object for Applications
    private static By lbl_Applications = By.xpath("//span[contains(.,'Applications')]");
    public static WebElement Applications(WebDriver driver) {
        element = driver.findElement(lbl_Applications);
        return element;
    }

    //Object for My Documents
    private static By lbl_My_documents = By.xpath("//span[contains(.,'My Documents')]");
    public static WebElement My_documents(WebDriver driver) {
        element = driver.findElement(lbl_My_documents);
        return element;
    }

//Object for Profile Icon
    private static By btn_Profile_icon = By.xpath("//img[contains(@class,'topuser-image')]");
    public static WebElement Profile_icon(WebDriver driver) {
        element = driver.findElement(btn_Profile_icon);
        return element;
    }

    //Object for Logout
    private static By lbl_Logout = By.xpath("//a[contains(.,'Logout')]");
    public static WebElement Logout(WebDriver driver) {
        element = driver.findElement(lbl_Logout);
        return element;
    }

    //Object for Select Course Name
    private static By lbl_Select_course_name = By.xpath("//select[@id='course_id']");
    public static WebElement Select_course_name(WebDriver driver) {
        element = driver.findElement(lbl_Select_course_name);
        return element;
    }

    //Object for Select BSC Web and Multimedia Development
    private static By lbl_BSC_web_and_multimedia_development = By.xpath("//option[contains(text(),'BSC web and multimedia development')]");
    public static WebElement BSC_web_and_multimedia_development(WebDriver driver) {
        element = driver.findElement(lbl_BSC_web_and_multimedia_development);
        return element;
    }

    //Object for Select Organisation
    private static By lbl_Select_organisation = By.xpath("//select[@id='organization_id']");
    public static WebElement Select_organisation(WebDriver driver) {
        element = driver.findElement(lbl_Select_organisation);
        return element;
    }

    //Object for Open University
    private static By lbl_Open_university = By.xpath("//option[contains(text(),'Open university')]");
    public static WebElement Open_university(WebDriver driver) {
        element = driver.findElement(lbl_Open_university);
        return element;
    }

    //Object for Next Button
    private static By btn_Next = By.xpath("//button[contains(.,'Next')]");
    public static WebElement Next(WebDriver driver) {
        element = driver.findElement(btn_Next);
        return element;
    }

    //Object for Instructions
    private static By lbl_Instructions = By.xpath("//h4[contains(.,'Instructions')]");
    public static WebElement Instructions(WebDriver driver) {
        element = driver.findElement(lbl_Instructions);
        return element;
    }

}

//Object for XXX
//    private static By XXXX = By.xpath("XXXX");
//    public static WebElement XXXX(WebDriver driver) {
//        element = driver.findElement(XXXX);
//        return element;
//    }
