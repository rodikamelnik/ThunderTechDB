package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.DeleteTecherPage;

public class DeleteTeacher_Steps {

    DeleteTecherPage deleteTecherPage = new DeleteTecherPage();


    @When("Admin clicks on three dotd and choose to delete teacher")
    public void admin_clicks_on_three_dotd_and_choose_to_delete_teacher() {
         deleteTecherPage.ThreeDots.click();
         deleteTecherPage.DeleteOption.click();

    }

    @Then("Delete employee window pop ups and Admin clicks Delete")
    public void delete_employee_window_pop_ups_and_Admin_clicks_Delete() {
        Assert.assertTrue(deleteTecherPage.DeleteWindow.isDisplayed());
        deleteTecherPage.DeleteButton.click();
    }



}
