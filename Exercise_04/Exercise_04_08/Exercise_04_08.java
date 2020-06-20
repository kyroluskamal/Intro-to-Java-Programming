/*
(Find the character of an ASCII code) Write a program that receives a character
and displays its ASCII code (an integer between 0 and 127). Here is a sample run:
*/
import java.util.*;
import java.lang.*;
public class E4_8 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
           
        System.out.print("Enter a character: ");   
        String i = input.nextLine();
        
        char c = i.charAt(0);
        
        System.out.print("The ASCII code for character " + (int)c);
        
    }
}