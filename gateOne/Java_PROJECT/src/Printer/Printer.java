package Printer;

public class Printer {
    private int tonerLevel = 0 ;
    private int pagesPrinter ;
    private boolean duplex ;

    public Printer(int tonerLevel, int pagesPrinter, boolean duplex) {
        getTonerLevel();
        this.tonerLevel = tonerLevel;
        this.pagesPrinter = pagesPrinter;
        this.duplex = duplex ;
    }
    public int addToner(int amount){
        setTonerLevel(tonerLevel+amount);
        return amount;
    }
//    public int printPages(int ){
//
//    }
    public void setTonerLevel(int tonerLevel) {
        if(tonerLevel > 100){
            tonerLevel = 100 ;
        }else if(tonerLevel < 0){
            tonerLevel = -1 ;
        }
    }
    public int getTonerLevel(){
        return tonerLevel;
    }

}

