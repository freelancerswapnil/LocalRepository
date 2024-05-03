// Define a class that extends Thread
class MyThread extends Thread {
    
    // Override the run() method to define the task of the thread
    public void run() {
        // Task of the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            
            try {
                // Adding a small delay to simulate some task being performed
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class to demonstrate the usage of the thread
public class ThreadExample {
    public static void main(String args[]) {
        // Create an instance of the MyThread class
        MyThread thread = new MyThread();
        
        // Start the thread
        thread.start();
        
        // Main thread continues its execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

