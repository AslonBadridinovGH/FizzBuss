public class Game {


    public static String fizzBuzz(int a) {

        if (a % 3 == 0 && a % 5 == 0) {
            return "fizzBuzz";
        }

        if (a % 3 == 0) {
            return "fizz";
        }
        return Integer.toString(a);
    }
}
