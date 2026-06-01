import java.util.Scanner;

public class countwords
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter sentence: ");
String sentence = sc.nextLine();
String[] words = sentence.trim().split("\\s+");
System.out.print("Word count: " + words.length);
sc.close();
}
}

