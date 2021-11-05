package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(6,7,8);
        System.out.println("Area of triangle : "+Triangle.getArea(triangleA.getSide1(), triangleA.getSide2(), triangleA.getSide3()));
        System.out.println("Perimeter of triangle : "+Triangle.getPerimeter(triangleA.getSide1(),triangleA.getSide2(),triangleA.getSide3()));
    }
}

class Triangle {
    private int Side1;
    private int Side2;
    private int Side3;

    public Triangle(int side1, int side2, int side3) {
        Side1 = side1;
        Side2 = side2;
        Side3 = side3;
    }

    public static int getArea(int side1, int side2,int side3){return side1+side3/2;}
    public static int getPerimeter(int side1, int side2, int side3){return side1+side2+side3;}

    public int getSide1() {return Side1;}
    public int getSide2() {return Side2;}
    public int getSide3() {return Side3;}
}