import java.util.Arrays;

public class StackOfIntegers {

    private int [] elements;
    private int capacity;
    private int size;
    public static final int MAX_SIZE = 16;

    public StackOfIntegers(){
        elements = new int [MAX_SIZE];
    }

    public StackOfIntegers(int capacity){
        this.capacity = capacity;
        elements = new int [capacity];
        if(capacity > MAX_SIZE){
            System.out.println("The maximum capacity is only 16");
        } 
        // else {
        //     System.out.println("Testing");
        // }
        //validate ensure until 16
    }

    public boolean empty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public int peek(){
        return elements[size - 1];
    }

    public void push(int value){
        elements[size++] = value;
    }

    public int pop(){
        return elements[--size];
    }

    public int getSize(){
        return elements.length;
    }

    public void printArray(){
        System.out.print("The array is " + Arrays.toString(elements));
    }
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(10);

        for (int i = 0; i < 10; i++)
            stack.push(i);

            // System.out.print(stack.peek() + " ");
            // stack.printArray();

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
