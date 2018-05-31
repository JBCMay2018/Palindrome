package me.afua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Java has a number of classes that you can use to make your life easier.

        // StringBuffer is one that is easy to use and gives you the functionality of a String and so much more.

        // Check the Java8 API for information about the String Buffer class.


        // Why is this better to use than SpringBuilder for web applications? Add that to your comments for your revised application.

        StringBuffer buffer = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence or phrase. Be nice and only use letters and numbers");
        String result = sc.nextLine();

        //What does this line do? Simplify to prove you understand it. Put the value of the reversed entry into reverse.
        String reverse = buffer.append(result).reverse().toString();

        //The String class has some interesting methods. Check the Java8 API again for methods that you can use that will make your life easier.

        //What does the code below do?
        String compareReverse = reverse.replaceAll(" ","");
        String compareResult = result.replaceAll(" ","");

        if(compareResult.equalsIgnoreCase(compareReverse))
            System.out.println("You entered a palindrome");
        else
            System.out.println("Try entering a palindrome");
    }
}
