package com.mainacad;

import com.mainacad.abs.Abs;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;
import com.mainacad.abs.Shape;
public class ApplicationRunner {


    public static void main(String[] args) {
      Triangle triangle=new Triangle();
      triangle.setSide1(15);
      triangle.setHeight1(10);
      Circle circle=new Circle();
      circle.setRadius(12);
      Square square=new Square();
      square.setSide(28);
      Shape maxShape;
      if(circle.getArea()>square.getArea()){
        maxShape=circle;
      }else{
        maxShape=square;
      }
      if(maxShape.getArea()<triangle.getArea()){
        maxShape=triangle;
      }
      System.out.println("Max shape is "+maxShape.getClass().getSimpleName()+" has area "+maxShape.getArea());
      Triangle triangle1=new Triangle();
      triangle1.setSide1(15);
      triangle1.setHeight1(10);
      Circle circle1=new Circle();
      circle1.setRadius(12);
      Square square1=new Square();
      square1.setSide(28);
      Shape minShape;
      if(circle1.getArea()<square1.getArea()){
        minShape=circle1;
      }else{
        minShape=square1;
      }
      if(minShape.getArea()<triangle1.getArea()){
        minShape=triangle1;
      }
      System.out.println("Min shape is "+minShape.getClass().getSimpleName()+" has area "+minShape.getArea());
//      Square square10=new Square();
//      Circle squareCircle=new Circle();
//        Triangle squareTriangle= new Triangle();
//        squareTriangle.setHeight1(3.0);
//        squareTriangle.setSide1(7.0);
//      squareCircle.setRadius(10.0);
//      square10.setSide(10.0);
//        System.out.println("Square with "+
//                "radius " + squareCircle.getRadius()+
//                " has area "+ squareCircle.getArea());
//        System.out.println("Square with "+
//                "side " + square10.getSide()+
//                " has area "+ square10.getArea());
//        System.out.println("Square with "+
//                "height " + squareTriangle.getHeight1()+
//                " and side "+ squareTriangle.getSide1() +
//                " has area "+ squareTriangle.getArea());

    }
}
