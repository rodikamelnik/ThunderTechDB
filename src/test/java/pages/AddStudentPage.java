package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddStudentPage {



    public AddStudentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[.=' Students']")
    public WebElement StudentsFunctionality;


    @FindBy(xpath = "//a[.='All Students']")
    public WebElement allStudentsSubCategory;


    @FindBy(xpath = "//a[.='Add Student']")
    public WebElement addStudentsSubCategory;


    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement firstName;


    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement lastName;


    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement email;


    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement joinDate;


    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement password;


    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement confirmPassword;


    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement subject;


    @FindBy(xpath = "(//input[@type='number'])")
    public WebElement mobileNumber;


    @FindBy(xpath = "(//select)[1]")
    public WebElement gender;


    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement admisionNumber;


    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement birthDay;


    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement major;


    @FindBy(xpath = "(//select)[2]")
    public WebElement batch;


    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement section;


    @FindBy(xpath = "//textarea[@id= 'message']")
    public WebElement PermanentAddress;


    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement CompanyName;


    @FindBy(xpath = "(//input[@type='text'])[14]")
    public WebElement Title;


    @FindBy(xpath = "(//input[@type='text'])[11]")
    public WebElement startDate;


    @FindBy(xpath = "(//input[@type='text'])[15]")
    public WebElement city;


    @FindBy(xpath = "(//input[@type='text'])[12]")
    public WebElement Street;


    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement ZipCode;


    @FindBy(xpath = "(//input[@type='text'])[13]")
    public WebElement State;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SubmitButton;


    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement SearchStudentName;


    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement SearchStudentID;


    @FindBy(xpath = "//a[@class='btn btn-success btn-block mt-4 mb-2']")
    public WebElement SearchButton;


    @FindBy(xpath = "//h4[@class='user-name m-t-10 m-b-0 text-ellipsis']")
    public WebElement Student;


    @FindBy(xpath = "(//span[@class='text'])[1]")
    public WebElement IDStudent;
}
