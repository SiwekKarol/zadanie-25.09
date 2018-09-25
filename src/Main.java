public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę z przedziału [0;100]");
        for (int x = 0; x < 101; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println(x + " FizzBuzz");
                } else if (x % 5 == 0) {
                    System.out.println(x + " Buzz");
                } else if (x % 3 == 0) {
                    System.out.println(x + " Fizz");
                }
            }
        }
    }
