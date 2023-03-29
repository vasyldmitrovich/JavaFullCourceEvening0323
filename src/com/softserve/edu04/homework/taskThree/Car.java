package com.softserve.edu04.homework.taskThree;

import java.util.Date;

public class Car {
    private Type type;
    private Date year_of_production;
    private float engine_capacity;

    public Car() {
    }

    public Car(Type type, Date year_of_production, float engine_capacity) {
        this.type = type;
        this.year_of_production = year_of_production;
        this.engine_capacity = engine_capacity;
    }

    public Car(Date year_of_production, float engine_capacity) {
        type = Type.SEDAN;
        this.year_of_production = year_of_production;
        this.engine_capacity = engine_capacity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(Date year_of_production) {
        this.year_of_production = year_of_production;
    }

    public float getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(float engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type.name() +
                ", year_of_production=" + year_of_production +
                ", engine_capacity=" + engine_capacity +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (Float.compare(car.getEngine_capacity(), getEngine_capacity()) != 0) return false;
        return getType() == car.getType();
    }

    @Override
    public int hashCode() {
        int result = getType().hashCode();
        result = 31 * result + (getEngine_capacity() != +0.0f ? Float.floatToIntBits(getEngine_capacity()) : 0);
        return result;
    }
}
