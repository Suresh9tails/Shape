package com.codewithsuresh;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create a circle with radius 5
        Circle circle = new Circle(5);
        circle.printShape("Circle");
        System.out.println("Area of Circle: " + circle.calculateArea());

        //Create a Rectangle with length 7 and width 4
        Rectangle rectangle = new Rectangle(7, 4);
        rectangle.printShape("Rectangle");
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        }
    }