package cse.edu.bubt ;

class Pair<K, V> {

    private K key;
    private V value;

   // constructor

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // setters ;

    public void setKey(K key) {

        this.key = key;

    }

    public void setValue(V value) {

        this.value = value;

    }

     // getters ;
    public K getKey() {

        return key;

    }


    public V getValue() {
        return value;
    }

    public void swap() {

        // swap if key and value are same type
        if (key.getClass() == value.getClass()) {
            // Type casting needed for swapping

            K temp = key;
            key = (K) value;
            value = (V) temp;
            System.out.println("Swapped successfully!");
        } else {
            System.out.println("Cannot swap: Different types.");
        }
    }


    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class Generic {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Age", 23);  // creating a pair
        System.out.println("Pair of <string, integer> : ");
        pair1.display();
        pair1.swap();  // This will not swap and show a message since types are different

        System.out.println();


        Pair<Integer, Double> pair2 = new Pair<>(50, 99.9);

        System.out.println("Pair < integer , double > : ");
        pair2.display();
        pair2.swap();  // This will also not swap and show a message since types are different

        System.out.println();



        Pair<Integer, Integer> pair3 = new Pair<>(100, 200);   // integer pairs ;

        System.out.println("Pair< integer , integer>  (before swap):");
        pair3.display();
        pair3.swap();  // This will successfully swap
        System.out.println("Pair < integer ,integer > (after swap):");
        pair3.display();
    }
}
