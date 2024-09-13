

class CopyConstructor{

public static void main(String args[]){

   CopytheConstructor cc1 = new CopytheConstructor(1,"Arka","arka.m1@tcs.com");

   CopytheConstructor cc2 = new CopytheConstructor(cc1); 

   System.out.println("val: \n"+ cc2.toString());

}



}

class CopytheConstructor{

    int id;
    String name;
    String email;

    CopytheConstructor(int id,String name,String email){
        this.id =id;
        this.email = email;
        this.name = name;
        
    }

    CopytheConstructor(CopytheConstructor ctc){
        System.out.println("calling this copy constructor");
        email = ctc.email;
        name = ctc.name ;
        id = ctc.id ;
    }

    @Override
    public  String toString(){
        return "name: "+name+" email:"+email+" id:"+id;
    }   
}