import java.util.Scanner;

public class Simple_Calculator {

    public static void main(String[]args){
        //creat an object of Scanner
        Scanner input=new Scanner(System.in);
        //Declaring variables
        char Operator;
        Double Number1,Number2,Result;

        //asking the user to input the operator
        System.out.println("Enter the operator (+,-,*,/):");
        Operator=input.next().charAt(0);
        //asking the user to input the numbers
        System.out.println("Enter the first number:");
        Number1=input.nextDouble();
        System.out.println("Enter the second number:");
        Number2=input.nextDouble();

        switch(Operator){
            //Performing addition
            case '+':{
                Result=Number1+Number2;
                System.out.println("Addition of "+Number1+ " and "+Number2+" is :" +Result);

            }
            break;
            //Performing subtraction
            case '-':{
                Result=Number1-Number2;
                System.out.println("Subtraction of "+Number1+ " and "+Number2+" is :" +Result);

            }
            break;
           //Performing  multiplication
           case '*':{
            Result=Number1*Number2;
            System.out.println("Multiplication of "+Number1+ " and "+Number2+" is :" +Result);

           }
           break;
            //Performing division
            case '/':{
                Result=Number1/Number2;
                System.out.println("Division of "+Number1+ " and "+Number2+" is :" +Result);

            }
            break;
            //default commend
            default :{
                System.out.println("Unsupported/Invalid input");

            }


        }


         input.close();    
    }
    
}
