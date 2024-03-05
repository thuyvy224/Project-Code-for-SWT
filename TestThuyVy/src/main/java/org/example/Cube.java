package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Cube extends ThreeDimensionalShape {

    private double a;

    public Cube(double a) {
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
            result = Double.parseDouble(formatter.format(6 * a * a));
        } catch (NumberFormatException | ArithmeticException e) {
            result = 0;
        }
        return result;
    }

    @Override
    double getVolume() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result;
        try {
            result = Double.parseDouble(formatter.format(a * a * a));
        } catch (NumberFormatException | ArithmeticException e) {
            result = 0;
        }
        return result;
    }
}

