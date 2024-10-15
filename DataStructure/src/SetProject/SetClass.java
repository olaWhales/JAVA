package SetProject;
import java.util.List;


public class SetClass {
    private int[] setElement;
    private int size;
    private int[] elementToCompare;

    public SetClass(int capacity) {
        this.setElement = new int[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return true;
    }
    public void add(int number) {
        if (size < setElement.length) {
            this.setElement[size] = number;
            size++;
        }
    }
    public boolean contain(int index) {
        for (int elementIndex = 0; elementIndex < setElement.length; elementIndex++) {
            if (setElement[elementIndex] == index) {
                return true;
            }
        }
        return false;
    }
    public int[] get() {
        return setElement;
    }
}




