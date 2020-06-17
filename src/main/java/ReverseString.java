public class ReverseString {

    public static String reverse(String s){

        String reverse = "";


        for(int i=s.length()-1;i>=0;i--){


            reverse = reverse + s.charAt(i);
        }
       return reverse.toLowerCase();
    }

    public static void main (String [] args){

        String result = ReverseString.reverse("Welcome");
        System.out.println("reverse of string is ; "+ result);
    }
}
