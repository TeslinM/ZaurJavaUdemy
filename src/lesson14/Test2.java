package lesson14;

public class Test2 {
    public static void main(String[] args) {
        for(int i = 5; i<11; i++) {
            System.out.println(i);
            abc(10);
        }
    }

    static void abc(int a) {
        System.out.println(a);
    }
}
