package Week3;

public class Sync {

    public static void main(String[] args) throws  InterruptedException {
        Sender sender = new Sender();
        ThreadSend t1 = new ThreadSend("Hi", sender);
        ThreadSend t2 = new ThreadSend("How are you",sender);
        ThreadSend t3 = new ThreadSend("How about you",sender);

// this will order the code
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        //this will not order this code
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        }
//        catch (InterruptedException e){
//            System.out.println("Interruped");
//        }
    }

}


class Sender{

    public void send(String message){
        System.out.println("sending\t"+ message);

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Inturruped");
        }

        System.out.println("\n" + message+ " sent");
    }
}

class ThreadSend extends Thread{

    private String message;
    Sender sender;

    ThreadSend(String message,Sender sender ){
        this.message = message;
        this.sender = sender;
    }

    @Override
    public void run(){
        synchronized (sender){
            sender.send(message);
        }
    }
}

//1.Syncronized block --