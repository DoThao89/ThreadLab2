package example.thread;

public class ThreadDemo2 extends Thread{

    @Override//abstract method
    public void run() {
        //super.run()
        int index =1;
        for (int i = 0; i < 10; i++){
            System.out.println("Thread running from Class Thread" + index++);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped");
    }
}