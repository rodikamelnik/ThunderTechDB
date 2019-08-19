package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import utilities.Config;
import utilities.DBType;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DBDeleteTeacher_Steps {

    private List<Map<String,Object>> DBListTeachers;

    @Then("UI values must match DB")
    public void ui_values_must_match_DB() throws SQLException {
        DBUtility.establishConnection(DBType.ORACLE);
        DBListTeachers = DBUtility.runSQLquery(Config.getProperty("deleteTeacheQuery"));
        DBUtility.closeConnections();

        String TeacherName = Config.getProperty("TeacherName");
        boolean check = true;
        for(Map<String, Object> names: DBListTeachers){
            if(names.get("FIRST_NAME").equals(TeacherName)){
                check = false;
            }
        }
        Assert.assertTrue(TeacherName + " is still in database",check);

    }

}
