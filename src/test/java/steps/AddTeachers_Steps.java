package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddTeachersPage;
import pages.LoginPageForSchool;

public class AddTeachers_Steps {

    LoginPageForSchool loginPageForSchool = new LoginPageForSchool();
    AddTeachersPage addTeachersPage = new AddTeachersPage();

// Admin is on cybertektraining.com app.
    @When("Admin is on School page")
    public void admin_is_on_School_page() {
       loginPageForSchool.loginPageForSchool();

    }


// Admin clicks on Teachers' module
    @When("Admin clicks on Teachers module")
    public void admin_clicks_on_Teachers_module() {
        addTeachersPage.teachersFunctionality.click();


    }


// Then admin clicks on "Add teachers" sub-category
    @When("Admin chooses Add teachers sub-category")
    public void admin_chooses_Add_teachers_sub_category()throws InterruptedException {
        addTeachersPage.addTeachersSubCategory.click();
        Thread.sleep(2000);

    }


// Admin fills out all necessary fields
    @When("Admin fills out all necessary fields")
    public void admin_fills_out_all_necessary_fields() {
        addTeachersPage.firstName.sendKeys("Steven");
        addTeachersPage.emailAddr.sendKeys("eniiazov@gmail.com");
        addTeachersPage.password.sendKeys("123456");
        addTeachersPage.subject.sendKeys("Java");
        addTeachersPage.birthDate.sendKeys("01/01/92");
        addTeachersPage.batch.sendKeys("11");
        addTeachersPage.lastName.sendKeys("Niiazov");
        addTeachersPage.joiningDate.sendKeys("01/01/2018");
        addTeachersPage.confirmPasswd.sendKeys("123456");
        addTeachersPage.mobileNumber.sendKeys("123 4567 8910");
        addTeachersPage.section.sendKeys("1");
        addTeachersPage.permenantAddress.sendKeys("2700 S. River, Des Plaines, IL 60600");

    }
// Admin clicks on submit button
    @Then("Admin clicks on submit button")
    public void admin_clicks_on_submit_button() {
        addTeachersPage.submitButton.click();
    }



}
