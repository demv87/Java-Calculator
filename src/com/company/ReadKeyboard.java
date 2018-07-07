package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadKeyboard {
    public int readNumbers() {
        boolean repeat = true;
        int fromUser = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                fromUser = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.out.println("Error! Please try again");
            }

        }
        while (repeat);
        return fromUser;
    }

    public String readText(){
        Scanner scam = new Scanner(System.in);
        return scam.next();
    }
}