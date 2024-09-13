package oops;

public interface Vehicals {

    void vehicalTypes();

    default void vehicalPrice(){
        System.out.println("$ 100000/-");
    }

}
