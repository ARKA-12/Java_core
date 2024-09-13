public class multithreding {

 public static void main(String[] args) {
     int n = 100;
     for(int i=0;i<n;i++){
        Mthread obj = new Mthread();
        obj.start();
     }
 }


    
}

 class  Mthread extends Thread{

    @Override
    public void  run(){
        try {
            System.out.println("Thread "+ Thread.currentThread().getId());
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
    }

}
