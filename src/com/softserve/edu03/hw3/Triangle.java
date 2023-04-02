package com.softserve.edu03.hw3;

public class Triangle {
    double s1;
    double s2;
    double s3;

    public double areaTriangle(double s1, double s2, double s3){
        double p = (s1+s2+s3)/2;
        double area = Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
        return area;
    }
}
