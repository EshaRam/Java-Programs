public class Factorial {

//is the product of all positive integers less than or equal to n.


    public static int nonrecursive(int num) {

        if (num < 0) {
            System.out.println("Enter positive number");
            return 0;
        }


        int sum = 1;

        for (int i = num; i >= 1; i--) {

            sum = sum * i;

        }

        return sum;
    }





        public static int recursive ( int num){
            if (num < 0) {
                System.out.println("Enter positive number");
                return 0;
            }


                if (num == 1)
                    return 1;

                else {

                    return (num * recursive(num - 1));
                }
            }




        public static void main (String[]args){

            int factorial = nonrecursive(5);

            System.out.println("Factorial in non-recursive method is: " + factorial);

            factorial = recursive(6);
            System.out.println("Factorial in recursive method is: " + factorial);
        }

}
