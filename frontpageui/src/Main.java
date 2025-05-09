import java.util.Comparator;

class person implemenets comparable<person> {


        private string name ;
        private double age ;
        private long nid ;


        public person(string name double age long nid){

               this.name = name ;
               this.name = age ;
               this.nid = nid ;
        }

        public double getAge(){

                return this.age ;
        }

        public double getName(){

              return this.name ;
        }

        public double getNid(){

              return this.nid;
        }

}


class AgeComparator implements Comparator<person> {

         public int compare(person p1, person p2) {

             if(p1.getAge() > p2.getAge()){
                   return 1;
             }
             else if(p1.getAge() < p2.getAge()){

                    return -1;
             }
             else {

                    return 0;
             }

         }

         public string toString(){

                string info = "";
                info += "name" + p.getName() + "\n"
               info += "age" + p.getAge() + "\n"
               info += "nid" + p.getNid() + "\n"

         }

         return info ;
}

class Main(){

         public static void main(string[] args){

                person p1 = new person("ABC" , 23 , 56566) ;

                person p2 = new person ("DEF" , 23 , 55346654) ;

                person p3 = new person ("GHI", 23 , 454655) ;

                person[] pA = {p1,p2,p3};

                System.out.println("Before sorting") ;

                for(person p : pA){
                    System.out.println(p.toString()) ;
                }





         }
}