package com.company;

import java.util.Scanner;
import java.util.zip.Inflater;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        String FVC;
        String FEV1;
        String FEV1_FVC;

        System.out.println("Please enter FVC % value:");
        FVC = TryParseIn(in.next());
        int fvcInt = Integer.parseInt(FVC);
        System.out.println("Please enter FEV1 % value:");
        FEV1 = TryParseIn(in.next());
        int fev1Int = Integer.parseInt(FEV1);
        System.out.println("Please enter FEV1/FVC");
        FEV1_FVC = TryParseIn(in.next());
        int fev1_fvcInt = Integer.parseInt(FEV1_FVC);


        if (fvcInt < 80)
            System.out.println("Looks like restriction.");
        if (fev1_fvcInt < 70)
            System.out.println("Looks like obstruction.");
        


    }
    private static String TryParseIn(String number){ //method to check input to be integer
        int i = 0;
        do {
            try {
                Integer.parseInt(number);

                return number;
            } catch (NumberFormatException e) {
                System.out.println("Value can't be parsed as a number, please try again!");

                Scanner in = new Scanner(System.in);
                number = in.next();


            }
        } while (i == 0);

        return number;

    }
}
