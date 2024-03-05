package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Triangle extends TwoDimensionalShape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Side lengths must be positive.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double p = (a + b + c) / 2;
        double result;
        try {
            result = Double.parseDouble(formatter.format(Math.sqrt(p * (p - a) * (p - b) * (p - c))));
        } catch (NumberFormatException | ArithmeticException e) {
            result = 0;
        }
        return result;
    }
}
