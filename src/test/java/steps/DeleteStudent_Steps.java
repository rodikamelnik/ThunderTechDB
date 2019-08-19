package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DeleteStudentPage;
import utilities.Config;
import utilities.DBType;
import utilities.DBUtility;
import utilities.Driver;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DeleteStudent_Steps {



    DeleteStudentPage deleteStudentPage = new DeleteStudentPage();



    @When("Admin clicks on search button")
    public void admin_clicks_on_search_button() {
        deleteStudentPage.SearchButton.click();

    }

    @When("Admin clicks on three dots and choose delete option")
    public void admin_clicks_on_three_dots_and_choose_delete_option() {

               deleteStudentPage.ThreeDots.click();
               deleteStudentPage.DeleteOption.click();




    }

    @Then("Delete window pops up and Admin clicks Delete")
    public void delete_window_pops_up_and_Admin_clicks_Delete() {
        Assert.assertTrue(deleteStudentPage.DeleteWindow.isDisplayed());
        deleteStudentPage.DeleteButton.click();

    }






}
