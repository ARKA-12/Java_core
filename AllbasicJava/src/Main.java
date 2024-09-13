import oops.FuncInterface;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        oops.Car car = new oops.Car();
//        car.catagory();
//        car.catagory("sports");
//        oops.Car cd = new oops.CarDetails();
//        cd.catagory();
//
//        oops.Vehicals v = new oops.Car();
//
//        v.vehicalTypes();
//        v.vehicalPrice();

//        oops.Trucks t = new oops.Car();
//        oops.Trucks t1 = new oops.CarDetails();
//
//        oops.Bike b = new oops.Car();
//        b.speed();
//        b.engine();
//
//        t.truckDetails();
//        System.out.println(t.truckType());
//
//        System.out.println(t1.truckType());
//        t1.truckDetails();


        FuncInterface t = () -> {

                System.out.println("functional Interface");

        };
        t.test();
    }
}