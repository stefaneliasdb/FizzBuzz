package lab1;

public class Reduce {

    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int n) {

        int counter = 0;
        while (n != 0) {
            boolean odd = n % 2 == 0;
            boolean even = n % 2 != 0;

            if (odd) {
                n = n - 1;
            }
            else {
                n = n / 2;
            }

            counter += 1;
        }
        return counter;
    }
}
