class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = "Meenakshi";
        this.salary = 51000;
    }
}

    class Manager extends Employee {
        String department;

        Manager(String name, double salary,String department) 
        {
            super(name,salary);
            this.department = department;
            System.out.println("Name:" + this.name);
            System.out.println("Salary:" + this.salary);
            System.out.println("Department:" + this.department);
        }
}
public class EmployeeConstructor
{
    public static void main(String args[])
    {
        Manager obj = new Manager("Meenakshi",51000,"Information technology");
    }
}
