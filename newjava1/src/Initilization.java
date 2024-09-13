public class Initilization {

    int speed;
    Initilization(){
        System.out.println("Speed of car: "+ speed);
    }

    {
        speed =60;
    }

    public static void main(String[] args) {
        Initilization obj = new Initilization();
    }
}
