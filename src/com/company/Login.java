package com.company;

public class Login {
    public boolean login() {
        ReadKeyboard read = new ReadKeyboard();
        boolean loggedIn = false;
        int counter = 0;

        do {
            System.out.println("Username");
            String username = read.readText();
            System.out.println("Password");
            String password = read.readText();


            if (username.equals("Cosmin") && password.equals("123")) {
                System.out.println("Wellcome" );
                loggedIn = true;
            }
            else if (counter == 1 ){
                System.out.println("Another Invalid Username or password please try again");
            counter++;}
            else if (counter == 2 ){
                System.out.println("Careful last try ");
            counter++;}
            else if (counter == 3 ){
                System.out.println("No tries left");
                counter++;}

            else {
                System.out.println("Invalid Username or password please try again");
                System.out.println("You have " + (3-counter) + " tries left");
                counter++;
                }



        }while (!loggedIn && counter < 4);
        return loggedIn;
    }
}
