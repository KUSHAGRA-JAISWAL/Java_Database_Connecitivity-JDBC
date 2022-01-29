/* Program to Show the joining records from two different tables of localhost user created databse which is java and table name is jar.*/

package src;
// this package is nesussary because we are kelling this program in a folder so we must specify the package.

import java.sql.*;
//its a package which allow us to work SQL in jAVA.

public class JoinRecordsDB {
    public static void main(String args[]) {
        Connection con = null;
        // Connection is the predefined class and con is the object of the class
        // Connection.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // class.forName is the method which tells us which driver we are using in our
            // program.

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            // DriverManager.getConnection method is use
            // to connect with localhost by writting some codes inside it which means [jdbc=
            // java database connectivity] localhost:3306
            // is the default port where our localhost is, java is the name of the database
            // folder where we store data and root is
            // the default user name of localhost and empty double quotes "" is the default
            // pasword.

            String query = "SELECT student_name sn,course_name cn,student.semester ss FROM student, course WHERE student.course_id=course.course_id";
            // query to show records from joining two tables, here "sn","cn","ss" is the
            // elias os student.semester.
            // Elias means nick name of the given column, we right just after the column to
            // give the nick name.
            // System.out.println(query);

            Statement st = con.createStatement();
            // Statement is a class in SQL package and con.CreateStaement
            // (con is the object of clas Connection ) is method so we are storing it in
            // object st.

            ResultSet rs = st.executeQuery(query);
            // ResultSet is a class.

            while (rs.next()) {
                // rs.next() is a method which returns boolean value.

                System.out.println(rs.getString("sn") + "\t" + rs.getString("cn") + "\t" + rs.getString("ss"));
                // \t is for the spacing.
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n Exit");
        // \n is for the new line
    }
}