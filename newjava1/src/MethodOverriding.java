//class Base{
//
//
//    public  void fun(){
//        System.out.println("Base class method fun()");
//    }
//}
//
//class Derive extends Base{
//
//
//    public  void fun(){
//        System.out.println("Derive class method fun()");
//    }
//}
//
//public class MethodOverriding {
//
//    public static void main(String[] args) {
//
//        Base b = new Base();
//        b.fun();
//        Derive d = new Derive();
//        d.fun();
//        Base b1 = new Derive();
//        b1.fun();
//    }
//
//}


class  Parent{
    void fun(){
        System.out.println("Base class");
    }
}

class  Child extends Parent{
    @Override
    void fun(){
        super.fun();
        System.out.println("Child Class");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        Parent p = new Child();
        p.fun();
    }
}

