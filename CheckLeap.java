import java.util.Scanner;
class CheckLeap{
public static void main(String[] args){
System.out.println("Enter the Year");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
if(a%4==0)
if(a%100==0)
if(a%400==0)
System.out.println(a+" is the Leap Year");
else
System.out.println(a+" is not Leap Year");
else
System.out.println(a+" is the Leap Year");
else
System.out.println(a+" is not Leap Year");
}
}
