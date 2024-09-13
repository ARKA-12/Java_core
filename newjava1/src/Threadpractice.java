public class Threadpractice  implements  Runnable{

    @Override
    public void run(){
        System.out.println("running..");
        
    }
    public static void main(String[] args) {
        
        Threadpractice tp = new Threadpractice();
        Thread t1 = new Thread(tp, "Arka Maity");

        t1.start();

        String str = t1.getName();

        System.out.println(str);
    }
    
}

