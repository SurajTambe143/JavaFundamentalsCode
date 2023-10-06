package multithreadingexample.synchronizationexample;

public class Test {
    public static void main(String[] args) {
        Person p=new Person(1);
        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
        Thread t3=new Thread(p);

        t1.setName("Suraj");
        t2.setName("Anush");
        t3.setName("Deepak");

        t1.start();
        t3.start();
        t2.start();

    }
}
