package com.RPS;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Random  rd = new Random();
        System.out.println("Enter Your Choice \n0 for Rock\n1 for Paper\n2 for Scissor ");
        int UserChoice = Sc.nextInt();
        System.out.println("Your Choice is "+UserChoice);
        int system = rd.nextInt(4);
        // Displaying Computer Choice
        switch (system){
            case 0 -> System.out.println("Computer Choice Rock");
            case 1 -> System.out.println("Computer Choice Paper");
            case 2 -> System.out.println("Computer Choice Scissor");
        }
        if (system==UserChoice){
            System.out.println("It's Tie");
        }
        else if (UserChoice == 0 && system ==2 || UserChoice == 1 && system == 2 || UserChoice == 3 && system ==0  ){
            System.out.println("You Win");
        }
        else {
            System.out.println("You Loose");
        }
    }
}
