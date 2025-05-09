class shape {

           private double x ,y ;

           public void set_data(double x ,double y ){

                     this.x = x ;
                     this.y = y ;

           }


        public  void display_area(){

                  System.out.println(" Are calculation : ") ;

        };

}

class triangle extends shape{

    public  void display_area( double x ,double y ){


    } ;


}
class rectangle extends shape  {

    public  void display_area( double x ,double y ){

                   System.out.println(" the area of the rectagnel is : " + (x*y) ) ;
    } ;

}
public class Main {

             public static void main(String[]  args) {

                   shape obj  ;

                   obj = new rectangle() ;
                   obj.set_data(5,8);
                   obj.display_area();




             }
}

