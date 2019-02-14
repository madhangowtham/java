import java.util.Scanner;
class CheckPalindrome{
public static void main(String args[]){
Scanner scan =new Scanner(System.in);
int sum=0,a,temp;
System.out.print("Enter the number :");
int n=scan.nextInt();
temp=n;
while(n>0)  
{  
a=n%10;  
n=n/10;  
sum=(sum*10)+a;
}  
if(temp==sum) 
System.out.println("The number is palindrome");
else  
System.out.println("The number is not palindrome");   
}  
}  
