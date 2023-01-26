import java.sql.SQLException;
public class App
{
    public static void main(String[] args) {
        try {
            DBConnection db = DBConnection.getInstance();
            // Insert
            Task t = new Task("Eyad Al-Sayed!", true);
            t.insertTask();
            // Retrieve all tasks
            t.retrieveTasks();
            // update task
            t.updateTask("todo","Eyad Al-Sayed!","Eyad");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}