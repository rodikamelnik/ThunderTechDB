package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteStudentPage {


    public DeleteStudentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='btn btn-success btn-block mt-4 mb-2']")
    public WebElement SearchButton;


    @FindBy(xpath = "(//a[@class='action-icon dropdown-toggle'])")
    public WebElement ThreeDots;


    @FindBy(xpath = "(//a[@class='dropdown-item'])[10]")
    public WebElement DeleteOption;


    @FindBy(xpath = "(//a[@class='dropdown-item'])[9]")
    public WebElement EditOption;


    @FindBy(xpath = "//div[@class='modal-content modal-md']")
    public WebElement DeleteWindow;


    @FindBy(xpath = "(//button[@class='btn btn-danger'])")
    public WebElement DeleteButton;




}
