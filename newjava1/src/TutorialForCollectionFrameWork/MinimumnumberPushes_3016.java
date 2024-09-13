package TutorialForCollectionFrameWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class MinimunnumberPushes_3016{
    public static void main(String[] args) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for(char ch : s.toCharArray()){
           if(map.containsKey(ch)){ 
            map.put(ch, map.get(ch)+1);
        }
        else
        {
            map.put(ch,1);
        }
    }
    System.out.println(map);

    //unsorted value
    // for (Map.Entry<Character, Integer> en : map.entrySet()) {
    //     Object key = en.getKey();
    //     Object val = en.getValue();

    //     System.out.println("Key: "+ key +"  "+ "Value: "+val);
        
    // }

    Map<Character, Integer> sortedByValueMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // if there are duplicates, keep the existing entry
                        LinkedHashMap::new // use LinkedHashMap to preserve order
                ));

            System.out.println(sortedByValueMap);

            int sum =0;
            int press=1;
            for(int val : map.values() ){
                
                sum += val;
            }

            System.out.println("cost: " +sum);

    

}
}