package Practice;

class Fruit {
    public Fruit() {
        System.out.println("Fruit's default constructor is invoked");
    }
    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked");
    }
}

class Apple extends Fruit {

}

public class TestNoDefaultSuperClass {
    public static void main(String[] args) {
        Apple a = new Apple();
    }
}
