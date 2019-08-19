package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.AddStudentPage;
import pages.LoginPageForSchool;
import utilities.Config;

public class AddStudent_Steps {

    LoginPageForSchool loginPageForSchool = new LoginPageForSchool();
    AddStudentPage addStudentPage = new AddStudentPage();
    Faker faker = new Faker();





    @When("Admin clicks on Student module")
    public void admin_clicks_on_Student_module() {
       addStudentPage.StudentsFunctionality.click();
    }

    @When("Admin chooses Add student sub-category")
    public void admin_chooses_Add_student_sub_category()throws InterruptedException {
        addStudentPage.addStudentsSubCategory.click();
        Thread.sleep(2000);

    }

    @When("Admin fills out all necessary fields for student")
    public void admin_fills_out_all_necessary_fields_for_student() {

        addStudentPage.firstName.sendKeys(Config.getProperty("name"));
        addStudentPage.lastName.sendKeys("Snow");
        addStudentPage.email.sendKeys("john.snow@gmail.com");
        addStudentPage.joinDate.sendKeys("02/23/2018");
        addStudentPage.password.sendKeys("snow123");
        addStudentPage.confirmPassword.sendKeys("snow123");
        addStudentPage.subject.sendKeys("Automation Engineer");
        addStudentPage.mobileNumber.sendKeys("8778348568");
        addStudentPage.gender.click();

        Select select = new Select(addStudentPage.gender);
        select.getFirstSelectedOption();
        addStudentPage.admisionNumber.sendKeys("56");
        addStudentPage.birthDay.sendKeys("09/23.1990");
        addStudentPage.major.sendKeys("Computer Science");
        Select selectBatch = new Select(addStudentPage.batch);
        selectBatch.selectByIndex(10);
        addStudentPage.section.sendKeys("3");
        addStudentPage.PermanentAddress.sendKeys("2222 N State");
        addStudentPage.CompanyName.sendKeys("Apple");
        addStudentPage.Title.sendKeys("Architect");
        addStudentPage.startDate.sendKeys("10/01/2019");
        addStudentPage.city.sendKeys("Silicon Valley");
        addStudentPage.Street.sendKeys("2855 Stevens Creek Blvd, Santa Clara");
        addStudentPage.ZipCode.sendKeys("95050");
        addStudentPage.State.sendKeys("CA");
        addStudentPage.SubmitButton.click();



//        String firstName = faker.name().firstName();
//        addStudentPage.firstName.sendKeys(firstName);
//
//        String lastName = faker.name().lastName();
//        addStudentPage.lastName.sendKeys(lastName);
//
//        String email = faker.internet().emailAddress();
//        addStudentPage.email.sendKeys(email);
//
//        addStudentPage.joinDate.click();
//        addStudentPage.joinDate.sendKeys("02/23/2018");
//
//        String password = faker.internet().password();
//        addStudentPage.password.clear();
//        addStudentPage.password.sendKeys(password);
//
//
//        addStudentPage.confirmPassword.sendKeys(password);
//
//        addStudentPage.subject.sendKeys("Automation Engeenering");
//
//        String mobileNumber = faker.number().digits(10);
//        addStudentPage.mobileNumber.sendKeys(mobileNumber);
//
//        addStudentPage.gender.click();
//        Select select = new Select(addStudentPage.gender);
//        select.getFirstSelectedOption();
//
//        addStudentPage.admisionNumber.sendKeys(faker.number().digits(2));
//
//        addStudentPage.birthDay.click();
//        addStudentPage.birthDay.sendKeys("04/03/1993");
//
//        addStudentPage.major.sendKeys(faker.internet().domainName());
//
//        Select selectBatch = new Select(addStudentPage.batch);
//        selectBatch.selectByIndex(10);
//
//        addStudentPage.section.sendKeys(faker.number().digit());
//
//        String adress = faker.address().fullAddress();
//        addStudentPage.PermanentAddress.sendKeys(adress);
//
//        addStudentPage.CompanyName.sendKeys("Cybertek");
//        addStudentPage.Title.sendKeys(faker.name().title());
//
//        addStudentPage.startDate.click();
//        addStudentPage.startDate.sendKeys("10/01/2019");
//
//        String city = faker.address().city();
//        addStudentPage.city.sendKeys(city);
//
//        addStudentPage.Street.sendKeys(faker.address().streetAddress());
//        addStudentPage.ZipCode.sendKeys(faker.address().zipCode());
//        addStudentPage.State.sendKeys(faker.address().state());
//
//        addStudentPage.SubmitButton.click();


    }



}
