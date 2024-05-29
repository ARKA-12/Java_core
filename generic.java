
class myGeneric<T>{
    int val;
    private T t1;

    public myGeneric(int val,T t1){
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public T getT1() {
        return t1;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }
    

}

public class generic{

    public static void main(String[] args) {

        myGeneric<Boolean> arka = new myGeneric(5,true);
       
        Boolean a = arka.getT1();
        System.out.println(a);
        System.out.println("hello");

        
    }

}