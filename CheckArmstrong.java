import java.util.Scanner;
class CheckArmstrong{
public static void main(String args[]){
Scanner scan =new Scanner(System.in);
int c=0,a,temp;
System.out.print("Enter the number :");
int n=scan.nextInt();
temp=n;
while(n>0)  
{  
a=n%10;  
n=n/10;  
c=c+(a*a*a);  
}  
if(temp==c)  
System.out.println("armstrong number");   
else  
System.out.println("Not armstrong number");   
}  
}  
