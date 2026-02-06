package question3;

abstract class Employee {
    abstract String calculateSalary();
    public String displayDetails(){
        return "Employee Details";
    }
}

class FullTimeEmployee extends Employee{
    @Override
    String calculateSalary() {
        return "FullTimeEmployee's Salary";
    }
}

class PartTimeEmployee extends Employee{
    @Override
    String calculateSalary() {
        return "PartTimeEmployee Salary";
    }
}

class mainClass{
    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}