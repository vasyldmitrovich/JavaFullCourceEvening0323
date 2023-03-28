import java.time.Year;
import java.time.ZoneId;
public class PersonalInfo {
    public static void main(String[] args) {
        Person pr1 = new Person();
        Person pr2 = new Person();
        Person pr3 = new Person("Alan", "Jackson");
        Person pr4 = new Person("David", "Coperfield");
        Person pr5 = new Person("Arnold", "Shwarzenegger");

        pr1.input("Sarah", "Connor", "1986");

        pr2.setName("Evgen", "Klopotenko");
        pr2.setBirthYear(1983);

        pr3.setBirthYear(1975);

        pr4.changeName("John","Connor");
        pr4.setBirthYear(1990);

        pr5.setBirthYear(1947);

        System.out.println(pr1.output());
        System.out.println(pr2.output());
        System.out.println(pr3.output());
        System.out.println(pr4.output());
        System.out.println(pr5.output());

    }
}

class Person{
    private String firstName, lastName;
    private int birthYear;

    public Person(){}

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeName(String fn, String ln){
        if(fn != ""){
            firstName = fn;
        }
        if(ln != ""){
            lastName = ln;
        }
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public void input(String ...properties){
        this.firstName = properties[0];
        this.lastName = properties[1];
        this.birthYear = Integer.parseInt(properties[2]);
    }

    public String output(){
        return "Person [first name: " + firstName + ", last name: " + lastName +
                ", birth year: " + birthYear + ", age: " + getAge() + "]";
    }

    public int getAge(){
        return Year.now(ZoneId.of("Europe/Kiev")).getValue() - birthYear ;
    }
}