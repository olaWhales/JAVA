package StackStructure;

public class StackClass {
    private int capacity ;
    private int[] stack ;
    private int size ;

    public StackClass(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.stack = new int[capacity];
    }
    public boolean isEmpty() {
        if(this.size == 0)
            return true;
        return false;
    }
    public int getState() {
        return size;
    }
    public void push(int element) {
        if(size < capacity) {
            stack[size] = element;
            size++;
        }
    }

    public int pop() {
        int value = stack[size - 1];
        stack[size - 1] = 0 ;
            size--;
        if(size == 0) {
            System.out.println("Stack overflow");
        }
        return value;
    }
    public int peek() {
        return stack[size -1];
    }
    public int search(int element) {
        for (int index = 0; index < size ; index++){
            if(stack[index] == element){
                return index;
            }
        }
        return element;
    }
}
