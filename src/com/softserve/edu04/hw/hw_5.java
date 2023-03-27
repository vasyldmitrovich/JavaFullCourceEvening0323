public class hw_5 {
    public static void main(String[] args){

        Dog d1 = new Dog("Sam", Dog.Breed.LABRADOR, 3);
        Dog d2 = new Dog("Tom", Dog.Breed.BULLDOG, 5);
        Dog d3 = new Dog("Don", Dog.Breed.POODLE, 6);

        if(d1.getName().equals(d2.getName()) || d1.getName().equals(d3.getName()) || d2.getName().equals(d3.getName()) == false){
            System.out.println("We don't have dogs with same names ! ");
        }else{
            System.out.println("We have dogs with the same name !");
        }
        System.out.println("The oldest dog is " + d3.getName()+ " his age is "+ d3.getAge() + " his breed is " +d3.getBreed());

    }
}
 class Dog{
    enum Breed{
        LABRADOR, POODLE, BULLDOG
    }
    private String Name;
    private Breed breed;
    private int Age;

    public Dog(String name, Breed breedd, int age){
        Name = name;
        breed = breedd;
        Age = age;
    }

     public String getName() {
         return Name;
     }

     public Breed getBreed() {
         return breed;
     }

     public int getAge() {
         return Age;
     }

 }