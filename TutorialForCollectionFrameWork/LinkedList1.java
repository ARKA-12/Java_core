
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList <Integer> l = new LinkedList<>();

        doSomething("ArrayList", arr);
        doSomething("LinkedList", l);
    
    }

    private static void doSomething(String type, List<Integer> list){
        // as i decalre here List so i can use anyting who implements the List

        for(int i=0;i<1E5;i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        /* 
        //Adding end of the list
        for(int i =0;i<1E5;i++){
            list.add(i);
        }
         */

         //adding item elsewhere in the list
        //Adding begining of the list
         for(int i=0;i<1E5;i++){
            list.add(list.size()-200,i);
         }

        long end = System.currentTimeMillis();

        System.out.println("Time Taken: "+ (end - start) + " ms  in" + type);
        System.out.println();
    }
  
}
