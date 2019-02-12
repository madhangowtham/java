import java.util.Scanner;
class CheckSign{
public static void main(String[] args){
System.out.println("Ent the Num");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
if(a<0){
System.out.println("NEGATIVE");
}
else if(a==0){
System.out.println("ZERO");
}
else{
System.out.println("POSITIVE");
}
}
}
