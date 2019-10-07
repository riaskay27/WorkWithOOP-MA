package com.mainacad.square;

import com.mainacad.abs.Abs;

public class Square extends Abs {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }

}
