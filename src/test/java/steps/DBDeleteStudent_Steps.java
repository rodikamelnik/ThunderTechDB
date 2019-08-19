package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import utilities.Config;
import utilities.DBType;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DBDeleteStudent_Steps {

    private List<Map<String,Object>> DBListStudents;

    @Then("UI and DB must be same")
    public void ui_and_DB_must_be_same()throws SQLException {

        DBUtility.establishConnection(DBType.ORACLE);
        DBListStudents = DBUtility.runSQLquery(Config.getProperty("deleteQuery"));
        DBUtility.closeConnections();

        String StudentName = Config.getProperty("name");
        boolean check = true;
        for(Map<String, Object> names: DBListStudents){
            if(names.get("FIRST_NAME").equals(StudentName)){
                check = false;
            }
        }
        Assert.assertTrue(StudentName + " is still in database",check);

    }

}
