

public class stringreverse {
    
    public static void main(String[] args) {
        

         String str1 = "HI arka";
         char ch;
         String str2="";
    
    
        for(int i=0;i<str1.length();i++){
        
            ch = str1.charAt(i);
            str2 = ch+str2;
        }
        
        System.out.println(str2);
    }
   
  

}
