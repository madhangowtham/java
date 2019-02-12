import java.util.Scanner;
class CheckGreater{
public static void main(String[] args){
System.out.println("Enter the 3 Numbers");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>c&&a>b)
System.out.println(a+" is greater");
else if(b>c)
System.out.println(b+" is greater");
else
System.out.println(c+" is greater");
}
}
