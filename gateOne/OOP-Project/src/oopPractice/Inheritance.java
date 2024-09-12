package oopPractice;
import java.util.Scanner;
public class Inheritance {
    public static void main(String[] args){
        AnotherSemicolon semicolon = new AnotherSemicolon();
        semicolon.Native();
        semicolon.PalaceStudent();
    }
}
class Semocolon{
    public void Native(){ ;
    int semicolon = 100 ;
    int semicolon2 = 200 ;
    System.out.println(semicolon + semicolon2);
    }
}
class AnotherSemicolon extends Semocolon {
    public void PalaceStudent() {
        System.out.println("I'm among Semicolon Palace Student");
    }
}