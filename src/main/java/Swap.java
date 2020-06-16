/*Write a program that swaps 2 given numbers.
You need to have 2 separate functions in the program.
One Function should swap the numbers without any third new variable.
Second function should swap the numbers using a third variable.
 */

public class Swap {

    public static int swapNumber(int num1, int num2) {

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("swapped numbers are " + num1 + "," + num2);

        return temp;
    }

    public static int swap2(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("swapped numbers are " + a + "," + b);

        return a;
    }

    public static void main(String[] args) {

        swapNumber(5, 3);
        swap2(12, 5);

    }
}
