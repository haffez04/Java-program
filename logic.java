import java.util.Scanner;
class logic{
public static void main(String[] args)
{
Scanner SC = new Scanner(System.in);
System.out.println("Enter age:");
int age = SC.nextInt();
System.out.println("Enter mark:");
int mark = SC.nextInt();
System.out.println((age>=18) && (mark>=50));
}
}