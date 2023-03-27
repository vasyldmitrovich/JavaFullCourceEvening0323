import java.util.*;

public class hw_4_5 {
    public static void main(String[] args){
    Dogs dog1 = new Dogs("Rokki",12, Dog.Bre.Breed1.getBrd());
    Dogs dog2 = new Dogs("Baks",7, Dog.Bre.Breed2.getBrd());
    Dogs dog3 = new Dogs("Baks",10, Dog.Bre.Breed3.getBrd());


        if(dog1.getName() == dog2.getName()||
                dog1.getName() == dog3.getName() ||
                dog2.getName() == dog3.getName()){
            System.out.println("Two or more Dogs heve the same name! ");
        }
        else{
            System.out.println("All Dogs have individual Names");
        }


        Dogs oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()){
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()){
            oldestDog = dog3;
        }
    System.out.println("Oldest dog is: "+oldestDog.getName()+" and it has "+oldestDog.getBreed()+" Breed");
    }
}
class Dog{
    public enum Bre{
        Breed1("LABRADOR"),
        Breed2("BULLDOG"),
        Breed3("HUSKY");
        private final String br;

        Bre(String br){
            this.br = br;
        }
        public String getBrd(){
            return br;
        }
    }
}

class Dogs{
    private String Name;
    private int Age;
    private String Breed;

    Dogs(){

    }

    public Dogs(String name,int age,String breed){
        Name = name;
        Age = age;
        Breed = breed;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public String  getBreed() {
        return Breed;
    }


}


