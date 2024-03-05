package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Tetraheron extends ThreeDimensionalShape {

    private double r;

    public Tetraheron(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.r = r;
    }

    @Override
    double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result;
        try {
            result = Double.parseDouble(formatter.format(4 * r * r * Math.PI));
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
            result = Double.parseDouble(formatter.format(4 * r * r * r * Math.PI / 3));
        } catch (NumberFormatException | ArithmeticException e) {
            result = 0;
        }
        return result;
    }
}
