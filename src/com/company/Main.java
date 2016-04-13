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


        if (fvcInt < 80 && fev1_fvcInt < 70)
            System.out.print("Looks like mixed restrictive and obstructive disorder.");
        if (fvcInt < 80)
            System.out.println("Looks like restriction.");
        if (fev1_fvcInt < 70)
            System.out.println("Looks like obstruction.");
        else System.out.printf("Must be normal spirometry!");
        


    }
    private static String Severity(int fev1int)
    {String s = null;
        if (fev1int >= 70)
        {
            s = "mild";
        }
        else if (fev1int > 59 && fev1int < 70)
        {
            s = "moderate";
        }
        else if (fev1int > 49 && fev1int < 60)
        {
            s = "moderately severe";
        }
        else if (fev1int > 34 && fev1int < 50)
        {
            s = "severe";
        }
        else if (fev1int < 35)
        {
            s = "very severe";
        }

        return s;
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
