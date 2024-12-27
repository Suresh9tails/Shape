package com.codewithsuresh;

import java.awt.*;

abstract class Shape {
    abstract double calculateArea();

    public void printShape(String shapeName) {
        System.out.println("This is a " + shapeName + ".");
    }
}

    class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;  //Formula for area of circle
    }
}

//Subclass : Rectangle

    class Rectangle extends Shape{
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
            @Override
            double calculateArea(){
                return length * width; // Formula for area of rectangle
            }
        }
