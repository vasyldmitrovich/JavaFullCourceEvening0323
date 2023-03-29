public class PersonInfoExample {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student("Robert", 9);
        Student st3 = new Student("Pablo", 5.5);

        st1.setName("Enrike");
        st1.setRating(8.7);

        System.out.println("Quantity of students: " + Student.quantityOfStudents);
        System.out.println("Total rating: " + Student.totalRating);
        System.out.println("The average rating is: " + Student.avgRating());

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}

/*Move Student class in separate file, do not write this class there*/
class Student{
    private String name;
    private double rating;
    public static int quantityOfStudents;
    public static double totalRating;

    {
        quantityOfStudents += 1;
    }

    public Student(){}

    public Student(String name, double rating){
        this.name = name;
        this.rating = rating;
        totalRating += rating;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRating(double rating){
        if(this.rating > 0){
            totalRating -= this.rating;
        }

        this.rating = rating;
        totalRating += rating;
    }

    public double getRating(){
        return rating;
    }

    public boolean betterStudent(Student s){
        if(this.rating > s.getRating()){
            return true;
        } else {
            return false;
        }
    }

    public static double avgRating(){
        return Math.round((totalRating / quantityOfStudents) * 100) / 100d;
    }

    public String toString(){
        return "Student's name: " + name + ", rating: " + rating;
    }

}
