package com.company;

import java.util.Scanner;
import java.util.zip.Inflater;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        String FVC;
        String FEV1;
        String FEV1_FVC;
        String s;

        System.out.println("Please enter FVC % predicted value:");
        FVC = TryParseIn(in.next());
        int fvcInt = Integer.parseInt(FVC);
        System.out.println("Please enter FEV1 % predicted value:");
        FEV1 = TryParseIn(in.next());
        int fev1Int = Integer.parseInt(FEV1);
        System.out.println("Please enter actual FEV1/FVC %:");
        FEV1_FVC = TryParseIn(in.next());
        int fev1_fvcInt = Integer.parseInt(FEV1_FVC);


        s = Severity(fev1Int);

        if (fvcInt < 80 && fev1_fvcInt < 70)
            System.out.println("Looks like mixed restrictive and " + s + " obstructive disorder.");

        else if (fvcInt < 80)
            System.out.println("Looks like a restrictive disorder.");

        else if (fev1_fvcInt < 70)
            System.out.println("Looks like a " + s + " obstructive disorder.");

        else System.out.println("Looks like normal spirometry!");
        


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
                System.out.println("Value can't be parsed as an integer, please try again!");

                Scanner in = new Scanner(System.in);
                number = in.next();


            }
        } while (i == 0);

        return number;

    }
}
