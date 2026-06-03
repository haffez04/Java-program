interface A
{
void displayA();
}
interface B 
{
void display();
}
class c implements A,B {

public void displayA()
{
System.out.println("Interface B");
}
}

class M{
public static void main(String[] args)
{
c obj = new c();
obj.displayA();
obj.displayB();
}
}

