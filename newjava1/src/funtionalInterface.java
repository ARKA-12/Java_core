
@FunctionalInterface
interface cal{
    int calculte(int y);
}

public class funtionalInterface  {

    public static void main(String[] args) {

        int a = 5;

        cal multi = (int x)->{
            return x*x;
        };


        int val= multi.calculte(a);
        System.out.println(val);
        
    }
    
}
