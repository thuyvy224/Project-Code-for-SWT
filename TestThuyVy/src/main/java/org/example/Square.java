package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Square extends TwoDimensionalShape {

    private double a;

    public Square(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.a = a;
    }

    @Override
    double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result;
        try {
            result = Double.parseDouble(formatter.format(a * a));
        } catch (NumberFormatException | ArithmeticException e) {
            result = 0;
        }
        return result;
    }
}

