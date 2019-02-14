import java.util.Scanner;
class PowerANumber{
public static void main(String args[]){
Scanner scan =new Scanner(System.in);
System.out.print("Enter the Number:");
int N=scan.nextInt();
System.out.print("Enter the Power:");
int K=scan.nextInt();
int result= 1;
while(K!=0){
result= result*N;
--K;
}
System.out.print("The Answer is : "+result);
}
}
