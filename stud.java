import java.util.*;
class stud
{
int id;
String name;
student(int id,String name)
{
this.id = id;
this.name = name;
}
}
Class main
{
public static void main(String[] args)
{
ArrayList<student> students = new ArrayList<>();
students.add(new student(101,"Anu"));
students.add(new student(102,"kavi"));
for(student s : students)
{
System.out.println(s,id+" "+s.name);
}
}
}