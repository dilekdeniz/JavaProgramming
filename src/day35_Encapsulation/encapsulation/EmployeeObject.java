package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

     Employee employee1=new Employee("Dilek",'F',30,150000);
        System.out.println(employee1);
        employee1.setAge(32);
        System.out.println(employee1);

    Employee employee2=new Employee("Nihal",'F',30,150000);
    employee2.setSalary(employee2.getSalary()+15000);

        System.out.println(employee2);
    }
}
