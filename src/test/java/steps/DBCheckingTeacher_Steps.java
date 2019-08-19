package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AddTeachersPage;
import pages.TeachersPage;
import utilities.Config;
import utilities.DBType;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBCheckingTeacher_Steps {

    AddTeachersPage addTeachersPage = new AddTeachersPage();
    TeachersPage teachersPage = new TeachersPage();
    private Map<String,Object> DBTeachers = new HashMap<>();
    private Map<String,Object> UITeachers = new HashMap<>();


    @When("Admin chooses All teachers sub-category")
    public void admin_chooses_All_teachers_sub_category() {
        addTeachersPage.allTeachersSubCategory.click();
    }

    @When("Admin clicks and types {string} of teacher in the teacher name box")
    public void admin_clicks_and_types_of_teacher_in_the_teacher_name_box(String name)throws InterruptedException {
        addTeachersPage.SearchTeacherName.click();
        addTeachersPage.SearchTeacherName.sendKeys(Config.getProperty("TeacherName"));
        Thread.sleep(2000);
    }

    @When("Admin clicks on search button and clicks on teacher")
    public void admin_clicks_on_search_button_and_clicks_on_teacher() throws InterruptedException{
        addTeachersPage.SerchButton.click();
        Thread.sleep(2000);
        addTeachersPage.Teacher.click();
        Thread.sleep(2000);


        UITeachers.put("TEACHER_ID",teachersPage.TechersID.getText());
        UITeachers.put("BIRTH_DATE",teachersPage.BirthDay.getText());
        UITeachers.put("EMAIL_ADDRESS",teachersPage.Email.getText());
        UITeachers.put("GENDER",teachersPage.Gender.getText());
        UITeachers.put("JOIN_DATE",teachersPage.JoinDate.getText());
        UITeachers.put("PHONE",teachersPage.PhoneNumber.getText());
        UITeachers.put("PERMANENT_ADDRESS",teachersPage.Address);
        UITeachers.put("SALARY",teachersPage.Salary.getText());
        UITeachers.put("SUBJECT",teachersPage.Subject.getText());
        Thread.sleep(2000);




    }

    @Then("UI and DB values must match")
    public void ui_and_DB_values_must_match()throws SQLException {
        String name = Config.getProperty("TeacherName");
        DBUtility.establishConnection(DBType.ORACLE);
        List<Map<String,Object>> DBListTeachers =
                DBUtility.runSQLquery(Config.getProperty("Tquery"));

        DBTeachers = DBListTeachers.get(0);
        DBUtility.closeConnections();

        boolean check = true;

        for(String key: DBTeachers.keySet()){
            System.out.println(String.valueOf(DBTeachers.get(key)) + " " +String.valueOf(UITeachers.get(key)));
            if(!String.valueOf(DBTeachers.get(key)).equals(String.valueOf(UITeachers.get(key))))
                check=false;
        }

        Assert.assertTrue(check);

    }



}
