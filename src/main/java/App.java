import java.util.*;

public class App {
        public static void main(String args[])
        {
            int choice, flag=0;
            double num1, num2, num;
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
                    //System.out.println("Enter two numbers");
                    //System.out.print("Enter number 1: ");
                    //num1 = scan.nextDouble();
                    //System.out.print("Enter number 2: ");
                    //num2 = scan.nextDouble();

                    switch(choice) {
                        case 1:
                            System.out.print("Enter the Number : ");
                            num = scan.nextDouble();
                            System.out.println();
                            System.out.println("Square Root of "+num +" = " +SquareRoot(num));
                            break;
                        case 2:
                            System.out.print("Enter the Number : ");
                            num = scan.nextDouble();
                            System.out.println();
                            System.out.println("Factorial of "+num+" = "+Factorial(num));
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
            return Math.sqrt(a);
        }
        static double Factorial(double a) {
            if (a <= 1)
                return 1;
            else
                return a * Factorial(a - 1);
        }
        static double NaturalLogarithm(double a) {
            return Math.log(a);
        }
        static double Power(double a, double b) {
            return Math.pow(a, b);
        }
}
