package com.mainacad;

import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {


    public static void main(String[] args) {
      Square square10=new Square();
      Circle squareCircle=new Circle();
        Triangle squareTriangle= new Triangle();
        squareTriangle.setHeight1(3.0);
        squareTriangle.setSide1(7.0);
      squareCircle.setRadius(10.0);
      square10.setSide(10.0);
        System.out.println("Square with "+
                "radius " + squareCircle.getRadius()+
                " has area "+ squareCircle.getArea());
        System.out.println("Square with "+
                "side " + square10.getSide()+
                " has area "+ square10.getArea());
        System.out.println("Square with "+
                "height " + squareTriangle.getHeight1()+
                " and side "+ squareTriangle.getSide1() +
                " has area "+ squareTriangle.getArea());
    }
}
