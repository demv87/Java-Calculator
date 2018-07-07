package com.company;

import java.util.Scanner;

class Calculator {
    static boolean calc() {
        ReadKeyboard read = new ReadKeyboard ();
        boolean repeat = true;


        do {
            Scanner s=new Scanner (System.in);
            System.out.println ("Make your choise: " );
            char variant = s.next ().charAt (0);

            System.out.println("Introdu numar: ");
            double firstnum = read.readNumbers ();
            System.out.println("Introdu numar: ");
            double secondnum = read.readNumbers ();


            switch (variant) {

                case '1':
                    double suma = firstnum + secondnum;
                    System.out.println("The addition is: " + suma);
                    break;

                case '2':
                    double scadere = firstnum - secondnum;
                    System.out.println("The subscription is: " + scadere);
                    break;
                case '3':
                    double inmultire = firstnum * secondnum;
                    System.out.println("The multiplication is: " + inmultire);
                    break;
                case '4':
                    double impartire = firstnum / secondnum;
                    System.out.println("The division is: " + impartire);
                    break;

                case '5':
                    LogicOperations Compare = new LogicOperations ();
                    System.out.println("The biggest number is: " + LogicOperations.compareNumbers(firstnum,secondnum));
                    break;

                case '0':
                    System.out.println("Time to say goodbye...");
                    System.exit (0);
                    break;

                default:

                    System.out.println("Got to try more");
                    break;


            }System.out.print("\n--------------------------\n");


        }while (!repeat);

        return calc ();
    }
}
