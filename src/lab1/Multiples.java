package lab1;

public class Multiples {

    public static void main(String[] args) {

        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int i = 1;
        int counter = 0;

        while (i < n) {
            boolean DivisibleBy3 = i % a == 0;
            boolean DivisibleBy5 = i % b == 0;

            if (DivisibleBy3 || DivisibleBy5) {
                counter += 1;
            }
            i++;
        }

        return counter;
    }

    static int multiples() {
        int i = 1;
        int counter = 0;

        while (i < 1000) {
            boolean DivisibleBy3 = i % 3 == 0;
            boolean DivisibleBy5 = i % 5 == 0;

            if (DivisibleBy3 || DivisibleBy5) {
                counter += 1;
            }
            i++;
        }

        return counter;
    }
}