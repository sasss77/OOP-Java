class ThisO {
    int a;

    void test(int a) {
        this.a = a;
    }
}

public class ThisOperator {
    public static void main(String[] args) {
        ThisO o = new ThisO();
        o.test(10);
        System.out.println("The value is : " + o.a);

    }
}
