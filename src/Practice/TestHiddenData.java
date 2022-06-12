package Practice;

class F {
    private int i = 5;
    private static double k = 0;

    void setI(int i) {
        this.i = i;
    }

    static void setK(double k) {
        F.k = k;
    }
}
public class TestHiddenData {
    public static void main(String[] args) {
        F f1 = new F();
        F f2 = new F();
        f1.setI(10);
        f2.setI(45);
    }
}
