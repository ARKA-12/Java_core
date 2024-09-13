public class BinaryInversion {


    public static void main(String[] args) {
        int a = 51251;
        int arr [] = new int[Integer.toBinaryString(a).length()];
        int i=0;
        while(a>0){
            
             arr[i]  = a%2;
            a = Math.abs(a/2);
             i++;
        }



        for(int  b: arr){
            System.out.println(b);
        }

        for( i =0;i<arr.length;i++){
            if(arr[i] == 1){
                arr[i] =0;
            }
            else
                arr[i] = 1;
        }

        for(int  b: arr){
            System.out.println(b);
        }

        int convertion=0;

        for( i=0;i<arr.length;i++){
            convertion +=(arr[i]*(int)Math.pow(2,i));
        }

        // int bitLength = Integer.toBinaryString(a).length();
        // int mask = (1 << bitLength) - 1;

        // System.out.println(a ^ mask);
        System.out.println(convertion);


    }

}
