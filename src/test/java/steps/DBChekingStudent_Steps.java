package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AddStudentPage;
import pages.StudentsPage;
import utilities.Config;
import utilities.DBType;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DBChekingStudent_Steps {

    AddStudentPage addStudentPage = new AddStudentPage();
    StudentsPage studentsPage = new StudentsPage();

    private Map<String,Object> DBStudents = new HashMap<>();
    private Map<String,Object> UIStudents = new HashMap<>();

    @When("Admin chooses All students sun-category")
    public void admin_chooses_All_students_sun_category() {
        addStudentPage.allStudentsSubCategory.click();

    }

    @When("Admin clicks and types {string} of the student in student name box")
    public void admin_clicks_and_types_of_the_student_in_student_name_box(String name)throws InterruptedException {
        name = Config.getProperty("name");
        addStudentPage.SearchStudentName.click();
        addStudentPage.SearchStudentName.sendKeys(name);
        Thread.sleep(2000);

    }

    @When("Admin clicks on search button and clicks on student")
    public void admin_clicks_on_search_button_and_clicks_on_student()throws InterruptedException {
        addStudentPage.SearchButton.click();
        Thread.sleep(2000);
        addStudentPage.Student.click();
        Thread.sleep(2000);

        UIStudents.put("STUDENT_ID",studentsPage.StudentId.getText());
        UIStudents.put("ADMISSION_NO",studentsPage.AddmisionNo.getText());

        UIStudents.put("BIRTH_DATE",studentsPage.BirthDay.getText());

        UIStudents.put("GENDER",studentsPage.Gender.getText());
        UIStudents.put("JOIN_DATE",studentsPage.JoinDate.getText());
        UIStudents.put("SUBJECT",studentsPage.Subject.getText());
        Thread.sleep(2000);
    }



    @Then("UI and database must match")
    public void ui_and_database_must_match()throws SQLException {
        String name = Config.getProperty("name");
        DBUtility.establishConnection(DBType.ORACLE);
        List<Map<String,Object>> DBListStudents =
                DBUtility.runSQLquery(Config.getProperty("Squery"));

        DBStudents = DBListStudents.get(0);
        DBUtility.closeConnections();

        boolean check = true;

        for(String key: DBStudents.keySet()){
            System.out.println(String.valueOf(DBStudents.get(key)) + " " +String.valueOf(UIStudents.get(key)));
            if(!String.valueOf(DBStudents.get(key)).equals(String.valueOf(UIStudents.get(key))))
                check=false;
        }

        Assert.assertTrue(check);


    }





}
