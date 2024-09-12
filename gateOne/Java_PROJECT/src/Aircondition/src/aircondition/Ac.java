package Aircondition.src.aircondition;
public class Ac {
    private boolean operate ;
    private int temperature = 16 ;


    public void on(){
        operate = true;
    }
    public void off(){
        operate = false;
    }
   public boolean isOperate() {
        return operate;
    }
    public int changeTemperatureIncreasing(int remote){
        if (remote == 1 && temperature >= 16 && temperature <= 30)
           return  temperature += remote;
        else return temperature;
        }
    public int changeTemperatureDecreasing(int remote){
        if(remote == 1 && temperature >= 16 && temperature <= 30)
           return temperature -= remote;
        else return temperature ;
        }
    public void ifTemperaturerAbove30ShouldRemain30(int remote){
        if(remote > 30 && temperature <= 30 && temperature >= 16 )
            temperature = 30 ;
    }
    public void ifTemperaturerBelow16ShouldRemain16(int remote){
        if(remote < 16 && temperature >= 16) temperature = 16 ;
    }
    public  int getTemperature(){
         return temperature;
    }
}