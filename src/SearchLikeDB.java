/* Program to search all the records by matching the given input name by the user and show records in order of 
                   localhost user created databse which is java and table name is jar. */

package src;
// this package is nesussary because we are kelling this program in a folder so we must specify the package.

import java.sql.*;
import java.io.*;

public class SearchLikeDB {
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

            String name = c.readLine("Enter name You want to search : ");

            String query = "select * from jar where name like '%" + name + "%'order by sno";
            // query for searching records by matching user input.

            Statement st = con.createStatement();
            // Statement is a class in SQL package and con.CreateStaement
            // (con is the object of clas Connection ) is method so we are storing it in
            // object st.

            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("sno") + "\t" + rs.getString("name"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n Exit");
        // \n is for the new line
    }
}
