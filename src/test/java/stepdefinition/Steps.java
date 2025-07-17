package stepdefinition;

import com.cucumber.listener.Reporter;
import commonmethods.Utility;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.*;
import org.apache.bcel.generic.TABLESWITCH;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Steps extends Utility {

    protected static WebDriver driver;

    private String Hrs_worked_day1;
    private String Hrs_worked_OT_day1;
    private String Hrs_worked_OT_day2;
    private String Var_OT1_1;
    private String Var_OT1_2;
    private String Var_OT2_1;
    private String Var_OT2_2;
    private String Var_OT3_1;
    private String Var_OT3_2;
    private String Var_OTSun_1;
    private String Var_OTSun_2;
    private String Var_OTPH_1;
    private String Var_OTPH_2;
    private String Var_OTM1_1;
    private String Var_OTM1_2;
    private String Var_OTA1_1;
    private String Var_OTA1_2;
    private String Var_OTM2_1;
    private String Var_OTM2_2;
    private String Var_OTA2_1;
    private String Var_OTA2_2;
    private String Var_OTM3_1;
    private String Var_OTM3_2;
    private String Var_OTA3_1;
    private String Var_OTA3_2;
    private String Var_OTSUNPH_A_1;
    private String Var_OTSUNPH_A_2;
    private String Var_OTTotal_1;
    private String Var_OTTotal_2;
    private String Var_OLH_1;
    private String Var_OLH_2;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies(); // Clears all cookies

    }

    @BeforeMethod
    public void setUpEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().deleteAllCookies(); // Clears all cookies

    }

    @Before
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj.joggessur\\Desktop\\Automation Testing\\Small-Farmers-Welfare-Fund\\chromedriver.exe");
    }

    @AfterMethod
    public void tearDown() {
        driver.manage().deleteAllCookies();

        if (driver != null) {
            driver.quit();
        }
    }

    public Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            // calling Sceenshot function
            takeScreenShot(scenario);
        }
        try {
            driver.quit();
        } catch (Exception e) {
            System.out.println(String.valueOf(e));
        }
    }

    @After
    public static void setup() {

        Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", System.getProperty("user.os"));
        Reporter.setTestRunnerOutput("Sample test runner output message");

        driver.quit();

    }

    @Given("^I am on Eastern Test Env - Front \"([^\"]*)\"$")
    public void iAmOnEasternTestEnvFront(String Browser) throws Throwable {
        if (Browser.equals("Chrome")) {
            setUp();
            driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
            driver.get("http://130.1.17.51:8080/TAMIS/");
            driver.manage().window().maximize();
        } else if (Browser.equals("Edge")) {
            setUp();
            driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
            driver.get("http://130.1.17.51:8080/TAMIS/");
            driver.manage().window().maximize();
        } else {
            System.out.println("No browser found");
        }
    }


    @And("^I Verify Welcome Title$")
    public void iVerifyWelcomeTitle() {
        WebDriverWait w = new WebDriverWait(driver, 120);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[contains(.,'Welcome to Our Website!')]")));
        try {
            Home_page.Welcome(driver);
        } catch (Exception e) {
            System.out.println("Welcome page did not appear");
            Assert.fail("Welcome page did not appear");
        }
    }

    @When("^I Click on Login button$")
    public void iClickOnLoginButton() {
        Home_page.login_fo(driver).click();
    }

    @And("^I Verify User Login Page$")
    public void iVerifyUserLoginPage() {
        WebDriverWait w = new WebDriverWait(driver, 120);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(.,'User Login')]")));
        try {
            Login_page.User_login(driver);
        } catch (Exception e) {
            System.out.println("User Login page did not appear");
            Assert.fail("User Login page did not appear");
        }
    }

    @And("^I Input User Name \"([^\"]*)\"$")
    public void iInputUserName(String User_Name) throws Throwable {
        Login_page.User_name(driver).sendKeys(User_Name);
    }

    @And("^I Input Password \"([^\"]*)\"$")
    public void iInputPassword(String Password) throws Throwable {
        Login_page.Password(driver).sendKeys(Password);
    }

    @And("^I Click on Sign In Button$")
    public void iClickOnSignInButton() {
        Login_page.Sign_in(driver).click();
    }

    @And("^I Verify Error Login Message \"([^\"]*)\"$")
    public void iVerifyErrorLoginMessage(String Error_Login) throws Throwable {
        if (Error_Login.equals("Invalid")) {
            try {
                Login_page.Invalid_username_password(driver);
            } catch (Exception e) {
                System.out.println("Invalid Credential message did not appear");
                Assert.fail("Invalid Credential message did not appear");
            }
        } else if (Error_Login.equals("UserName_Empty")) {
            try {
                Login_page.Username_empty(driver);
            } catch (Exception e) {
                System.out.println("Username empty message did not appear");
                Assert.fail("Username empty message did not appear");
            }
        } else if (Error_Login.equals("Password_Empty")) {
            try {
                Login_page.Password_empty(driver);
            } catch (Exception e) {
                System.out.println("Password empty message did not appear");
                Assert.fail("Password empty message did not appear");
            }
        } else {
            System.out.println("No error message required - Login was successful");
        }
    }

    @And("^I Verify navigation to Registered User Dashboard$")
    public void iVerifyNavigationToRegisteredUserDashboard() {
        WebDriverWait w = new WebDriverWait(driver, 120);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'Dashboard')]")));
        try {
            Dashboard_front.Dashboard_front_user(driver);
        } catch (Exception e) {
            System.out.println("Dashboard label did not appear");
            Assert.fail("Dashboard label did not appear");
        }
    }

    @And("^I Verify Apply label$")
    public void iVerifyApplyLabel() {
        try {
            Dashboard_front.Apply(driver);
        } catch (Exception e) {
            System.out.println("Apply label did not appear");
            Assert.fail("Apply label did not appear");
        }
    }

    @And("^I Verify Applications label$")
    public void iVerifyApplicationsLabel() {
        try {
            Dashboard_front.Applications(driver);
        } catch (Exception e) {
            System.out.println("Applications label did not appear");
            Assert.fail("Applications label did not appear");
        }
    }

    @And("^I Verify My Documents label$")
    public void iVerifyMyDocumentsLabel() {
        try {
            Dashboard_front.My_documents(driver);
        } catch (Exception e) {
            System.out.println("My Documents label did not appear");
            Assert.fail("My Documents label did not appear");
        }
    }

    @And("^I Click on Sign Out$")
    public void iClickOnSignOut() throws InterruptedException {
        Dashboard_front.Profile_icon(driver).click();
        Thread.sleep(3000);
        Dashboard_front.Logout(driver).click();
    }

    @And("^I Select Course Name \"([^\"]*)\"$")
    public void iSelectCourseName(String Course_Name) throws Throwable {
        if (Course_Name.equals("BSC Web and Multimedia Development")) {
            try {
                Dashboard_front.Select_course_name(driver).click();
                Thread.sleep(2000);
                Dashboard_front.BSC_web_and_multimedia_development(driver).click();
            } catch (Exception e) {
                System.out.println("BSC Web and Multimedia Development did not appear");
                Assert.fail("BSC Web and Multimedia Development did not appear");
            }
//        } else if (Course_Name.equals("UserName_Empty")) {
//            try {
//                Login_page.Username_empty(driver);
//            } catch (Exception e) {
//                System.out.println("Username empty message did not appear");
//                Assert.fail("Username empty message did not appear");
//            }
//        } else if (Course_Name.equals("Password_Empty")) {
//            try {
//                Login_page.Password_empty(driver);
//            } catch (Exception e) {
//                System.out.println("Password empty message did not appear");
//                Assert.fail("Password empty message did not appear");
//            }
        } else {
            System.out.println("Course Name does not exist");
            Assert.fail("Course Name does not exist");
        }
    }

    @And("^I Select Organisation \"([^\"]*)\"$")
    public void iSelectOrganisation(String Organisation) throws Throwable {
        if (Organisation.equals("Open University")) {
            try {
                Dashboard_front.Select_organisation(driver).click();
                Thread.sleep(2000);
                Dashboard_front.Open_university(driver).click();
            } catch (Exception e) {
                System.out.println("Open University did not appear");
                Assert.fail("Open University did not appear");
            }
//        } else if (Course_Name.equals("UserName_Empty")) {
//            try {
//                Login_page.Username_empty(driver);
//            } catch (Exception e) {
//                System.out.println("Username empty message did not appear");
//                Assert.fail("Username empty message did not appear");
//            }
//        } else if (Course_Name.equals("Password_Empty")) {
//            try {
//                Login_page.Password_empty(driver);
//            } catch (Exception e) {
//                System.out.println("Password empty message did not appear");
//                Assert.fail("Password empty message did not appear");
//            }
        } else {
            System.out.println("Organisation Name does not exist");
            Assert.fail("Organisation Name does not exist");
        }
    }

    @And("^I Click on Next Button$")
    public void iClickOnNextButton() {
        Dashboard_front.Next(driver).click();
    }

    @And("^I Verify Display of Application Form$")
    public void iVerifyDisplayOfApplicationForm() {
        WebDriverWait w = new WebDriverWait(driver, 120);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[contains(.,'Basic Details')]")));
            try {
                ApplicationForm.Basic_details(driver);
            } catch (Exception e) {
                System.out.println("Application page did not appear");
                Assert.fail("Application page did not appear");
            }
        }


    @And("^I Click on Apply label$")
    public void iClickOnApplyLabel() {
        try {
            Dashboard_front.Apply(driver).click();
        } catch (Exception e) {
            System.out.println("Apply label did not appear");
            Assert.fail("Apply label did not appear");
        }
    }

    @And("^I Verify Display of Selection of Course page$")
    public void iVerifyDisplayOfSelectionOfCoursePage() {
        WebDriverWait w = new WebDriverWait(driver, 120);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[contains(.,'Course Details')]")));
        try {
            Dashboard_front.Instructions(driver);
        } catch (Exception e) {
            System.out.println("Selection of Course page did not appear");
            Assert.fail("Selection of Course page did not appear");
        }
    }

    @And("^I Verify Login Page$")
    public void iVerifyLoginPage() {
        WebDriverWait w = new WebDriverWait(driver, 120);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit'][contains(.,'Sign In')]")));
        try {
            driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Sign In')]"));
        } catch (Exception e) {
            System.out.println("Login page did not appear");
            Assert.fail("Login page did not appear");
        }

    }

    @And("^I Sign In as HR \"([^\"]*)\" \"([^\"]*)\"$")
    public void iSignInAsHR(String User_Name, String Password) throws Throwable {
        driver.findElement(By.xpath("//input[contains(@id,'username')][@name='j_username']")).sendKeys(User_Name);
        driver.findElement(By.xpath("//input[contains(@id,'password')][@name='j_password']")).sendKeys(Password);
        driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Sign In')]")).click();

    }

    @And("^I Verify Successful Login$")
    public void iVerifySuccessfulLogin() {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='menu-label'][contains(.,'Human Resource')]")));
        try {
            driver.findElement(By.xpath("//p[@class='menu-label'][contains(.,'Human Resource')]"));
        } catch (Exception e) {
            System.out.println("Success Login failed");
            Assert.fail("Success Login failed");
        }
        takeScreenShot(scenario);

    }

    @And("^I Click on Human Resource$")
    public void iClickOnHumanResource() {
        WebDriverWait w = new WebDriverWait(driver, 60);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='menu-label'][contains(.,'Human Resource')]")));
        driver.findElement(By.xpath("//p[@class='menu-label'][contains(.,'Human Resource')]")).click();

    }

    @And("^I Click on Attendance$")
    public void iClickOnAttendance() throws InterruptedException {
//        WebDriverWait w = new WebDriverWait(driver, 30);
//        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='ui-menuitem-text'][contains(.,'Attendance')])[1]")));

//        try {
//            driver.findElement(By.xpath("(//span[@class='ui-menuitem-text'][contains(.,'Attendance')])[1]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("(//span[@class='ui-menuitem-text'][contains(.,'Attendance')])[1]")).click();

//        } catch (Exception e) {
//            System.out.println("Attendance failed");
//            Assert.fail("Attendance failed");
//        }

        // Locate the element to hover over
        WebElement elementToHover = driver.findElement(By.xpath("(//span[@class='ui-menuitem-text'][contains(.,'Attendance')])[1]"));

// Create Actions instance
        Actions actions = new Actions(driver);

// Perform hover action
        actions.moveToElement(elementToHover).perform();


        Thread.sleep(2000);
    }

    @And("^I Click on Retrieve Attendance$")
    public void iClickOnRetrieveAttendance() {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='ui-menuitem-text'][contains(.,'Retrieve Attendance')]")));
        try {
            driver.findElement(By.xpath("//span[@class='ui-menuitem-text'][contains(.,'Retrieve Attendance')]")).click();
        } catch (Exception e) {
            System.out.println("Retrieve Attendance failed");
            Assert.fail("Retrieve Attendance failed");
        }
    }

    @And("^I Input Attendance Date \"([^\"]*)\"$")
    public void iInputAttendanceDate(String Date1) throws Throwable {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'input')][@name='selectDate:attendanceDate_input']")));
        try {
            driver.findElement(By.xpath("//input[contains(@id,'input')][@name='selectDate:attendanceDate_input']")).sendKeys(Date1);
        } catch (Exception e) {
            System.out.println("Sending Date failed");
            Assert.fail("Sending Date failed");
        }
    }

    @And("^I Click on Query Button$")
    public void iClickOnQueryButton() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  driver.findElement(By.xpath("//span[@class='ui-button-text ui-c'][contains(.,'Query')]")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c'][contains(.,'Query')]")).click();
        Thread.sleep(3000);
    }

    @And("^I Select Employee Code \"([^\"]*)\"$")
    public void iSelectEmployeeCode(String Emp_Code) throws Throwable {
        driver.findElement(By.xpath("//label[contains(.,'- All Employees -')]")).click();
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'selectDate:empCode_filter')]")));
        try {
            driver.findElement(By.xpath("//input[contains(@id,'selectDate:empCode_filter')]")).sendKeys(Emp_Code + Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Sending Emp Code failed");
            Assert.fail("Sending Emp Code failed");
        }

    }


    @And("^I Verify Hours Worked for Day one \"([^\"]*)\"$")
    public void iVerifyHoursWorkedForDayOne(String Hrs_wrk_one) throws Throwable {
        driver.findElement(By.xpath("(//td[contains(@role,'gridcell')])[13]"));
        Hrs_worked_day1 = driver.findElement(By.xpath("(//td[contains(@role,'gridcell')])[13]")).getText();
        System.out.println("Text from source element: " + Hrs_worked_day1);
        if (Hrs_wrk_one.equals(Hrs_worked_day1)){
            System.out.println("Hours Work is good");
        } else {
            Assert.fail("Hours Work is NOT good");
        }
        takeScreenShot(scenario);

    }

    @And("^I Click on Process Button$")
    public void iClickOnProcessButton() {
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c'][contains(.,'Process')]")).click();

    }

    @And("^I Verify Success Message for Process Attendance$")
    public void iVerifySuccessMessageForProcessAttendance() {
        WebDriverWait w = new WebDriverWait(driver, 120);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'Records processed successfully')]")));
        try {
            driver.findElement(By.xpath("//span[contains(.,'Records processed successfully')]"));
        } catch (Exception e) {
            System.out.println("Success Message for Processing Attendance did not appear");
            Assert.fail("Success Message for Processing Attendance did not appear");
        }
        takeScreenShot(scenario);

    }

    @And("^I Click on Manage Overtime Hours$")
    public void iClickOnManageOvertimeHours() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='ui-menuitem-text'][contains(.,'Manage Overtime Hours')]")));
        try {
            driver.findElement(By.xpath("//span[@class='ui-menuitem-text'][contains(.,'Manage Overtime Hours')]")).click();
        } catch (Exception e) {
            System.out.println("Manage Overtime Hours option did not appear");
            Assert.fail("Manage Overtime Hours option did not appear");
        }


    }

    @And("^I Verify Manage Overtime Hours Page$")
    public void iVerifyManageOvertimeHoursPage() {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(.,'View/Edit Daily Overtime Hours')]")));
        try {
            driver.findElement(By.xpath("//h1[contains(.,'View/Edit Daily Overtime Hours')]"));
        } catch (Exception e) {
            System.out.println("Manage Overtime Hours Page did not appear");
            Assert.fail("Manage Overtime Hours Page did not appear");
        }
        takeScreenShot(scenario);

    }

    @And("^I Select Company Name$")
    public void iSelectCompanyName() {
        driver.findElement(By.xpath("//label[contains(.,'- Company ProfileList: -')]")).click();
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(.,'SIL - State Informatics Ltd')]")));
        try {
            driver.findElement(By.xpath("//li[contains(.,'SIL - State Informatics Ltd')]")).click();
        } catch (Exception e) {
            System.out.println("Company Name did not appear");
            Assert.fail("Company Name did not appear");
        }

    }

    @And("^I Select Location \"([^\"]*)\"$")
    public void iSelectLocation(String Location) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(.,'- Location Lists: -')]")).click();
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='selectDate:location_filter']")));
        try {
            driver.findElement(By.xpath("//input[@name='selectDate:location_filter']")).sendKeys(Location + Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Sending Location failed");
            Assert.fail("Sending Location failed");
        }

    }

    @And("^I Input Date From and Date To \"([^\"]*)\" \"([^\"]*)\"$")
    public void iInputDateFromAndDateTo(String Date1, String Date2) throws Throwable {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'input')][@name='selectDate:attFromDate_input']")));
        try {
            driver.findElement(By.xpath("//input[contains(@id,'input')][@name='selectDate:attFromDate_input']")).sendKeys(Date1 + Keys.TAB);
        } catch (Exception e) {
            System.out.println("Sending Date1 failed");
            Assert.fail("Sending Date1 failed");

        }

        WebDriverWait ww = new WebDriverWait(driver, 30);
        WebElement element2 = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'input')][@name='selectDate:attToDate_input']")));
        try {
            driver.findElement(By.xpath("//input[contains(@id,'input')][@name='selectDate:attToDate_input']")).sendKeys(Date2 + Keys.TAB);
        } catch (Exception e) {
            System.out.println("Sending Date2 failed");
            Assert.fail("Sending Date2 failed");
        }
        Thread.sleep(5000);
    }

    @And("^I Click on Query Overtime Hours$")
    public void iClickOnQueryOvertimeHours() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c'][contains(.,'Query OverTime Hours')]")).click();
        Thread.sleep(3000);

    }

    @And("^I Input Employee Code \"([^\"]*)\"$")
    public void iInputEmployeeCode(String Emp_Code) throws Throwable {
        driver.findElement(By.xpath("//label[contains(.,'- All Employees -')]")).click();
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(.,'- All Employees -')]")));
        try {
            driver.findElement(By.xpath("//label[contains(.,'- All Employees -')]")).click();
            driver.findElement(By.xpath("//label[contains(.,'- All Employees -')]")).sendKeys(Emp_Code + Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Sending Emp Code failed");
            Assert.fail("Sending Emp Code failed");
        }
    }

    @And("^I Verify Hours Work in Manage OT \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyHoursWorkInManageOT(String Hrs_wrk_one, String Hrs_wrk_two) throws Throwable {
        if (Hrs_wrk_one.equals("null")){
            System.out.println("Hours Work 1 verification not needed");
        } else {
            Hrs_worked_OT_day1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[9]")).getText();
            if (Hrs_worked_OT_day1.equals(Hrs_wrk_one)) {
                System.out.println("Text from source element: " + Hrs_worked_OT_day1);
            } else
            Assert.assertEquals("Hours Work 1 is NOT good", Hrs_wrk_one, Hrs_worked_OT_day1);
        }
        Thread.sleep(1000);
        if (Hrs_wrk_two.equals("null")){
            System.out.println("Hours Work 2 verification not needed");
        } else {
            Hrs_worked_OT_day2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[27]")).getText();
            if (Hrs_worked_OT_day2.equals(Hrs_wrk_two)) {
                System.out.println("Text from source element: " + Hrs_worked_OT_day2);
            } else
            Assert.assertEquals("Hours Work 2 is NOT good", Hrs_wrk_two, Hrs_worked_OT_day2);
        }
        takeScreenShot(scenario);


    }


    @And("^I Verify Overtime Hours \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyOvertimeHours(String OTPHDay2, String OT15Day1, String OT15Day2, String OT20Day1, String OT20Day2, String OT30Day1, String OT30Day2, String OTSUNDay1, String OTSUNDay2, String OTPHDay1) throws Throwable {


        // ---- OT 1.5 Day 1 ----
        // ---- OT 1.5 Hrs ----
        if ("null".equals(OT15Day1)) {
            System.out.println("OT 1.5 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OT1_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[10]")).getText();
            if (Var_OT1_1.equals(OT15Day1)) {
                System.out.println("OT 1.5 Day 1 value: " + Var_OT1_1);
            } else
                Assert.assertEquals("OT 1.5 Day 1 is NOT good", OT15Day1, Var_OT1_1);
        }

        if ("null".equals(OT15Day2)) {
            System.out.println("OT 1.5 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OT1_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[28]")).getText();
            if (Var_OT1_2.equals(OT15Day2)) {
                System.out.println("OT 1.5 Day 2 value: " + Var_OT1_2);
            } else
                Assert.assertEquals("OT 1.5 Day 2 is NOT good", OT15Day2, Var_OT1_2);
        }

        // ---- OT 2.0 Hrs ----
        if ("null".equals(OT20Day1)) {
            System.out.println("OT 2.0 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OT2_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[11]")).getText();
            if (Var_OT2_1.equals(OT20Day1)) {
                System.out.println("OT 2.0 Day 1 value: " + Var_OT2_1);
            } else
                Assert.assertEquals("OT 2.0 Day 1 is NOT good", OT20Day1, Var_OT2_1);
        }

        if ("null".equals(OT20Day2)) {
            System.out.println("OT 2.0 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OT2_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[29]")).getText();
            if (Var_OT2_2.equals(OT20Day2)) {
                System.out.println("OT 2.0 Day 2 value: " + Var_OT2_2);
            } else
                Assert.assertEquals("OT 2.0 Day 2 is NOT good", OT20Day2, Var_OT2_2);
        }

        // ---- OT 3.0 Hrs ----
        if ("null".equals(OT30Day1)) {
            System.out.println("OT 3.0 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OT3_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[12]")).getText();
            if (Var_OT3_1.equals(OT30Day1)) {
                System.out.println("OT 3.0 Day 1 value: " + Var_OT3_1);
            } else
                Assert.assertEquals("OT 3.0 Day 1 is NOT good", OT30Day1, Var_OT3_1);
        }

        if ("null".equals(OT30Day2)) {
            System.out.println("OT 3.0 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OT3_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[30]")).getText();
            if (Var_OT3_2.equals(OT30Day1)) {
                System.out.println("OT 3.0 Day 2 value: " + Var_OT3_2);
            } else
                Assert.assertEquals("OT 3.0 Day 2 is NOT good", OT30Day1, Var_OT3_2);
        }

        // ---- OT SUN ----
        if ("null".equals(OTSUNDay1)) {
            System.out.println("OT SUN Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTSun_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[13]")).getText();
            if (Var_OTSun_1.equals(OTSUNDay1)) {
                System.out.println("OT SUN Day 1 value: " + Var_OTSun_1);
            } else
                Assert.assertEquals("OT SUN Day 1 is NOT good", OTSUNDay1, Var_OTSun_1);
        }

        if ("null".equals(OTSUNDay2)) {
            System.out.println("OT SUN Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTSun_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[31]")).getText();
            if (Var_OTSun_2.equals(OTSUNDay2)) {
                System.out.println("OT SUN Day 2 value: " + Var_OTSun_2);
            } else
                Assert.assertEquals("OT SUN Day 2 is NOT good", OTSUNDay2, Var_OTSun_2);
        }

        // ---- OT PH ----
        if ("null".equals(OTPHDay1)) {
            System.out.println("OT PH Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTPH_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[14]")).getText();
            if (Var_OTPH_1.equals(OTPHDay1)) {
                System.out.println("OT PH Day 1 value: " + Var_OTPH_1);
            } else
                Assert.assertEquals("OT PH Day 1 is NOT good", OTPHDay1, Var_OTPH_1);
        }

        if ("null".equals(OTPHDay2)) {
            System.out.println("OT PH Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTPH_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[32]")).getText();
            if (Var_OTPH_2.equals(OTPHDay2)) {
                System.out.println("OT PH Day 2 value: " + Var_OTPH_2);
            } else
                Assert.assertEquals("OT PH Day 2 is NOT good", OTPHDay2, Var_OTPH_2);
        }

        takeScreenShot(scenario);

    }

    @And("^I Click on Save Button$")
    public void iClickOnSaveButton() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  driver.findElement(By.xpath("//span[contains(.,'Save')]")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(.,'Save')]")).click();
    }

    @And("^I Verify Success Message for OT Saved$")
    public void iVerifySuccessMessageForOTSaved() {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'Overtime Records Saved Successfully.')]")));
        try {
            driver.findElement(By.xpath("//span[contains(.,'Overtime Records Saved Successfully.')]"));
        } catch (Exception e) {
            System.out.println("Success OT Saved failed");
            Assert.fail("Success OT Saved failed");
        }
        takeScreenShot(scenario);

    }

    @And("^I Click on Manage Overtime Hours and Meals$")
    public void iClickOnManageOvertimeHoursAndMeals() {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='ui-menuitem-text'][contains(.,'Manage Overtime and Meals')]")));
        try {
            driver.findElement(By.xpath("//span[@class='ui-menuitem-text'][contains(.,'Manage Overtime and Meals')]")).click();
        } catch (Exception e) {
            System.out.println("Manage Overtime Hours and Meals option did not appear");
            Assert.fail("Manage Overtime Hours and Meals option did not appear");
        }
    }

    @And("^I Verify Manage Overtime Hours and Meals Page$")
    public void iVerifyManageOvertimeHoursAndMealsPage() {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(.,'Attendance Management System')]")));
        try {
            driver.findElement(By.xpath("//h1[contains(.,'Attendance Management System')]"));
        } catch (Exception e) {
            System.out.println("Manage Overtime Hours and Meals Page did not appear");
            Assert.fail("Manage Overtime Hours and Meals Page did not appear");
        }
        takeScreenShot(scenario);

    }


    @And("^I Verify Overtime Hours and Amount \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyOvertimeHoursAndAmount(String OT15Day1, String OT15Day2, String OT20Day1, String OT20Day2, String OT30Day1, String OT30Day2, String OTSUNDay1, String OTSUNDay2, String OTPHDay1, String OTPHDay2, String OT15Amt1, String OT15Amt2, String OT20Amt1, String OT20Amt2, String OT30Amt1, String OT30Amt2, String OTSUNPHAmt1, String OTSUNPHAmt2, String Total_Amt1, String Total_Amt2, String Off_Leave_amt1, String Off_Leave_amt2) throws Throwable {

        // --- OT 1.5 Hours & Amount ---
        if ("null".equals(OT15Day1)) {
            System.out.println("OT 1.5 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTM1_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[9]")).getText();
            if (Var_OTM1_1.equals(OT15Day1)) {
                System.out.println("OT 1.5 Day 1 value: " + Var_OTM1_1);
            } else {
                Assert.assertEquals("OT 1.5 Day 1 is NOT good", OT15Day1, Var_OTM1_1);
            }
        }
        if ("null".equals(OT15Day2)) {
            System.out.println("OT 1.5 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTM1_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[29]")).getText();
            if (Var_OTM1_2.equals(OT15Day2)) {
                System.out.println("OT 1.5 Day 2 value: " + Var_OTM1_2);
            } else {
                Assert.assertEquals("OT 1.5 Day 2 is NOT good", OT15Day2, Var_OTM1_2);
            }
        }
        if ("null".equals(OT15Amt1)) {
            System.out.println("OT 1.5 Amount Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTA1_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[10]")).getText();
            if (Var_OTA1_1.equals(OT15Amt1)) {
                System.out.println("OT 1.5 Amount Day 1: " + Var_OTA1_1);
            } else {
                Assert.assertEquals("OT 1.5 Amount Day 1 mismatch", OT15Amt1, Var_OTA1_1);
            }
        }
        if ("null".equals(OT15Amt2)) {
            System.out.println("OT 1.5 Amount Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTA1_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[30]")).getText();
            if (Var_OTA1_2.equals(OT15Amt2)) {
                System.out.println("OT 1.5 Amount Day 2: " + Var_OTA1_2);
            } else {
                Assert.assertEquals("OT 1.5 Amount Day 2 mismatch", OT15Amt2, Var_OTA1_2);
            }
        }

// --- OT 2.0 Hours & Amount ---
        if ("null".equals(OT20Day1)) {
            System.out.println("OT 2.0 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTM2_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[11]")).getText();
            if (Var_OTM2_1.equals(OT20Day1)) {
                System.out.println("OT 2.0 Day 1 value: " + Var_OTM2_1);
            } else {
                Assert.assertEquals("OT 2.0 Day 1 is NOT good", OT20Day1, Var_OTM2_1);
            }
        }
        if ("null".equals(OT20Day2)) {
            System.out.println("OT 2.0 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTM2_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[31]")).getText();
            if (Var_OTM2_2.equals(OT20Day2)) {
                System.out.println("OT 2.0 Day 2 value: " + Var_OTM2_2);
            } else {
                Assert.assertEquals("OT 2.0 Day 2 is NOT good", OT20Day2, Var_OTM2_2);
            }
        }
        if ("null".equals(OT20Amt1)) {
            System.out.println("OT 2.0 Amount Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTA2_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[12]")).getText();
            if (Var_OTA2_1.equals(OT20Amt1)) {
                System.out.println("OT 2.0 Amount Day 1: " + Var_OTA2_1);
            } else {
                Assert.assertEquals("OT 2.0 Amount Day 1 mismatch", OT20Amt1, Var_OTA2_1);
            }
        }
        if ("null".equals(OT20Amt2)) {
            System.out.println("OT 2.0 Amount Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTA2_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[32]")).getText();
            if (Var_OTA2_2.equals(OT20Amt2)) {
                System.out.println("OT 2.0 Amount Day 2: " + Var_OTA2_2);
            } else {
                Assert.assertEquals("OT 2.0 Amount Day 2 mismatch", OT20Amt2, Var_OTA2_2);
            }
        }

// --- OT 3.0 Hours & Amount ---
        if ("null".equals(OT30Day1)) {
            System.out.println("OT 3.0 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTM3_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[13]")).getText();
            if (Var_OTM3_1.equals(OT30Day1)) {
                System.out.println("OT 3.0 Day 1 value: " + Var_OTM3_1);
            } else {
                Assert.assertEquals("OT 3.0 Day 1 is NOT good", OT30Day1, Var_OTM3_1);
            }
        }
        if ("null".equals(OT30Day2)) {
            System.out.println("OT 3.0 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTM3_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[33]")).getText();
            if (Var_OTM3_2.equals(OT30Day2)) {
                System.out.println("OT 3.0 Day 2 value: " + Var_OTM3_2);
            } else {
                Assert.assertEquals("OT 3.0 Day 2 is NOT good", OT30Day2, Var_OTM3_2);
            }
        }
        if ("null".equals(OT30Amt1)) {
            System.out.println("OT 3.0 Amount Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTA3_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[14]")).getText();
            if (Var_OTA3_1.equals(OT30Amt1)) {
                System.out.println("OT 3.0 Amount Day 1: " + Var_OTA3_1);
            } else {
                Assert.assertEquals("OT 3.0 Amount Day 1 mismatch", OT30Amt1, Var_OTA3_1);
            }
        }
        if ("null".equals(OT30Amt2)) {
            System.out.println("OT 3.0 Amount Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTA3_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[34]")).getText();
            if (Var_OTA3_2.equals(OT30Amt2)) {
                System.out.println("OT 3.0 Amount Day 2: " + Var_OTA3_2);
            } else {
                Assert.assertEquals("OT 3.0 Amount Day 2 mismatch", OT30Amt2, Var_OTA3_2);
            }
        }

// --- OT SUN/PH Amount (only Amounts tracked) ---
        if ("null".equals(OTSUNPHAmt1)) {
            System.out.println("OT SUN/PH Amount Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTSUNPH_A_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[15]")).getText();
            if (Var_OTSUNPH_A_1.equals(OTSUNPHAmt1)) {
                System.out.println("OT SUN/PH Amount Day 1: " + Var_OTSUNPH_A_1);
            } else {
                Assert.assertEquals("OT SUN/PH Amount Day 1 mismatch", OTSUNPHAmt1, Var_OTSUNPH_A_1);
            }
        }
        if ("null".equals(OTSUNPHAmt2)) {
            System.out.println("OT SUN/PH Amount Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTSUNPH_A_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[35]")).getText();
            if (Var_OTSUNPH_A_2.equals(OTSUNPHAmt2)) {
                System.out.println("OT SUN/PH Amount Day 2: " + Var_OTSUNPH_A_2);
            } else {
                Assert.assertEquals("OT SUN/PH Amount Day 2 mismatch", OTSUNPHAmt2, Var_OTSUNPH_A_2);
            }
        }

// --- Total OT Amount ---
        if ("null".equals(Total_Amt1)) {
            System.out.println("Total OT Amount Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTTotal_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[16]")).getText();
            if (Var_OTTotal_1.equals(Total_Amt1)) {
                System.out.println("Total OT Amount Day 1: " + Var_OTTotal_1);
            } else {
                Assert.assertEquals("Total OT Amount Day 1 mismatch", Total_Amt1, Var_OTTotal_1);
            }
        }
        if ("null".equals(Total_Amt2)) {
            System.out.println("Total OT Amount Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTTotal_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[36]")).getText();
            if (Var_OTTotal_2.equals(Total_Amt2)) {
                System.out.println("Total OT Amount Day 2: " + Var_OTTotal_2);
            } else {
                Assert.assertEquals("Total OT Amount Day 2 mismatch", Total_Amt2, Var_OTTotal_2);
            }
        }

// --- Off Leave Hours (OLH) ---
        if ("null".equals(Off_Leave_amt1)) {
            System.out.println("Off Leave Hours Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OLH_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[17]")).getText();
            if (Var_OLH_1.equals(Off_Leave_amt1)) {
                System.out.println("Off Leave Hours Day 1: " + Var_OLH_1);
            } else {
                Assert.assertEquals("Off Leave Hours Day 1 mismatch", Off_Leave_amt1, Var_OLH_1);
            }
        }
        if ("null".equals(Off_Leave_amt2)) {
            System.out.println("Off Leave Hours Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OLH_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[37]")).getText();
            if (Var_OLH_2.equals(Off_Leave_amt2)) {
                System.out.println("Off Leave Hours Day 2: " + Var_OLH_2);
            } else {
                Assert.assertEquals("Off Leave Hours Day 2 mismatch", Off_Leave_amt2, Var_OLH_2);
            }
        }

        takeScreenShot(scenario);

    }

    @And("^I Sign Out$")
    public void iSignOut() {
        driver.findElement(By.xpath("//span[contains(.,'Jimmy Duran')]")).click();
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(.,'Sign Out')]")));
        try {
            driver.findElement(By.xpath("//a[contains(.,'Sign Out')]")).click();
        } catch (Exception e) {
            System.out.println("Sign Out Button failed");
            Assert.fail("Sign Out Button failed");
        }
    }

    @And("^I Verify Successful Sign Out$")
    public void iVerifySuccessfulSignOut() {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit'][contains(.,'Sign In')]")));
        try {
            driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Sign In')]"));
        } catch (Exception e) {
            System.out.println("Sign Out failed");
            Assert.fail("Sign Out failed");
        }
        takeScreenShot(scenario);

    }


    @And("^I Verify Overtime Hours Rate One Point Five \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyOvertimeHoursRateOnePointFive(String OT15Day1, String OT15Day2) throws Throwable {
        // ---- OT 1.5 Hrs ----
        if ("null".equals(OT15Day1)) {
            System.out.println("OT 1.5 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OT1_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[10]")).getText();
            if (Var_OT1_1.equals(OT15Day1)) {
                System.out.println("OT 1.5 Day 1 value: " + Var_OT1_1);
            } else
                Assert.assertEquals("OT 1.5 Day 1 is NOT good", OT15Day1, Var_OT1_1);
        }

        if ("null".equals(OT15Day2)) {
            System.out.println("OT 1.5 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OT1_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[28]")).getText();
            if (Var_OT1_2.equals(OT15Day2)) {
                System.out.println("OT 1.5 Day 2 value: " + Var_OT1_2);
            } else
                Assert.assertEquals("OT 1.5 Day 2 is NOT good", OT15Day2, Var_OT1_2);
        }
    }

    @And("^I Verify Overtime Hours Rate Two Point Zero \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyOvertimeHoursRateTwoPointZero(String OT20Day1, String OT20Day2) throws Throwable {
        // ---- OT 2.0 Hrs ----
        if ("null".equals(OT20Day1)) {
            System.out.println("OT 2.0 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OT2_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[11]")).getText();
            if (Var_OT2_1.equals(OT20Day1)) {
                System.out.println("OT 2.0 Day 1 value: " + Var_OT2_1);
            } else
                Assert.assertEquals("OT 2.0 Day 1 is NOT good", OT20Day1, Var_OT2_1);
        }

        if ("null".equals(OT20Day2)) {
            System.out.println("OT 2.0 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OT2_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[29]")).getText();
            if (Var_OT2_2.equals(OT20Day2)) {
                System.out.println("OT 2.0 Day 2 value: " + Var_OT2_2);
            } else
                Assert.assertEquals("OT 2.0 Day 2 is NOT good", OT20Day2, Var_OT2_2);
        }

    }

    @And("^I Verify Overtime Hours Rate Three Point Zero \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyOvertimeHoursRateThreePointZero(String OT30Day1, String OT30Day2) throws Throwable {
        // ---- OT 3.0 Hrs ----
        if ("null".equals(OT30Day1)) {
            System.out.println("OT 3.0 Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OT3_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[12]")).getText();
            if (Var_OT3_1.equals(OT30Day1)) {
                System.out.println("OT 3.0 Day 1 value: " + Var_OT3_1);
            } else
                Assert.assertEquals("OT 3.0 Day 1 is NOT good", OT30Day1, Var_OT3_1);
        }

        if ("null".equals(OT30Day2)) {
            System.out.println("OT 3.0 Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OT3_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[30]")).getText();
            if (Var_OT3_2.equals(OT30Day1)) {
                System.out.println("OT 3.0 Day 2 value: " + Var_OT3_2);
            } else
                Assert.assertEquals("OT 3.0 Day 2 is NOT good", OT30Day1, Var_OT3_2);
        }
    }

    @And("^I Verify Overtime Hours Rate Sunday \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyOvertimeHoursRateSunday(String OTSUNDay1, String OTSUNDay2) throws Throwable {
        // ---- OT SUN ----
        if ("null".equals(OTSUNDay1)) {
            System.out.println("OT SUN Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTSun_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[13]")).getText();
            if (Var_OTSun_1.equals(OTSUNDay1)) {
                System.out.println("OT SUN Day 1 value: " + Var_OTSun_1);
            } else
                Assert.assertEquals("OT SUN Day 1 is NOT good", OTSUNDay1, Var_OTSun_1);
        }

        if ("null".equals(OTSUNDay2)) {
            System.out.println("OT SUN Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTSun_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[31]")).getText();
            if (Var_OTSun_2.equals(OTSUNDay2)) {
                System.out.println("OT SUN Day 2 value: " + Var_OTSun_2);
            } else
                Assert.assertEquals("OT SUN Day 2 is NOT good", OTSUNDay2, Var_OTSun_2);
        }
    }

    @And("^I Verify Overtime Hours Rate Public Holiday \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyOvertimeHoursRatePublicHoliday(String OTPHDay1, String OTPHDay2) throws Throwable {
        // ---- OT PH ----
        if ("null".equals(OTPHDay1)) {
            System.out.println("OT PH Day 1: No expected value provided. Skipping validation.");
        } else {
            Var_OTPH_1 = driver.findElement(By.xpath("(//td[@role='gridcell'])[14]")).getText();
            if (Var_OTPH_1.equals(OTPHDay1)) {
                System.out.println("OT PH Day 1 value: " + Var_OTPH_1);
            } else
                Assert.assertEquals("OT PH Day 1 is NOT good", OTPHDay1, Var_OTPH_1);
        }

        if ("null".equals(OTPHDay2)) {
            System.out.println("OT PH Day 2: No expected value provided. Skipping validation.");
        } else {
            Var_OTPH_2 = driver.findElement(By.xpath("(//td[@role='gridcell'])[32]")).getText();
            if (Var_OTPH_2.equals(OTPHDay2)) {
                System.out.println("OT PH Day 2 value: " + Var_OTPH_2);
            } else
                Assert.assertEquals("OT PH Day 2 is NOT good", OTPHDay2, Var_OTPH_2);
        }
    }

    @And("^I Input Date From and Date To in Manage Overtime and Meals \"([^\"]*)\" \"([^\"]*)\"$")
    public void iInputDateFromAndDateToInManageOvertimeAndMeals(String Date1, String Date2) throws Throwable {
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='attFromDate_input']")));
        try {
            driver.findElement(By.xpath("//input[@id='attFromDate_input']")).sendKeys(Date1 + Keys.TAB);
        } catch (Exception e) {
            System.out.println("Sending Date1 failed");
            Assert.fail("Sending Date1 failed");

        }

        WebDriverWait ww = new WebDriverWait(driver, 30);
        WebElement element2 = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='attToDate_input']")));
        try {
            driver.findElement(By.xpath("//input[@id='attToDate_input']")).sendKeys(Date2 + Keys.TAB);
        } catch (Exception e) {
            System.out.println("Sending Date2 failed");
            Assert.fail("Sending Date2 failed");
        }
        Thread.sleep(5000);
    }

    @And("^I Select Location In Manage Overtime and Meals \"([^\"]*)\"$")
    public void iSelectLocationInManageOvertimeAndMeals(String Location) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(.,'- Location Lists: -')]")).click();
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='location_filter']")));
        try {
            driver.findElement(By.xpath("//input[@id='location_filter']")).sendKeys(Location + Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Sending Location failed");
            Assert.fail("Sending Location failed");
        }
    }

    @And("^I Select Employee Code In Manage Overtime and Meals \"([^\"]*)\"$")
    public void iSelectEmployeeCodeInManageOvertimeAndMeals(String Emp_Code) throws Throwable {
        driver.findElement(By.xpath("//label[contains(.,'- All Employees -')]")).click();
        WebDriverWait w = new WebDriverWait(driver, 30);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='empCode_filter']")));
        try {
            driver.findElement(By.xpath("//input[@id='empCode_filter']")).sendKeys(Emp_Code + Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Sending Emp Code failed");
            Assert.fail("Sending Emp Code failed");
        }
    }
}