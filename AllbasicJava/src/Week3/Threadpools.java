package Week3;

import java.util.Scanner;

public class Threadpools {

    static String name ="arka";

    Threadpools(){}
    Threadpools(String name){
        this.name = name;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Threadpools tp = new Threadpools(name);
        System.out.println(tp.name);
        Threadpools td1 = new Threadpools();
        System.out.println(td1.name);

    }


}

//Executer(I) ->ExecuterService(I)
//ThreadPoolExecutor(C)