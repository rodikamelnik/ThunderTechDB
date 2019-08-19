package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.plaf.PanelUI;

public class TeachersPage {


    public TeachersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[@class='text'])[1]")
    public WebElement TechersID;

    @FindBy(xpath = "(//span[@class='text'])[2]")
    public WebElement PhoneNumber;

    @FindBy(xpath = "(//span[@class='text'])[3]")
    public WebElement Email;

    @FindBy(xpath = "(//span[@class='text'])[7]")
    public WebElement Address;

    @FindBy(xpath = "(//span[@class='text'])[6]")
    public WebElement JoinDate;

    @FindBy(xpath = "(//span[@class='text'])[5]")
    public WebElement BirthDay;

    @FindBy(xpath = "(//span[@class='text'])[8]")
    public  WebElement Gender;

    @FindBy(xpath = "(//span[@class='text'])[11]")
    public WebElement Subject;

    @FindBy(xpath = "(//span[@class='text'])[9]")
    public WebElement Salary;



}
