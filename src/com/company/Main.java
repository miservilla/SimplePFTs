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
        int fvcInt = TryParseIn();
        System.out.println("Please enter FEV1 % predicted value:");
        int fev1Int = TryParseIn();
        System.out.println("Please enter actual FEV1/FVC %:");
        int fev1_fvcInt = TryParseIn();

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

      private static int TryParseIn(){
          Scanner sc = new Scanner(System.in);
          int number;
          do {
              while (!sc.hasNextInt()){
                  System.out.printf("Can not parse, please enter positive integer value!\n");
                  sc.next();
              }
              number = sc.nextInt();
              if (number <=0){
                  System.out.printf("Can not parse, please enter positive integer value!\n");
              }
          } while (number <= 0);

          return number;
      }
}
