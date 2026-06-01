public class string 
{
public static void main(String[] args)
{
String str = "Java Programming";
System.out.println("1. Length: " +str.length());
System.out.println("2. Character at 2: " +str.charAt(2));
System.out.println("3. Substring: " +str.substring(1, 5));
System.out.println("4. Uppercase: " +str.toUpperCase());
System.out.println("5. Lowercase: " +str.toLowerCase());
System.out.println("6. Trim: " +str.trim());
System.out.println("7. Contains java: " +str.contains("Java"));
System.out.println("8. Starts with Ja: " +str.trim().startsWith("Ja"));
System.out.println("9. Ends with Ja: " +str.trim().endsWith("ing"));
System.out.println("10. Replace: " +str.replace("Java", "Python"));
}
}