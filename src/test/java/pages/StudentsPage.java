package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentsPage {


    public StudentsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[@class='text'][1])")
    public WebElement StudentId;

    @FindBy(xpath = "(//span[@class='text'])[2]")
    public WebElement PhoneNumeber;

    @FindBy(xpath = "(//span[@class='text'])[3]")
    public WebElement Email;

    @FindBy(xpath ="(//span[@class='text'])[4]" )
    public WebElement Address;

    @FindBy(xpath = "(//span[@class='text'])[5]")
    public WebElement JoinDate;

    @FindBy(xpath = "(//span[@class='text'])[6]")
    public WebElement AddmisionNo;

    @FindBy(xpath = "(//span[@class='text'])[9]")
    public WebElement BirthDay;

    @FindBy(xpath = "(//span[@class='text'])[13]")
    public WebElement Gender;

    @FindBy(xpath = "(//span[@class='text'])[15]")
    public WebElement Subject;








}
