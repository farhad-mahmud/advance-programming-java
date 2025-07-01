package cse.edu.bubt;

class memory<T> {  // a generic class

        private T item ;

        public void set_item(T item){
              this.item = item ;
        }
        public T get_item(){
            return item ;
        }
}
public class generic2 {

    public static void main(String[] args) {
          // storing a string msg ;
        memory<String>  msg_locker = new memory<String>() ;
        // msg locker is a string object of generic class memory ;

       msg_locker.set_item("hello") ; // using setter to store a msg ;
        System.out.println("Stored message : " + msg_locker.get_item()) ;
        // printing the msg ;

        // storing an integer key id ;

        memory<Integer > key_id = new memory<Integer>() ;
        key_id.set_item(5456) ;
        System.out.println("Stored message : " + key_id.get_item()) ;

    }
}
