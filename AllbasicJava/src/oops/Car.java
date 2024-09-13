package oops;

public class Car extends Bike implements Vehicals, Trucks {

    public  void catagory(){
        System.out.println("This is oops.Car class");
    }

    public  void catagory(String type){
        System.out.println("this is a "+ type + " car");
    }

   public void vehicalTypes(){
       System.out.println("100 types of vehicals are there in the world");
    }
    @Override
    public String truckType(){
        return "Commercial + Business + Public";
    }

    @Override
    public void truckDetails() {
        System.out.println("this is the oops.Car Class");
    }

    public void speed(){
        System.out.println("running like a Cheeta");
    }

}
