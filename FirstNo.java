public class FirstNo {

    public static void main(String[] args) {
        int a = 123232;

       String s = Integer.toString(a);

       char  b= s.charAt(0);

       int c = Character.getNumericValue(b);

       System.out.println(c);

    }
}
