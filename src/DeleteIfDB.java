/* Program to Delete the records of localhost user created databse which is java and table name is jar, if it is there else give a message. */

package src;
// this package is nesussary because we are kelling this program in a folder so we must specify the package.

import java.sql.*;
import java.io.*;

public class DeleteIfDB {
    public static void main(String args[]) {
        Console c = System.console();
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

            String sno = c.readLine("Enter S.No You want to delete : ");
            String query = "delete from jar where sno=" + sno;

            Statement st = con.createStatement();
            // Statement is a class in SQL package and con.CreateStaement
            // (con is the object of clas Connection ) is method so we are storing it in
            // object st.

            int i = st.executeUpdate(query);
            if (i == 0) {
                System.out.println(sno + ". No such S.No Exists.");
            } else {
                System.out.println(i + ". row deleted");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n Exit");
        // \n is for the new line .
    }
}
