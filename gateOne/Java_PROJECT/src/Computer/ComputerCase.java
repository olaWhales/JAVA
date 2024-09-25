package Computer;

public class ComputerCase extends Product {
    private String powerSupply ;


    public ComputerCase(String model, String manufacture) {
        super(model, manufacture);
        this.powerSupply = manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }
    public String pressPowerButton(){
        String pressPowerButton = "";
        if(pressPowerButton.equals("on")) {
            powerSupply = "on";
        }
        else if(pressPowerButton.equals("off")) {
            powerSupply = "off";
        }
        return pressPowerButton;
    }

    @Override
    public String getPressPowerButton() {
        return pressPowerButton();
    }
}
