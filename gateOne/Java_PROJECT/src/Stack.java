//public class Stack {
//    private int capacity ;
//    private int[] stackElements;
//    int size = 0;
//    int element;
//
//    public Stack(int capacity) {
//        this.capacity = capacity;
//        stackElements = new int[capacity];
//    }
//
//    public boolean isStackEmpty() {
//        if (size > 0) stackElements[size]++;
//        return size == 0;
//    }
//
//    public void push(int element) {
//        stackElements[size] += element;
//        size+=1;
//    }
//
//    public void pop() {
//        stackElements[size]-= capacity;
//        size--;
//    }
//
//    public boolean isFull() {
//        if (size == stackElements.length) return true;
//        return false;
//    }
//    public int getSize() {
//        if(isFull()) return stackElements(capacity);
//        return size;
//    }
//
//    private int stackElements(int capacity) {
//        this.capacity = capacity;
//        return 0;
//    }
//
//}
