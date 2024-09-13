package oops;

public class CarDetails  extends Car implements Trucks {

    @Override
    public void catagory(){
        System.out.println("this is a oops.CarDetails class");
    }

    public void truckDetails(){
        System.out.println("This is a 22 tires of truck ");
    }

   public String truckType(){
        return "this is car Details class";
    }


}
