package com.mainacad.circle;

import com.mainacad.abs.Abs;

public class Circle extends Abs {

        private double radius;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override//пометка над методом,который был изменен по отношению к родительскому классу
        public double getArea(){
            return radius*radius*Math.PI;
        }

}
