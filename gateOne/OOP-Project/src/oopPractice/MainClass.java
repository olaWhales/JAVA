package oopPractice;

public class MainClass {
    public static void main(String[] args) {
        MainClassSecond testing = new MainClassSecond(100 , 10);
        System.out.println(testing);

        StaticPractice.change();
        StaticPractice practice = new StaticPractice(100,"olawale");
        practice.display();
    }
}
