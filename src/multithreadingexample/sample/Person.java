package multithreadingexample.sample;

import static java.lang.Thread.sleep;

public class Person implements Runnable{


    @Override
    public void run() {
        String mName=Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(mName);
        }
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(" Error");
        }

    }
}
