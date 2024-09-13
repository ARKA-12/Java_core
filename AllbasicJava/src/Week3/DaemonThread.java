package Week3;

public class DaemonThread {

    public static void main(String[] args) {
        Thread daemon = new Thread(()->{
            while (true){
                System.out.println("Daemon thread ..");
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        daemon.setDaemon(true);
        daemon.start();
        System.out.println("Main thread running....");
    }
}
