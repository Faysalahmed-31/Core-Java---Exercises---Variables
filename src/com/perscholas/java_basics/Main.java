package com.perscholas.java_basics;

public class Main {

       public static void integers(){
           // declare two int variable Assign the sum to a variable
           int myInt= 24;
           int myInt2= 32;
           int Total = myInt  + myInt2;
           System.out.println(  "the Total sum of  int value : " + Total);
       }

         public static void Double(){
              // declares 2 double variables, assigns a number to each, and adds them together.
             // Assign the sum to a variable
             double myDouble1 = 34.25 ;
             double myDouble2 = 20.5;
             double Sum  = myDouble1 + myDouble2;
             System.out.println( " the Total sum of  double values: " + Sum);
         }
           static void DoubleVariable(){
             // declares an integer variable and a double variable, assigns
               int myAge = 20;
               double myFreindAge = myAge;
               double hourlyWage = 20.14;
               double totalSum = myFreindAge + hourlyWage;
               System.out.println("The variable type is double and The total Sum :" + totalSum);
           }

            static void DoubleInt(){
           //declares 2 integer variables, assigns an integer to each,
            // and divides the larger number by the smaller number

                int  largerNumber = 184;
                int smallerNumber = 98;
                double devideInt = largerNumber / smallerNumber ;
                System.out.println( " the output when two int devided : " + devideInt);
                System.out.println("possible lossy conversion from double to int");
            }

              static void Double2(){
                  double largerDoubleNumber = 458.45;
                  double smallerDoubleNumber = 42.12;
                  double devideDouble = largerDoubleNumber / smallerDoubleNumber ;
                  System.out.println( "the Output if double devided: " + devideDouble);
              }

              static void DoubleCast(){
                  int x =  5 ;
                  double y =  6 ;
                  int castInt = (int) y;
                  double q = y / x ;

                  System.out.println( "the value of q after casting  : " + q );
              }
                 static void ConstantVariable(){
                     final double LENGTH = 12;
                     final  int   WIDTH  = 8  ;
                     final  double areaOfTriangle = LENGTH * WIDTH / 2;
                     System.out.println("The area of Triangle : " + areaOfTriangle);

                 }
                   static void Variable3(){
                       int teaPrice = 2;
                       double sodaPrice = 1.2 ;
                       double coffeePrice = 2.5 ;
                       double subTotal = (teaPrice * 3) + (sodaPrice * 4) + (coffeePrice * 2) ;
                       final double SALES_TAX = 0.78;

                       double totalSale = subTotal + SALES_TAX;
                       System.out.format(" the totalSale rounded to 2 decimal : %.2f", totalSale );

                   }
                public static void main(String[] args) {
                   integers();
                    Double();
                    DoubleVariable();
                    DoubleInt();
                    Double2();
                    DoubleCast();
                    ConstantVariable();
                    Variable3();
    }
}
