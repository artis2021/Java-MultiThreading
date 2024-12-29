import java.util.concurrent.Semaphore;

public class Server {
    private static final int NUM_USERS = 100;
    private final Semaphore semaphore;

    public Server() {
        semaphore = new Semaphore(NUM_USERS);
    }

    public boolean tryLogin(){
        return semaphore.tryAcquire();
    }

    public void LogOut(){
        semaphore.release();
    }

    public void printUsers(){
        try {
            Thread.sleep(1000);
            System.out.println(NUM_USERS - semaphore.availablePermits());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
