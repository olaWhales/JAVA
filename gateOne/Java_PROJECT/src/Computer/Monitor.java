package Computer;

public class Monitor extends Product {
    private int size ;
    private String resolution ;

    public Monitor(int size, String resolution) {
        super("2022" , "mazda");
        this.size = 45 ;
        this.resolution = resolution ;
    }
    public int getSize() {
        return size;
    }
    public String getResolution() {
        return resolution;
    }
    public int drawPixelAt(){
        int x = 1366;
        int y = 768;
        resolution = "1366 * 768" ;
        String color = "blue";
        return drawPixelAt();
    }

    @Override
    public String getPressPowerButton() {
        return "";
    }
}
