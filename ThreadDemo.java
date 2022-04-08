package example.thread;

public class ThreadDemo {
    //Main thread :mac dinh o day khoi tao ra 1 luong main
    public static void main(String[] args) throws InterruptedException {
        int index =1;
        for(int i = 0; i< 2; i++){
            System.out.println("Main thread running: " + index++);
            //sleep 2022 milli giay
            Thread.sleep(2022);
        }
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        threadDemo2.start();

        ThreadDemo3 threadDemo3 = new ThreadDemo3();
        threadDemo3.run();

        Thread threadDemo31 = new Thread(new ThreadDemo3());
        threadDemo31.start();

        for (int i = 0; i < 3; i++){
            System.out.println("Main thread running: "+index++);
            Thread.sleep(2022);
        }
        System.out.println("Thread main stopped");

    }

}
