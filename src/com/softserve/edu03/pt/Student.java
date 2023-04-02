package com.softserve.edu03.pt;

/*Move Student class in separate file, do not write this class there*/
class Student {
    private String name;
    private double rating;
    public static int quantityOfStudents;
    public static double totalRating;

    {
        quantityOfStudents += 1;
    }

    public Student() {
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        totalRating += rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        if (this.rating > 0) {
            totalRating -= this.rating;
        }

        this.rating = rating;
        totalRating += rating;
    }

    public double getRating() {
        return rating;
    }

    public boolean betterStudent(Student s) {
        if (this.rating > s.getRating()) {
            return true;
        } else {
            return false;
        }
    }

    public static double avgRating() {
        return Math.round((totalRating / quantityOfStudents) * 100) / 100d;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + ", rating: " + rating;
    }
}
