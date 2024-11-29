package New;

import java.util.Scanner;

public class Palindrome1
{

    public static int reverseNumber(int num) 
    {
        int rev = 0;
        while (num > 0) 
        {
            rev = rev * 10 + num % 10;  
        }
        return rev;
    }

    public static boolean isPalindrome(int num) 
    {
        int rev = reverseNumber(num);  
        return num == rev;  
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        
        if (isPalindrome(num)) 
        {
            System.out.println("Given number is Palindrome");
        } 
        else 
        {
            System.out.println("Given number is not a Palindrome");
        }
        
}
}

