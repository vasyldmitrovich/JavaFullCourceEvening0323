package com.softserve.edu01.pt;


import java.util.Scanner;

public class AreaTriangle {
 public double  Areal (double a,double b,double c){
  double S=a/b*c;
  return S;
 }
 public static void main(String[] args) {
  Scanner br=new Scanner(System.in);
  double a=br.nextDouble();
  double b=br.nextDouble();
  double c=br.nextDouble();
  AreaTriangle obj=new AreaTriangle();
  double z=obj.Areal(a,b,c);
  System.out.println("Area of a triangle is"+z);
 }


}
