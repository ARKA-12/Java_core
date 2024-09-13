public abstract class AbstractClass
{
    void fun(){}
}

class Jnrabs extends AbstractClass{

    void fun(){
        System.out.println("Method of abstract class");
    }
}

class NewMain{

    public static void main(String[] args) {
        Jnrabs a=  new Jnrabs();
        a.fun();
    }
}
