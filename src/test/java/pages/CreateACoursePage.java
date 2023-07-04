package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;

public class CreateACoursePage extends Driver {



  By loginToApp = By.xpath("//a[contains (@href,'practise')]//following::button[1]");
    By user = By.id("email1");

    By pass = By.id("password1");

    By login = By.xpath("//button[@type='submit']");

   By mouse = By.xpath("//span[contains(text(), 'Manage')]");


  By manage = By.xpath("//span[contains(text(), 'Manage Courses')]");

   By addCourse = By.xpath("//button[contains(text(), 'Add New Course')]");

   By file = By.xpath("//input[@id='course_select_645ae2c0d9e271749882f270']");

   By courseName = By.xpath("//input[@id='name']");

   By description = By.xpath("//textarea[@id='description']");

   By instructorName = By.xpath("//input[@name='instructorName']");

   By price = By.xpath("//input[@name='price']");



    public static void getLogToApp(String login) {driver.navigate().to(login);}

    public void enterUsername(String email){driver.findElement(user).sendKeys(email);}

    public void enterPassword(String password){
        driver.findElement(pass).sendKeys(password);}

    public void clickLogin(){
        driver.findElement(login).click();
    }


    public void clickManage(){ driver.findElement(mouse).click();}

    public void clickManageCourses(){driver.findElement(manage).click();}

    public void clickAddCourse(){driver.findElement(addCourse).click();}

    public void uploadFile(){driver.findElement(file).sendKeys("C:\\Users\\dapsh\\OneDrive\\Pictures\\Screenshots\\Screenshot (1).png");}

    public void enterCourseName(){driver.findElement(courseName).sendKeys("Dapo-Selenium");}

    public void enterDescription(){driver.findElement(description).sendKeys("Automation");}

    public void instructorName(){driver.findElement(instructorName).sendKeys("OtwaniM");}

    public void priceList(){driver.findElement(price).sendKeys("250");}
}
