class Employ 
{
    int salary = 30000;   // inherited
}

class Manager extends Employee {
    int bonus = 10000;

    void display() {
        System.out.println(salary); // inherited from Employee
        System.out.println(bonus);  // own variable
    }
}