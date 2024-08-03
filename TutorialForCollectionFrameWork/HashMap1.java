import java.util.HashMap;
import java.util.Map;

//HashMap randomly changes order
public class HashMap1 {
    
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(3, "Three");
        map.put(4 ,"Four");
        map.put(2, "two");
        map.put(1, "one");
        map.put(5, "Five");

        String text = map.get(1);
        System.out.println(text);


        for(Map.Entry<Integer,String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Key: "+ key +" " + "value: " + value);
        }

        
    }

}
