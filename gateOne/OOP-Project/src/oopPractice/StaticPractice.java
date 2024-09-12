package oopPractice;

class StaticPractice {
    int number ;
    String name;
    static String college = "love" ;

    static void change(){
        college = "pool" ;
    }
    StaticPractice(int number, String name){
        number = 1 ;
        name = "olawale" ;
    }

    void display(){
        System.out.print("number" + number + "name" + name);
    }



}
