class A {
    public void showA() {
        System.out.println("Hello 51 Intake best of luck for the exam!!!");
    }
}

class C extends A {
}

class D extends A {
}

class E {
    private C obj_c = new C();
    private D obj_d = new D();

    public void showA() {
        obj_c.showA();  // obj_d.showA()  will also work .
    }
}

public class Main {
    public static void main(String[] args) {
        E obj_e = new E();
        obj_e.showA();
    }
}