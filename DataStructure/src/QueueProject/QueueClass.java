package QueueProject;

public class QueueClass {
    private int capacity ;
    private int element ;
    private int [] size ;

    public QueueClass(int capacity) {
        this.element = 0 ;
        this.capacity = capacity;
        this.size = new int [capacity];
    }
    public boolean isEmpty() {
        return true;
    }
    public void add(int value) {
        if(element < capacity) {
            size[element] = value ;
             element ++;
        }
        else {
            System.out.println("Queue is full");
        }
    }
    public void remove() {
        if(element < capacity) {
        size[element] = element ;
        element --;
        }
    }
    public boolean offer() {
        int value = 0 ;
        if(element <= capacity) {
            capacity += value ;
        }
        else {
            return false;
        }
        return true;
    }
    public int getState(){
        return element;
    }
    public boolean isFull(){
        return size[capacity] == element;
    }

    public int poll() {
        for(int index = 0 ; index < size.length ;) {
            if (element != 0 && element < capacity) {
                size[element] = size[element] - element;
            }
            return element;
        }
        return 0;
    }
}

