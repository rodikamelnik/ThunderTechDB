package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteTecherPage {

    public DeleteTecherPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='action-icon dropdown-toggle']")
    public WebElement ThreeDots;


    @FindBy(xpath = "(//a[@class='dropdown-item'])[10]")
    public WebElement DeleteOption;


    @FindBy(xpath = "//div[@class='modal-content modal-md']")
    public WebElement DeleteWindow;


    @FindBy(xpath = "(//button[@class='btn btn-danger'])")
    public WebElement DeleteButton;
}
