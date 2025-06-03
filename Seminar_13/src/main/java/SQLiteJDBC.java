import java.sql.*;

public class SQLiteJDBC {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db")) {
//            Class.forName("org.sqlite.JDBC");
            connection.setAutoCommit(false);
            createTable(connection);
            insertValues(connection);
            selectValues(connection);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createTable(Connection connection){
        String sqlDrop = "DROP TABLE IF EXISTS Student";
        //String name, float grade, ? birthdate
        String sqlCreate = "CREATE TABLE Student(id INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT, Grade REAL, Birthdate LONG)";

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlDrop);
            statement.executeUpdate(sqlCreate);
            connection.commit();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertValues(Connection connection){
        String sqlInsert1 = "INSERT INTO Student(Name, Grade, Birthdate) VALUES('Gaspar', 8.88, " + (System.currentTimeMillis() - 1_000_000_000) + ")";
        String sqlInsert2 = "INSERT INTO Student(Name, Grade, Birthdate) VALUES('Gigi', 7.77, " + (System.currentTimeMillis() - 2_000_000_000) + ")";

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlInsert1);
            statement.executeUpdate(sqlInsert2);
            connection.commit();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void selectValues(Connection connection){
        String sqlSelect = "SELECT * FROM Student";
        try {
            Statement statement = connection.createStatement();
            //statement.execute();
            //statement.getResultSet()

            ResultSet rs =  statement.executeQuery(sqlSelect);
            while(rs.next()){
                String name = rs.getString("Name");
                double grade = rs.getDouble("Grade");
                long birthdate = rs.getLong("Birthdate");

                System.out.println("***** Student ***** ");
                System.out.println("Name: " + name);
                System.out.println("Grade: " + grade);
                System.out.println("Birthdate: " + new Date(birthdate));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

