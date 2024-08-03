import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {

    public static void main(String[] args) {
        
        List <String> Ls = Arrays.asList("Arka","Manshi","Maity","Tripathi");

        Predicate <String> p = (s)->{
           return  s.startsWith("M");
        };

        for(String a: Ls){
            if(p.test(a)){ // for checking the predicate values that return true
                System.out.println(a);
            }
        }

    }
    
}
