package FireFox;

/**
 * Created by vaisakh on 14/11/20.
 */
class sampledemo implements Runnable {

    private Thread t;
    private String threadName;

    sampledemo (String threadName){

        this.threadName = threadName;
    }

    public void run()
    {
        while (true)
            System.out.print(threadName);
    }

    public void start ()
    {
        if(t == null)
        {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

public class Threadtest {

    public static void main (String [] args) {

        sampledemo a = new sampledemo("a");
        sampledemo b = new sampledemo("b");

        b.start();
        a.start();

    }


}