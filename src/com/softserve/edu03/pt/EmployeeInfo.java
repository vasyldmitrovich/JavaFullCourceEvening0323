public class EmployeeInfo {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Homer Simpson");
        Employee emp3 = new Employee("Alan Jackson", 166, 15.0);

        emp1.setName("Petro Incognito");
        emp1.setHours(45);
        emp1.setRate(7.50);

        emp2.setHours(120);
        emp2.setRate(10.45);

        System.out.println(emp1.toString());// toString() not needed
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        System.out.println("Total salary: " + Employee.totalSum);

    }
}

class Employee{
    private String name;
    private int hours;
    private double rate;
    public static double totalSum = 0;

    public Employee(){}

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, int hours, double rate){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public double getSalary(){
        return rate * hours;
    }

    public String toString(){
        double salary = getSalary();
        totalSum += salary;
        return "Name: " + name + ", salary: " + getSalary() + ", bonuse: " + getBonuses(salary);
    }

    public double getBonuses(double salary){
        return salary * 0.1;
    }
}