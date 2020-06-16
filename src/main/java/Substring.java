//Write a program to find a substring in a given string and then replace it with another string.

public class Substring {

    public static String substring() {
        String s ="Good Afternoon";


        String s1 = s.substring(0,4);

        String s2 = s1.replaceFirst(s1, "Evening");
        String s3 = s1+ " "+s2;
        return s3;
    }

    public static void main(String[] args) {


        String result = Substring.substring();
        System.out.println(result);

    }

}
