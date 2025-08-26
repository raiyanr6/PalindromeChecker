import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Test Cases
        System.out.println(isPalindrome(543));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(5115));
    }
    public static boolean isPalindrome(int x){
        //check if the value of x is negative
        if(x<0){
            return false;
        }
        int original = x; //store the value of x in variable original
        long rev = 0; //initialize variable rev and set the value to 0
        while (x!=0) { // while loop to iterate through all the digits in x
            int lastInt = x % 10; //takes the last digit of x
            rev = rev * 10 + lastInt;
            x = x/10; //makes sure x becomes 0
        }

        if (original == rev){
            //compare original and reverse
            return true;
        }
        else {
            return false;
        }
    }
}