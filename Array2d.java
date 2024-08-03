public class Array2d {

    public static void main(String[] args) {

        int[][] a = {{2, 3}, {3,4}}; //[2,3]
                                     //[3,4]                     
        int b = 3;
        int i=0;
        int j=0;

        outerloop:
        for(i=0;i< a.length;i++){
            System.out.println("i= " +i);
            
            innerloop:
            for(j=0;j<a[i].length;j++){
                System.out.println("j= "+j);
                if(a[i][j] == b){
                    break outerloop;
                }
            }

        }

        System.out.println("i = " +i+"  j="+j);

    
        
    }
   


    
}
