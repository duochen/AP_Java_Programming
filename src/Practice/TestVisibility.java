package Practice;

class AA {
    private int i;
    protected int j;
}

public class TestVisibility extends AA {
    private int k;
    protected int m;

    public void display() {
        System.out.println(this.j + this.k + this.m);
    }

    public static void main(String[] args) {
        TestVisibility b = new TestVisibility();
        b.display();
    }
}

