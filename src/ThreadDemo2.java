// Java program to get the id of a
// thread

public class ThreadDemo2 implements Runnable {
    public void run()
    {
        // gets the name of current thread
        System.out.println(
                "Current Thread Name: "
                        + Thread.currentThread().getName());

        // gets the ID of the current thread
        System.out.println(
                "Current Thread ID: "
                        + Thread.currentThread().getId());
    }
    public static void main(String[] args)
    {
        // Runnable target
        ThreadDemo2 t = new ThreadDemo2();

        // create threads
        Thread t1 = new Thread(t, "First Thread");
        Thread t2 = new Thread(t, "Second Thread");

        // start threads
        t1.start();
        t2.start();
    }
}

