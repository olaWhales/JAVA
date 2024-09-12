package oopPractice;//
//public class SuperKeywordTesting {
//    class employee {
//        int wt = 8;
//    }
//
//    class clerk extends employee {
//        int wt = 10;  //work time
//        void display() {
//            System.out.println(super.wt); //will print work time of clerk
//        }
//
//        public void main(String args[]) {
//            clerk c = new clerk();
//            c.display();
//        }
//    }
//}

// when declaring class as final
//final class stud {
//    // Methods cannot be extended to its sub class
//}
//class books extends stud {
//    void show() {
//        System.out.println("Book-Class method");
//    }
//    public static void main(String args[]) {
//        books B1 = new books();
//        B1.show();
//    }
//}

//class stud {
//     void show() {
//        System.out.println("Classeeerer - stud : method defined");
//    }
//}
//class books extends stud {
//    void name() {
//        System.out.println("Class - books : method defined");
//    }
//class pencil extends books{
//        void show() {
//            System.out.println("this is another one......");
//        }
//}
//    public static void main(String args[]) {
//        books B2 = new books();
//        B2.show();
//    }
//}

import java.util.*;
import java.lang.*;
import java.io.*;

class stud {
    final int val;

    stud() {
        val = 800;
    }

    void method() {
        System.out.println(val);
    }

    public static void main(String args[]) {
        stud S1 = new stud();
        S1.method();
    }
}