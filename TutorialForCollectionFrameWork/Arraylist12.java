
import java.util.ArrayList;


public class Arraylist12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers  = new ArrayList<Integer>();


        numbers.add(10);
        numbers.add(100);
        numbers.add(40);


        System.out.println(numbers.get(0));

        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        numbers.remove(0);
        for(Integer a: numbers){
            System.out.println("value: " + a);
        }


        // remove the some value from middle and front taking time if the ArrayList is too big where removing from back is taking less time.
        // so if we want to remove some values from middle or front use LinkedList.
       


    }
    
}
