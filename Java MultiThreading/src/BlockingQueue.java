import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private int capacity;
    private Queue<Integer> q;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
        q = new LinkedList<Integer>();
    }

    public boolean add(int value){
        synchronized (q){
            while(q.size() == capacity){
                try{
                    q.wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            q.add(value);
            q.notifyAll();
            return true;

        }

    }

    public int remove(){
        synchronized (q){
            while(q.size() == 0){
                try{
                    q.wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            q.notifyAll();
            int x=q.poll();

            return x;

        }

    }
}
