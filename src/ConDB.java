/* Program to check the connectivity of the Database to localhost. */

package src;
// this package is nesussary because we are kelling this program in a folder so we must specify the package.

import java.sql.*;
//its a package which allow us to work SQL in jAVA.

public class ConDB {
    public static void main(String args[]) {
        Connection con = null;
        // Connection is the predefined class and con is the object of the class
        // Connection.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // class.forName is the method which tells us which driver we are using in our
            // program.

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            // DriverManager.getConnection method is use to connect with localhost by
            // writting some codes inside it which means
            // [jdbc= java database connectivity] localhost:3306 is the default port where
            // our localhost is, test is the name of
            // the default database folder where we store data and root is the default user
            // name of localhost and empty double
            // quotes "" is the default pasword.

            System.out.println("connected");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello");

    }
}