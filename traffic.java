import java.util.Scanner;
public class traffic
{
public static void main(String[] args)
{
Scanner SC = new Scanner(System.in);
System.out.println("Enter signal:");
String input = SC.next();
switch(input){
case "R":
System.out.println("STOP");
break;
case "Y":
System.out.println("WAIT");
break;
case "G":
System.out.println("GO");
break;
default:
System.out.println("INVAILD DATA");

}
}
}
