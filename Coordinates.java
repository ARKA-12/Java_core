
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Coordinates {

    public static void main(String[] args) {
        
        Coordinate [] arr = {new Coordinate(1,2),new Coordinate(2,3),new Coordinate(1,3),new Coordinate(2,1)};

        List<Coordinate> obj = Arrays.asList(arr);
        Collections.sort(obj, new Sort());
        System.out.println(obj);

        for(int i =0 ;i<obj.size();i++){
            System.out.println(obj.get(i));
        }
    }
    
    
}

class Sort implements Comparator<Coordinate>{
    @Override
    public int compare(Coordinate a , Coordinate b){
        if(a.x == b.x){
            return a.y-b.y;
        }
        return  a.x-b.x;
    }
}

class Coordinate{

     public int x;
     public int y;


    public Coordinate(int x,int y){
        this.x =x ;
        this.y = y;
    }

    @Override
    public String toString(){
        return "x: "+ x+ "   y: "+ y;
    }


}
