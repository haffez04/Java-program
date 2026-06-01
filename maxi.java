public class maxi 
{
public static void main(String[] args) 
{
int[] arr = {10, 45, 2, 98, 33};       
int max = arr[0];      
for (int n: arr) 
{
if (n < max) 
{
max = n;
} 
}
System.out.println("Maximum value: " + max);
}
}
