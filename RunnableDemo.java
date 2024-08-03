public class RunnableDemo {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() +"- Main thread");
        
        Thread t1 = new Thread(new RunnableDemo().new RunableImp());
        t1.start();

    }
    


private class RunableImp implements Runnable{

    @Override
    public void run() {
       
        System.out.println(Thread.currentThread().getName() +" , executing run() method");

    }
    
}

}

