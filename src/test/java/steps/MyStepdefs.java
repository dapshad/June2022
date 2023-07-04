package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateACoursePage;

import java.time.Duration;

import static base.BaseClass.driver;



public class MyStepdefs extends CreateACoursePage {

    public MyStepdefs() {
    }


    @Given("I go to the login page {string}")
    public void iGoToTheLoginPage(String url) {
        getLogToApp("https://ineuron-courses.vercel.app/login");

    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String email, String password) {
        this.enterUsername(email);
        this.enterPassword(password);

    }

    @And("i click on sign in")
    public void iClickOnSignIn() {
        this.clickLogin();
    }

    @Then("I should see the dashboard")
    public void iShouldSeeTheDashboard() {
    }

    @And("i click on Manage")
    public void iClickOnManage() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement mouse = driver.findElement(By.xpath("//span[contains(text(), 'Manage')]"));
        Actions s1 = new Actions(driver);
        s1.moveToElement(mouse).perform();
        this.clickManage();
    }

    @And("i click on Manage Courses")
    public void iClickOnManageCourses() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement m1 = driver.findElement(By.xpath("//span[contains(text(), 'Manage Courses')]"));
        Actions s2 = new Actions(driver);
        s2.moveToElement(m1).perform();
        //this.clickManageCourses();
    }

    @And("i click on Add new course")
    public void iClickOnAddNewCourse() {

        //driver.findElement(By.xpath("//button[contains(text(), 'Add New Course')]"));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Add New Course')]")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement addCourse = driver.findElement(By.xpath("//button[contains(text(), 'Add New Course')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click", addCourse);
        this.clickAddCourse();
    }

    @And("i upload a new file")
    public void iUploadANewFile() {
        this.uploadFile();
    }

    @And("i enter course name")
    public void iEnterCourseName() {
        this.enterCourseName();
    }

    @And("i enter description")
    public void iEnterDescription() {
        this.enterDescription();
    }

    @And("i enter instructor")
    public void iEnterInstructor() {
        this.instructorName();
    }

    @And("i enter price")
    public void iEnterPrice() {
    }

    @And("i select start date")
    public void iSelectStartDate() {
        this.priceList();
    }

    @And("i select end date")
    public void iSelectEndDate() {
    }

    @And("i select category")
    public void iSelectCategory() {
    }

    @And("i click save")
    public void iClickSave() {
    }

}


