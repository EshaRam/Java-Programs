public class Buzz {

    public static String fizzbuzz(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            // System.out.println("FizzBuzz");
           // System.exit(0);
            return "FizzBuzz";
        }


        if (num % 3 == 0) {
            // System.out.println("Fizz");
            return "Fizz";
        }

        if (num % 5 == 0) {
            // System.out.println("Buzz");
            return "Buzz";
        }
        else {
            return ""+num;
        }


    }
}
