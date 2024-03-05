package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle extends TwoDimensionalShape {

    private double r;

    public Circle() {
    }

    public Circle(double r) {
        if (r < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.r = r;
    }

    @Override
    double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(r * r * Math.PI));
    }

}
