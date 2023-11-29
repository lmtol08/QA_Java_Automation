package Automation001;

import java.awt.*;

public class ControlFlowStatements {
    public static void main(String[]args) {

        int a = 100;
        float b = 100.20f;


        if (a > b) {
            System.out.println("yes  it is greater");
        } else {
            System.out.println("NO");
        }

        if (a + b > 150) {
            System.out.println("yes  it is greater");
        } else {
            System.out.println("NO");
        }


            /*
             given an INT check if the int is less than equal to 10
             */

        int x = 9;

        if (x < 10) {
            System.out.println("yes  it is greater");
        } else if (x == 10) {
            System.out.println("Nx = 10");
        } else {
            System.out.println("no");

        }
        /* new way

         */
        int p = 9;

        if (p < 10 || p == 10) {
            System.out.println("yes  it is greater");
        } else {
            System.out.println("no");

        }



 /* watch the logic

  /*  is int less than equal to 10

  */
        int o = 9;

        if (o < 10 && o == 10) {
            System.out.println("yes  it is greater");
        } else {
            System.out.println("no");

        }


        /* SWITCH
goes thru all values until it reaches value. in this ex. month = 100 would return default value
         */
        int month = 2;

        switch (month) {


            case 1:
                System.out.print("jan");
                break;
            case 2:
                System.out.print("feb");
                break;
            case 3:
                System.out.print("mar");
                break;
            default:
                System.out.print("not valid");
                break;

        }



        /* print first 10 numbers


         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 100; i <= 10; i--) {
            System.out.println(i);
        }

        //   show all even numbers
        //
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
        /*
        * java compiles code fro, top to bottom. the statement in the code are executed to the order
in which they appear . java has statements that van be used to control the
* flow of the code. Such statements are called control flow statements. this is a fundamental feature in java which provides
* easy flow of the code.
*
* run time vs compile time:
*
* java cannot do calcs in runtime- it must compile the code first
*
* there are three types of statements
* 1. decision making
*      -if
*      - switch
* 2. loop
*      - do while
*      -while
*      - for
*      - for-each
* 3. jump statements
*       - break
*       - continue
*/
    }