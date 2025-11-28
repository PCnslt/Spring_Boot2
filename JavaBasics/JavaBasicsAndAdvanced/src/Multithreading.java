 class Multithreading {


}


 class PrinterTask implements Runnable{

    public void run(){

        for(int i=1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName()+": Running task " + i);
        }
    }
}

class Exercise{
    public static void main(String[] args) throws InterruptedException {
        PrinterTask task = new PrinterTask();


        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        t1.start();
        t2.start();


        t1.join();
        t2.join();

    }
}

class ExerciseDeepSeek {
    public static void main(String[] args) throws InterruptedException {
        // Instantiate PrinterTask ONCE (as required)
        PrinterTask task = new PrinterTask();

        // Create two Thread objects using the SAME task
        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        // Start both threads
        t1.start();
        t2.start();

        // Use .join() to ensure main thread waits for both to finish
        t1.join();
        t2.join();

        System.out.println("Both threads completed!");
    }
}