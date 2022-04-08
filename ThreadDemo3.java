package example.thread;

public class ThreadDemo3 implements Runnable{
    @Override
    public void run() {
        //super.run()
        int index = 1;
        for (int i = 0; i < 10; i++){
            System.out.println("Thread running from Runnable interface " + index++);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped");


    }
}

