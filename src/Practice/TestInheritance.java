package Practice;

class A {
    public A() {
        System.out.println("The default constructor of A is invoked.");
    }
}

class B extends A {
    public B() {
        System.out.println("The default constructor of B is invoked.");
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        B b = new B();
    }
}
