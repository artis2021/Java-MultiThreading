public class Stack {
    int [] array;
    int top;
    Object lock;
    public Stack(int capacity) {
        array = new int[capacity];
        top = -1;
        lock = new Object();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    public boolean push(int value) {
        synchronized (lock) {
            if (isFull()) {
                return false;
            }
            top++;

            try{
                Thread.sleep(1000);
            } catch (Exception e){

            }

            array[top] = value;
            return true;
        }


    }

    public int pop() {
        synchronized (lock) {
            if(isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int x=array[top];
            array[top]=Integer.MIN_VALUE;

            try{
                Thread.sleep(1000);
            } catch (Exception e){

            }
            top--;
            return x;
        }

    }
}
