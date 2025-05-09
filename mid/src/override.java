class Parent {


    void show() throws Exception {

        System.out.println("Parent class method");

    }


}

class Child extends Parent {
    @Override
    void show() throws RuntimeException { // Allowed: Subclass of Exception
        System.out.println("Child class method");
    }

}


//  The overridden method cannot throw broader exceptions than the parent method.