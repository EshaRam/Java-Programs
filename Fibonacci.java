public class Fibonacci {

    public static int[] fibonacci(int n){

        int arr[]= new int [n];
        int num1=0;
        int num2=1;

    //    System.out.println(num1);
    //    System.out.println(num2);

        for (int i=2;i<n;i++) {
            int num3 = num1+num2;

            arr[i]= num3;
            num1=num2;
            num2=num3;
           // System.out.println( arr[i]);

        }

        return arr;
    }
    public static void main(String[] args) {
        int res[]= Fibonacci.fibonacci(10);

      /*  for (int i=0;i<res.length;i++) {
            System.out.print(res[i]);
            if (i < res.length - 1)
                System.out.print(",");


        }
            //System.out.println("Printing result array of "+i+" value is :"+res[i]);
*/
    }
}
