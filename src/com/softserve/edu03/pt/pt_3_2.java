public class pt_3_2 {
    public static void main(String[] args){
    Employee emp1 = new Employee("Max",500,8);
    Employee emp2 = new Employee("Ivan",550,9);
    Employee emp3 = new Employee("Yaroslav",450,7);

    emp1.getSalary();
    emp1.output();
    emp1.Bonus();

    emp2.getSalary();
    emp2.output();
    emp2.Bonus();

    emp3.getSalary();
    emp3.output();
    emp3.Bonus();
    }
}
class Employee{
    private String Name;
    private int Rate;
    private int Hours;


    Employee(){

    }

    public Employee(String name,int rate,int hours){
        Name = name;
        Rate = rate;
        Hours = hours;

    }
    public String getName(){return Name;}
    public int getRate(){return Rate;}
    public int getHours(){return Hours;}


    public void getSalary(){
        System.out.println("The Salary is "+getHours()*getRate());
    }
    public void output(){
        System.out.println("Name: "+Name+" Rate: "+Rate+" Hours: "+Hours+" Salary: "+(getHours()*getRate()));

    }

    public void Bonus(){
        System.out.println("Bonus: "+((getHours()*getRate())*1/10));

    }

}