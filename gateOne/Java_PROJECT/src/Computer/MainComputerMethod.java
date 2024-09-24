package computer;

public class MainComputerMethod {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("240" , "2022" );
        Monitor monitor = new Monitor(45 , "233* 400");
        Motherboard motherboard = new Motherboard("240" , "2033", 22 , 25 , "203");
        PersonalComputer thePc = new PersonalComputer(monitor , motherboard , theCase , "2022" , "Mazda");

/*
        thePc.getComputerCase().pressPowerButton();
        thePc.getMotherboard().setloadProgram("on");
        thePc.getMonitor().drawPixelAt();
*/

        System.out.println(motherboard.getModel());
        System.out.println(theCase.pressPowerButton());
        System.out.println(monitor.getSize());
        System.out.println(thePc.getPressPowerButton());
    }
}
