import java.util.Scanner;
class Factorial{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the number :");
int num=scan.nextInt();
int factorial= 1;
for(int i = 1; i <= num; ++i){
factorial =factorial*i;
}
System.out.print("Factorial is :"+factorial);
}
}
