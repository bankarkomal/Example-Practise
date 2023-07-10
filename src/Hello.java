//question --> How to print integer entered by an user

import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        //creates reader instace which takes
        //input from standred input from -->

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number:");

        //next int () --> Read the next integer from the keyboard

        int number = reader.nextInt();
        // println --> print the folowing line to the output
        System.out.println("You entered " + number );

    }
}