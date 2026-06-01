import java.util.Scanner;
class arithmetic{
public static void main(String[] args)
{
Scanner SC = new Scanner(System.in);
System.out.println("Enter first number:");
int a = SC.nextInt();
System.out.println("Enter second number:");
int b = SC.nextInt();
System.out.println("addition:"+(a+b));
System.out.println("sub:"+(a-b));
System.out.println("mutiply:"+(a*b));
System.out.println("division:"+(a/b));
System.out.println("modulus:"+(a%b));
}
}