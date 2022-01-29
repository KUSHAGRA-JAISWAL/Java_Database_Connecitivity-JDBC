/* Program to insert a row and name in the localhost default databse which is test and table name is t1.*/

package src;
// this package is nesussary because we are kelling this program in a folder so we must specify the package.

import java.sql.*;
//its a package which allow us to work SQL in jAVA.

public class DefaultDBIns {
    public static void main(String args[]) {
        Connection con = null;
        // Connection is the predefined class and con is the object of the class
        // Connection.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // class.forName is the method which tells us which driver we are using in our
            // program.

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            // DriverManager.getConnection method is use
            // to connect with localhost by writting some codes inside it which means [jdbc=
            // java database connectivity] localhost:3306
            // is the default port where our localhost is, test is the name of the default
            // database folder where we store data and root is
            // the default user name of localhost and empty double quotes "" is the default
            // pasword.

            String str = "insert into t1 values(4,'bca')";
            // here we are storing row and name into a string and t1 is the name of the
            // table.

            Statement st = con.createStatement();
            // Statement is a class in SQL package and con.CreateStaement
            // (con is the object of clas Connection ) is method so we are storing it in
            // object st.

            st.execute(str);
            // st.execute is the method.

            System.out.println("Row inserted");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("exit from main");

    }
}