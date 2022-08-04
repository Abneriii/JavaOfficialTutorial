/**
 * Author:
 * Created at:2022/8/4
 * Updated at:
 **/
public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
    }

}