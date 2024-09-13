package Week3;

public class MT {

    public static void main(String[] args) {
    Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
    t1.start();
/* Thread Join ---wait until other thread to completed */
    try {
        System.out.println("current thread: "+Thread.currentThread().getName());
        t1.join();
    }
    catch (Exception e){
        throw  new RuntimeException(e);
    }

    t2.start();
        try {
            System.out.println("current thread: "+Thread.currentThread().getName());
            t2.join();
        }
        catch (Exception e){
            throw  new RuntimeException(e);
        }

    }
}

class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<2;i++) {
            try {
                Thread.sleep(500);
                System.out.println("current Thread; " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("exception occured; " + e);
            }
            System.out.println();
        }
    }
}


















//        for(int i=0;i<n;i++){
//            MyThread mt = new MyThread();
//            mt.start();
// }
//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
//        myThread1.start();

//        Thread t = new Thread(new Mythread());
//        t.start();

//        Thread t1 = new Thread(()->{
//            long currentThreadId  = Thread.currentThread().getId();
//
//            for(int i=0;i<10;i++){
//                System.out.println(i+ " "+currentThreadId);
//            }
//
//        });
//
//        Thread t2 = new Thread(()->{
//            long currentThreadId  = Thread.currentThread().getId();
//
//            for(int i=0;i<100;i++){
//                System.out.println(i+ " "+currentThreadId);
//                try {
//                    Thread.sleep(200);
//                }
//                catch (InterruptedException e){
//                    throw new RuntimeException(e);
//                }
//            }
//
//        });

//        t1.start();
//        t2.start();
//        t1.interrupt();



//class MyThread extends Thread{
//    @Override
//    public  void run(){
////        System.out.println();
////        System.out.println("Inside My Thread "+Thread.currentThread().getId());
//
//        long currentThreadId  = Thread.currentThread().getId();
//
//        for(int i=0;i<5;i++){
//            System.out.println(i+ " "+currentThreadId);
//        }
//    }


//class  Mythread implements Runnable {
//
//    long currentThreadId;
//    static  long count = 0L;
//    @Override
//    public void  run(){
//         currentThreadId  = Thread.currentThread().getId();
//
//        for(int i=0;i<10;i++){
//            System.out.println(i+ " "+currentThreadId + ++count);
//        }
//
//}

//}

//Extending the thread class
//Implementing the Runnable Interface