package Threads;

public class Multithreading
{

    public static void main (String...args) throws InterruptedException {

        for (int x = 0; x<=5; x++){

            MultithreadingThing myThing = new MultithreadingThing(x);

            Thread myThread = new Thread(myThing);
            myThread.start();

            // myThread.join();  // waits for program to complete

            myThread.isAlive();

        }
    }
}
