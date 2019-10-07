package com.mainacad.triangle;

import com.mainacad.abs.Abs;
import com.mainacad.abs.Shape;

public class Triangle extends Abs {
  private double side1;
   private double height1;
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getHeight1() {
        return height1;
    }

    public void setHeight1(double height1) {
        this.height1 = height1;
    }
    @Override
    public double getArea(){
        return (side1*height1)/2;
    }
}
