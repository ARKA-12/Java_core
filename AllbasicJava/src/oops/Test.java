package oops;

public class Test {

    public static void main(String[] args) {

        int arr[] = {3, 5};

        int b[] = charReprogram(arr);

        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }

    public static int[] charReprogram(int arr[]){


        int a []=new int[2];
        for(int i=0;i<arr.length;i++){
            int s =0;
            while (arr[i]>0) {
                if (arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else {
                    arr[i] = arr[i] - 1;
                }
                s++;
            }
            a[i]=s;
        }
        return a;
    }



}
