package singleton.Lazy;

//Simulate Threads: Create a test with two or more threads (e.g., using Thread class or a simple loop) that call getLogger() and log messages simultaneously.
//Verify: Ensure all threads use the same logger instance (e.g., check object identity or log output) and that no duplicate loggers are created.

public class Client {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Logger thread1=Logger.getLogger("thread1");
            System.out.println(System.identityHashCode(thread1));
            Logger thread2=Logger.getLogger("thread2");
            System.out.println(System.identityHashCode(thread2));
        }


    }
}
