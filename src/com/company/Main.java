package com.company;


public class Main {

       public static void main(String[] args) {
           Calculator calculator = new Calculator ();
           ReadKeyboard read = new ReadKeyboard();
           Login login = new Login();

           if (login.login())
               System.out.println ("1. Adunare" + "\n" + "2. Scadere" + "\n" + "3. Inmultire" + "\n" + "4. Impartire" +"\n" + "5. Compare");

           if (Calculator.calc()){

               }
}
}