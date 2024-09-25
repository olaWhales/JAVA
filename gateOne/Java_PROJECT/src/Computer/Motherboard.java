package Computer;

class Motherboard extends Product {
    private int ramSlot ;
    private int cardSlot ;
    private String bios ;

    public Motherboard(String model, String manufacture, int ramSlot, int cardSlot, String bios) {
        super(model, manufacture);
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    Dimension dimension = new Dimension(43 , 40 , 45);


    public void setloadProgram(String programName) {

    }

    @Override
    public String getPressPowerButton() {
        return "";
    }
}
