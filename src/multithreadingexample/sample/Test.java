package multithreadingexample.sample;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Thread t1=new Thread(p);
        t1.setName("Suraj");
        Thread t2=new Thread(p);
        t2.setName("Anush");
        Thread t3=new Thread(p);
        t3.setName("Deepak");

        t1.start();
        boolean alive = t1.isAlive();
        System.out.println(alive);

        t2.run();
        t3.start();
    }
}
