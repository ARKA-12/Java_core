package oops;

import java.util.function.Function;

public class Demo {
//    public static void main(String[] args) {
//        //Predicate Functional Interface(func - test)
//        Predicate<Integer> lessThanTem =(x)-> x<10;
//        System.out.println(lessThanTem.test(5));
//
//        Predicate<Integer>morethan20 =(x)-> x>20;
//
//        System.out.println(lessThanTem.or(morethan20).test(12));;
//    }
//
//    public boolean isSmallerthanten(int x){
//        return x<10;
//    }

//
//    public static void main(String[] args) {
//
//        //Consumer
//        Consumer<Integer> c = (i)-> System.out.println(i);
//        c.accept(5);
//        String s = "Arka Maity";
//        Consumer<String> printFirstNamre =(x)->{
//            System.out.println(x.split("\\s")[0]);
//        };
//    }

    public static void main(String[] args) {
//        Function<Integer,Character> intToChar = asciival ->{
//            return (char)asciival.intValue();
//        };
//        System.out.println(intToChar.apply(100));
//        Function<String,Character> stringToChar = str->str.charAt(0);
//        System.out.println(stringToChar.apply("Arka"));

        //default Function
        Function<Integer,Double> half = a-> a/2.0;
        half= half.andThen(a -> 3*a);
        System.out.println(half.apply(10));

        //compose()
        half = half.compose(a->3*a);
        System.out.println(half.apply(5));


        Function<Integer,Integer> i = Function.identity();
        System.out.println(i.apply(10));
    }



}
