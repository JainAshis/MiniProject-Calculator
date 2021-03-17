import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import static java.lang.Math.*;

public class App {
        public static final Logger logger= LogManager.getLogger(App.class);
        public static void main(String args[])
        {
            int choice, flag=0;
            double num1, num2, num;
            int num3;
            Scanner scan = new Scanner(System.in);

            System.out.println("-----------------------CALCULATOR-----------------------");
            do {
                System.out.println("1 for Square Root\n2 for Factorial\n3 for Natural Logarithm\n4 for Power\n");
                System.out.print("Enter your choice: ");
                choice = scan.nextInt();
                if (choice > 4 || choice <1) {
                    flag = 1;
                    System.out.println("Invalid choice, exiting\n");
                }
                else if (flag != 1){

                    switch(choice) {
                        case 1:
                            System.out.print("Enter the Number : ");
                            num = scan.nextDouble();
                            System.out.println();
                            System.out.println("Square Root of "+num +" = " +SquareRoot(num));
                            break;
                        case 2:
                            System.out.print("Enter the Number : ");
                            num3 = scan.nextInt();
                            System.out.println();
                            System.out.println("Factorial of "+num3+" = "+Factorial(num3));
                            break;
                        case 3:
                            System.out.print("Enter the Number : ");
                            num = scan.nextDouble();
                            System.out.println();
                            System.out.println("Natural Logarithm of "+num+" = "+NaturalLogarithm(num));
                            break;
                        case 4:
                            System.out.print("Enter the Base : ");
                            num1 = scan.nextDouble();
                            System.out.print("Enter the Exponent : ");
                            num2 = scan.nextDouble();
                            System.out.println();
                            System.out.println("Number raised to the power "+num2+" of "+num1+" = "+Power(num1, num2));
                            break;
                        default: System.out.println("Exiting, Bye");
                            flag=1;
                    }
                }
                System.out.println("\n");
            }while(flag==0);
        }

        static double SquareRoot(double a) {
            logger.info("Calculate the Square Root of  "+a);
            logger.info("Result of the square root of "+a+" is "+Math.sqrt(a));
            return Math.sqrt(a);
        }
        static int Factorial(int a) {
            logger.info("Calculate Factorial of number "+ a);
            int res=1;
            if(a==0||a==1)
                return 1;
            for(int i=a;i>=1;i--){
                res=res*i;
            }
            logger.info("Result of factorial of "+a +" is "+res);
            return res;
        }
        static double NaturalLogarithm(double a) {
            logger.info("Calculate the Natural Log of "+a);
            logger.info("Result of Natural Log of "+a+" is "+Math.log(a));
            return Math.log(a);
        }
        static double Power(double a, double b) {
            logger.info("Find Power of the number "+a+","+b);
            logger.info("Result of Power of the number "+a+","+b+" is "+ Math.pow(a,b));
            return Math.pow(a, b);
        }
}
