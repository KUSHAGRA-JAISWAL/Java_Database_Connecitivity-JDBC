/* Program that helps to uderstand the concepts of functions. */

package src;
// this package is nesussary because we are kelling this program in a folder so we must specify the package.

import java.io.*;

class B {
    static void fun() {
        System.out.println("Hello World!");
    }

    static String fun2() {
        String s = "Hello world";
        return s;
    }

    static void fun3(String a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static String fun4(String h) {
        return h;
    }

    public static void main(String[] args) {
        Console c = System.console();
        // String f = fun2();
        // fun();
        // System.out.println(f);
        // fun3("Learning", 69);
        // String n = fun4("lavda");
        // System.out.println(n);

        String inp1 = c.readLine("Enter a String: ");
        int inp2 = Integer.parseInt(c.readLine("Enter a number: "));
        fun3(inp1, inp2);
        System.out.println(fun4(inp1));

    }
}

class C {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int multy(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Console c = System.console();
        int inp1 = Integer.parseInt(c.readLine("Enter a number 1 : "));
        int inp2 = Integer.parseInt(c.readLine("Enter a number 2 : "));
        C o = new C();
        System.out.println(o.add(inp1, inp2));
        System.out.println(o.sub(inp1, inp2));
        System.out.println(o.multy(inp1, inp2));
        System.out.println(o.div(inp1, inp2));

    }
}