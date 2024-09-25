package Computer;


class PersonalComputer extends Product {
    public Monitor monitor ;
    public Motherboard motherboard ;
    public ComputerCase computerCase ;


    public PersonalComputer(Monitor monitor, Motherboard motherboard, ComputerCase computerCase, String model ,String manufacture) {
        super("2020" ,"model");
        this.getModel();
        this.getManufacture();
        this.monitor = monitor ;
        this.motherboard = motherboard ;
        this.computerCase = computerCase ;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    @Override
    public String getPressPowerButton() {
        return "";
    }
}
