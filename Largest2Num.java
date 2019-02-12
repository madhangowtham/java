import java.util.Scanner;
class Largest2Num{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the first number : ");
float num1=scan.nextInt();		
System.out.print("Enter the Second number : ");
float num2=scan.nextInt();	

/** Math.max(); OR Math.mIN();   function is an inbuilt function in Java which returns maximum of two numbers.
 The arguments are taken in int, double, float and long**/

System.out.println("The large num of the three numbers is " +Math.max(num1,num2));
System.out.println("The small num of the three numbers is " +Math.min(num1,num2));
}
}
