import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Write Java programs for the following:


//        Basic Java Programs


//        1,Area Of Circle Java Program
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius to get area of circle :");
        int r = in.nextInt();

        float p = r*r*3.1416f;
        System.out.println("The area is : " + p);

         */

//        2,Area Of Triangle
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base value :");
        float b = in.nextInt();
        System.out.println("Enter the height value :");
        float h = in.nextInt();

        float area = b * h * 0.5f;

        System.out.println("The area of Triangle is :" + area);

         */

//        3,Area Of Rectangle Program
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height of rectangle :");
        int h = in.nextInt();
        System.out.println("Enter width of rectangle :");
        int w = in.nextInt();

        int area = h*w;

        System.out.println("Area of rectangle is :" + area);

         */

//        4,Area Of Isosceles Triangle
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height :");
        int h = in.nextInt();
        System.out.println("Enter width :");
        int w = in.nextInt();

        float area = (h*w)/2f;
        System.out.println("Area is :" + area);

         */

//        5,Area Of Parallelogram
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Height :");
        int h = in.nextInt();
        System.out.println("Enter Base :");
        int b = in.nextInt();

        int area = b * h ;

        System.out.println("Total area is :" + area);

         */

//        5,Area Of Rhombus
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter d1 :");
        int d1 = in.nextInt();
        System.out.println("Enter d2 :");
        int d2 = in.nextInt();

        float area = (d1 * d2)/2f ;

        System.out.println("Total area is :" + area);

         */

//        6,Area Of Equilateral Triangle
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side value :");
        int d1 = in.nextInt();
        float sqr = (float) Math.sqrt(3);

        float area = (d1 * d1 * sqr)/4f ;

        System.out.println("Total area is :" + area);

         */

//        7,Perimeter Of Circle
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :");
        int r = in.nextInt();

        float area = 2*r*3.1416f ;

        System.out.println("Total area is :" + area);

         */

//        8,Perimeter Of Equilateral Triangle
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Side :");
        int s = in.nextInt();

        float area = s*3f ;

        System.out.println("Total area is :" + area);

         */

//        9,Perimeter Of Parallelogram
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Side :");
        int s = in.nextInt();
        System.out.println("Enter Base :");
        int b = in.nextInt();

        int area = 2*(s+b) ;

        System.out.println("Total area is :" + area);

         */

//        10,Perimeter Of Rectangle
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length :");
        int l = in.nextInt();
        System.out.println("Enter width :");
        int w = in.nextInt();

        int area = 2*(l+w) ;

        System.out.println("Total area is :" + area);

         */

//        11,Perimeter Of Square
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Side :");
        int s = in.nextInt();

        int area = 4*s ;

        System.out.println("Total area is :" + area);

         */

//        12,Perimeter Of Rhombus
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Side :");
        int s = in.nextInt();

        int area = 4*s ;

        System.out.println("Total area is :" + area);

         */

//        13,Volume Of Cone Java Program
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius :");
        float r = in.nextFloat();
        System.out.println("Enter Float :");
        float h = in.nextFloat();

        float ans = (float) ((h/3)*(3.1416*r*r));
        System.out.println("Ans :" + ans);

         */

//        14,Volume Of Prism
        /*
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter base :");
        int b = in.nextInt();
        System.out.println("Enter Height :");
        int h = in.nextInt();

        int area = b*h;

        System.out.println("Area = " + area);

         */

//        15,Volume Of Cylinder
        /*
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter Radius :");
        int r = in.nextInt();
        System.out.println("Enter Height :");
        int h = in.nextInt();

        float area = (r*r*h) * 3.1416f;

        System.out.println("volume = " + area);

         */


//        16,Volume Of Sphere

//        Scanner in  = new Scanner(System.in);
//        System.out.println("Enter Radius :");
//        int r = in.nextInt();
//
//        float area =(float) ((4/3)*(3.1416)*(r*r*r));
//
//        System.out.println("volume = " + area);

//        17,Volume Of Pyramid
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base :");
        int base = in.nextInt();

        float area = base*3.1416f/2;
        System.out.println("Area = " + area);

         */

//        18,Curved Surface Area Of Cylinder
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius :");
        int r = in.nextInt();
        System.out.println("Enter Height :");
        int h = in.nextInt();

        float area = 2*3.1416f*r*h;

        System.out.println("Area :" + area);
         */

//        19,Total Surface Area Of Cube
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Side :");
        int s = in.nextInt();

        int area = 6*s*s;

        System.out.println("Area :" + area);

         */
//        20,Fibonacci Series In Java Programs
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to se fibonacci :");
        int n = in.nextInt();

        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= n ) {
            int temp = i;
            i = i+p;
            p = temp;
            System.out.println(i);
            count ++;
        }

         */


//        21,Subtract the Product and Sum of Digits of an Integer
        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int mult = 1;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10 ;
            mult = mult * rem;
            sum = sum + rem;
            n = n / 10;
        }

        int result = mult - sum;

         System.out.println(result);

         */

//        22,Input a number and print all the factors of that number (use loops).
        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if ( n % i == 0) {
                System.out.println(i);
            }
        }

         */

//        23,Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        /*
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int n = in.nextInt();
            if(n == 0) {
                break;
            }else {
                sum = sum + n;
            }
        }

        System.out.println("The sum is : " + sum );

         */

//        24,Take integer inputs till the user enters 0 and print the largest number from all.
        /*
        Scanner in = new Scanner(System.in);

        int big = 0;

        while (true) {
            int n = in.nextInt();
            if(n == 0) {
                break;
            }else if(n > big){
                big = n;
            }
        }

        System.out.println("Biggest number is : " + big );

         */

//        25,Addition Of Two Numbers
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int n1 = in.nextInt();
        System.out.println("Enter Second Number :");
        int n2 = in.nextInt();

        int sum = n1 + n2;

        System.out.println("Total of two numbers : " +sum);

         */

        //____________________________------------------------------------------___________________________________


//        ---------------------------------Intermediate Java Programs----------------------------------------------
//

//        1,Factorial Program In Java
        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int fact = 1,i = 1;

        for ( i = 1; i <=n ; i++) {
            fact = fact * i;
        }

        System.out.println("The Factorial of " + n + " is " + fact);

         */

//        2,Calculate Electricity Bill
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter unit consumed : ");
        int unit = in.nextInt();
        int bill = 0;

          if (unit <= 100) {
              bill = unit * 10;
          } else if (unit > 100 && unit <= 200) {
              bill = (100 * 10) + ((unit - 100) * 15 );
          }else if ( unit > 200 && unit <= 300 ) {
              bill = (100 * 10) + ( 100 * 15 ) + ((unit - 200 ) * 20);
          }else {
              bill = (100 * 10) + ( 100 * 15 ) + (100 * 20) + ((unit - 300) * 25);
          }

        System.out.println("Total bill for " + unit + " units is : " + bill );

         */

//        3,Calculate Average Of N Numbers
        /*
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter Number to see average or 0 to see average : ");
            int n = in.nextInt();
            if(n == 0 ) {
                break;
            }else{
                count ++;
                total += n;
            }
        }

        int avg = total/count;

        System.out.println("The average is : " + avg);

         */

//        4,Calculate Discount Of Product
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total order amount : ");
        int n = in.nextInt();
        int dis = 0, total = 0;

        if(n < 1000) {
            System.out.println("Your order is not eligible for discount.");
        }else if(n >= 1000 && n < 2000) {
            dis = (n*10)/100;
            total = n - dis;
            System.out.println("Your order value is " + n + " , discount is " + dis + " and Total payable amount is " + total);
        }if(n >= 2000 && n < 3000) {
            dis = (n*20)/100;
            total = n - dis;
            System.out.println("Your order value is " + n + " , discount is " + dis + " and Total payable amount is " + total);
        }if(n >= 3000) {
            dis = (n*30)/100;
            total = n - dis;
            System.out.println("Your order value is " + n + " , discount is " + dis + " and Total payable amount is " + total);
        }

         */

//        5,Calculate Distance Between Two Points
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("distance from your home to barasat :");
        float n = in.nextFloat();
        System.out.println("distance from jaguli to barasat :");
        float n2 = in.nextFloat();

        float distance = n2 - n;

        System.out.println("Distance between your home to jaguli is : " + distance);

         */

//        6,32Calculate Commission Percentage
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("How much sales you made ?");
        int n = in.nextInt();


        if (n < 500000) {
            System.out.println("Your commission in this sales is 5%");
        }if (n > 500000 && n < 100000) {
            System.out.println("Your commission in this sales is 10%");
        }if (n > 1000000) {
            System.out.println("Your commission in this sales is 15%");
        }

         */

//        7,Power In Java
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Enter the power : ");
        int n2 = in.nextInt();

        double power = Math.pow(n,n2);

        System.out.println("The result is : " + power);

         */


//        8,Calculate Depreciation of Value
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the assets value :");
        int value = in.nextInt();
        System.out.println("Enter depreciation time frame : ");
        int time = in.nextInt();

        //Lets assume the standerd depreciation rate is 15%

        int depreciation = value;

        for (int i = 1; i <= time; i++) {
            depreciation = depreciation - (depreciation * 15)/100;
        }

        System.out.println("The remaining value is " + depreciation);

         */

//        9,Calculate Batting Average
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Total score :");
        int score = in.nextInt();
        System.out.println("Total outs :");
        int out = in.nextInt();

        int avg = score/out;

        System.out.println("Batting Average is " + avg);

         */

//        10,Calculate CGPA Java Program
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number gain in Bengali");
        int n1= in.nextInt();
        System.out.println("Enter Number gain in English");
        int n2 = in.nextInt();
        System.out.println("Enter Number gain in Accountancy");
        int n3 = in.nextInt();
        System.out.println("Enter Number gain in Financial Modeling");
        int n4 = in.nextInt();
        System.out.println("Enter Number gain in Cost Accounting");
        int n5 = in.nextInt();
        System.out.println("Enter Number gain in Auditing");
        int n6 = in.nextInt();

        int total = n1 + n2 + n3 + n4 + n5 + n6;

        float avg = total / 6;

        if(avg < 25 ){
            System.out.println("Your CGPA is 'D' and Average" + avg);
        }if(avg <= 35 ){
            System.out.println("Your CGPA is 'C' and Average" + avg);
        }if(avg <= 45 ){
            System.out.println("Your CGPA is 'B' and Average" + avg);
        }if(avg <= 60 ){
            System.out.println("Your CGPA is 'A' and Average" + avg);
        }if(avg <= 75 ){
            System.out.println("Your CGPA is 'A+' and Average" + avg);
        }if(avg <= 90 ){
            System.out.println("Your CGPA is 'AA' and Average" + avg);
        }

         */

        //____________________________------------------------------------------___________________________________

//        11,Compound Interest Java Program
//        12,Calculate Average Marks
//        13,Sum Of N Numbers
//        14,Armstrong Number In Java
//        15,Find Ncr & Npr
//        16,Reverse A String In Java
//        17,Find if a number is palindrome or not
//        18,Future Investment Value
//        19,HCF Of Two Numbers Program
//        20,LCM Of Two Numbers
//        21,Java Program Vowel Or Consonant
//        22,Perfect Number In Java
//        23,Check Leap Year Or Not
//        24,Sum Of A Digits Of Number
//        25,Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
//        26,Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

    }
}