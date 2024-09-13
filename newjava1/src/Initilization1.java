public class Initilization1 {

    {
        System.out.println("Initilizatio block print");
    }

    Initilization1(){
        System.out.println("constrtuctor print");
    }

    Initilization1(String name){
        System.out.println("parameterized constructor "+ name);
    }


    public static void main(String[] args) {
        Initilization1 obj1 = new Initilization1();
        Initilization1 obj2 = new Initilization1("Parameter");


//        System.out.println((int)a);
    }
}
