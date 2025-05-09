class parent {

    void show(){

        System.out.println("This is parent");

    }

}

class child extends parent {     // inherited

     void show(){

        System.out.println("This is child") ;

     }

}

public class dynamic_dispatch {

    public static void main(String[] args){

        parent obj ;    // reference of a parent class
        obj = new parent() ; // parent object
        obj.show() ;     // call parents show


        obj = new child() ;  // child object assigned to parent reference
        obj.show() ;

    }


}
