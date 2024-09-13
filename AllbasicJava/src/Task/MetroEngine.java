package Task;

public interface MetroEngine {

    void start();
}

class Main{
    public static void main(String[] args) {
        MetroEngine D1 = ()->{
            System.out.println("Starting with Driver");
        };

        MetroEngine D2 =()->{
            System.out.println("Starting without Driver");
        };

        D1.start();
        D2.start();
    }
}