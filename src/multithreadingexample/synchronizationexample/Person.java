package multithreadingexample.synchronizationexample;

public class Person implements Runnable{

    int mAvailableSeats=1,mPassenger;
    Person(int passenger) {
        mPassenger=passenger;
    }

    @Override
    public synchronized void run() {
        String n=Thread.currentThread().getName();
        if (mAvailableSeats>=mPassenger) {
            System.out.println(n+" seat is booked");
            mAvailableSeats=mAvailableSeats-mPassenger;
        }else {
            System.out.println("No seat Vailable for "+n);
        }
    }
}
