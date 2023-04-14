package com.softserve.edu06.hw;

public class FlyingBird extends Bird{

    public FlyingBird(){}

    public FlyingBird(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }
    @Override
    public String fly(){
        return "I believe I can fly!";
    }
}
