/* Program to take input from the user and insert a sno and name in the localhost user created databse which is java and table name is jar.*/

package src;
// this package is nesussary because we are kelling this program in a folder so we must specify the package.

import java.sql.*;
import java.io.*;
//its a package which allow us to work SQL in jAVA.

public class UserInputInsDB {
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

            String sno = c.readLine("Enter Serial Number : ");
            // Taking input

            String name = c.readLine("Enter Name : ");
            // From the user

            String str = String.format("insert into jar(sno,name) values(%s,'%s')", sno, name);
            // here String.format is a method by which we
            // can easily take input from the user and store those values by this way.

            // String str="insert into jar(sno,name) values("+sno+",'"+name+"')";
            // here (sno,name) is the name of row in our local
            // database table and ("+sno+") double quotes +--+ is use to put the given value
            // by the user.

            Statement st = con.createStatement();
            // Statement is a class in SQL package and con.CreateStaement
            // (con is the object of clas Connection ) is method so we are storing it in
            // object st.

            st.execute(str);
            // st.execute is the method.

            System.out.println("Data Added Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("exit from main");

    }
}