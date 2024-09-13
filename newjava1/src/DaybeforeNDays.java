import java.util.Scanner;

/*
 * 0 - Monday
 * 1 - Tuesday
 * 2 - Wednesday
 * 3 - Thursday
 * 4 - Friday
 * 5 - Saturday
 * 6 - Sunday
   */
public class DaybeforeNDays {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int currDay = sc.nextInt(); // 4
        int gotoDay = sc.nextInt(); // 10
        int within7Days = gotoDay%7; //3

        int ans =  currDay - within7Days;


        if(ans >=0){
            System.out.println(ans);
        }
        else
        {
            System.out.println(ans+7);
        }

    }
    
}
