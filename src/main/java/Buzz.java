public class Buzz {

    public static String fizzbuzz(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            // System.out.println("FizzBuzz");
            System.exit(0);
        }


        if (num % 3 == 0) {
            // System.out.println("Fizz");

        }

        if (num % 5 == 0) {
            // System.out.println("Buzz");
            return "Buzz";
        } else {
            System.out.println(num);
        }

        return "";
    }
}
