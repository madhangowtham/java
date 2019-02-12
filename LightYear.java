import java.util.Scanner;
class LightYear{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the  LightSpeed:");
int ls=scan.nextInt();
System.out.print("Enter the Days:");
long d=scan.nextInt();
System.out.print("Enter the Seconds:");
long s=scan.nextInt();
System.out.print("Enter the Distance:");
long di=scan.nextInt();
s=d*24*60*60;
di=ls*s;
System.out.print("In"+d);
System.out.print("days light will travel about");
System.out.print(di+"miles"); 
}
}
