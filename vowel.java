import java.util.Scanner;
class vowel{
public static void main(String[] que){
System.out.println("Enter the character");
Scanner scan=new Scanner(System.in);
String a=scan.next();
char ch=a.charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
System.out.println("vowel");}
else{
System.out.println("consonant");
}
}
}
