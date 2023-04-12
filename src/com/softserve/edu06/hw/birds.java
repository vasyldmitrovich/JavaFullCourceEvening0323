package com.softserve.edu06.hw;

abstract  class birds {
   private String feathers;
   private String layEggs;
    public abstract void Mykd() ;
   public  birds(String feathers,String layEggs){
       this.feathers=feathers;
       this.layEggs=layEggs;
   }
    public abstract void fly() ;



    @Override
    public String toString() {
        return  " feathers -"+feathers +"\t"+"layEggs -"+ layEggs+" \t " ;
    }
    public void print(){
        System.out.println(toString());
    }

}
class FlyingBird extends birds{
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void Mykd() {
        System.out.println("I don't know what kind of bird i am");
    }
    @Override
    public void fly() {
        System.out.println("This birds can fly");
    }


}

class NoFlyingBird extends birds{

    public NoFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This birds cann't fly");
    }
    @Override
    public void Mykd() {
        System.out.println("I don't know what kind of bird i am");
    }

}

class Penguin  extends NoFlyingBird {

    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void Mykd(){
        System.out.println("I'm a penguin");
    }
}
class Kiwi  extends NoFlyingBird {

    public Kiwi(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void Mykd(){
        System.out.println("I'm a Kiwi");
    }
}
    class  Eagle extends FlyingBird {

        public Eagle(String feathers, String layEggs) {
            super(feathers, layEggs);
        }
        @Override
        public void Mykd(){
            System.out.println("I'm a Eagle");
        }
    }
class Swallow extends FlyingBird {

    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void Mykd(){
        System.out.println("I'm a Swallow");
    }
}
