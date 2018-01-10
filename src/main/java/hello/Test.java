package hello;

/**
 * Created by alex on 09.10.2017.
 */
public class Test {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    static String asd;

    static String asd1;
    static String asd2;
    static String asd3;


    public Test(int a) {
        this.a = a;
    }

    public Test(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Test(int b, int d) {
        this.b = b;
        this.d = d;
    }

    public Test(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public static void main(String[] args) {
        asd = "test";
        asd += "test";
    }
}
