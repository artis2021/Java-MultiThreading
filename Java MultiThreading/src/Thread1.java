public class Thread1 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<5;i++){
//            System.out.println("Inside child thread "+ i);
            System.out.println(Thread.currentThread().getName()+ " is running. "+ i);
        }
    }


    public Thread1(String name){
        super(name);

    }


}
