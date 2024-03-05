package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



class MainTest {

    @Test
    void testValidRadius() {
        Shape circle = new Circle(5);
        Assertions.assertEquals(78.54, circle.getArea(), 0.01);
    }

    @Test
    void testZeroRadius() {
        Shape circle = new Circle(0);
        Assertions.assertEquals(0, circle.getArea(), 0.01);
    }

    @Test
    void testNegativeRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }

    @Test
    void testInValidRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(Double.parseDouble("a")));
    }

    @Test
    void testLargeRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(9999999));
    }

    @Test
    void testNullRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle());
    }
}

class TriangleTest {

    @Test
    void testValidEquilateralTriangle() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assertions.assertEquals(3.90, triangle.getArea(), 0.01);
    }

    @Test
    void testValidRightTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assertions.assertEquals(6.00, triangle.getArea(), 0.01);
    }

    @Test
    void testValidScaleneTriangle() {
        Triangle triangle = new Triangle(3, 4, 6);
        Assertions.assertEquals(5.33, triangle.getArea(), 0.01);
    }

    @Test
    void testInvalidNonTriangle() {
        Triangle triangle = new Triangle(1, 2, 5);
        Assertions.assertEquals(0, triangle.getArea(), 0.01);
    }

    @Test
    void testInvalidNegativeSide() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(-3, 4, 5));
    }

    @Test
    void testInvalidZeroSide() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 4, 5));
    }

    @Test
    void testInvalidLargeSide() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, Double.MAX_VALUE));
    }

    @Test
    void testInvalidNaN() {
        Triangle triangle = new Triangle(Double.NaN, 4, 5);
        Assertions.assertEquals(0, triangle.getArea(), 0.01);
    }

    @Test
    void testInvalidInfinity() {
        Triangle triangle = new Triangle(Double.POSITIVE_INFINITY, 4, 5);
        Assertions.assertEquals(0, triangle.getArea(), 0.01);
    }
}

class SquareTest {

    @Test
    void testValidSideLength() {
        Square square = new Square(5);
        Assertions.assertEquals(25.00, square.getArea(), 0.01);
    }

    @Test
    void testInvalidNegativeSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(-5));
    }

    @Test
    void testInvalidZeroSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(0));
    }

    @Test
    void testInvalidLargeSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(Double.MAX_VALUE));
    }

    @Test
    void testInvalidNaN() {
        Square square = new Square(Double.NaN);
        Assertions.assertEquals(0, square.getArea(), 0.01);
    }

    @Test
    void testInvalidInfinity() {
        Square square = new Square(Double.POSITIVE_INFINITY);
        Assertions.assertEquals(0, square.getArea(), 0.01);
    }
}

class CubeAreaTest {

    @Test
    void testValidSideLength() {
        Cube cube = new Cube(5);
        Assertions.assertEquals(150, cube.getArea());
    }

    @Test
    void testInvalidNegativeSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Cube(-5));
    }

    @Test
    void testInvalidZeroSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Cube(0));
    }

    @Test
    void testInvalidLargeSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Cube(Double.MAX_VALUE));
    }

    @Test
    void testInvalidNaN() {
        Cube cube = new Cube(Double.NaN);
        Assertions.assertEquals(0, cube.getArea(), 0.01);
    }

    @Test
    void testInvalidInfinity() {
        Cube cube = new Cube(Double.POSITIVE_INFINITY);
        Assertions.assertEquals(0, cube.getArea(), 0.01);
    }
}

class CubeVolumeTest {

    @Test
    void testValidSideLength() {
        Cube cube = new Cube(5);
        Assertions.assertEquals(125, cube.getVolume());
    }

    @Test
    void testInvalidNegativeSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Cube(-5));
    }

    @Test
    void testInvalidZeroSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Cube(0));
    }

    @Test
    void testInvalidLargeSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Cube(Double.MAX_VALUE));
    }

    @Test
    void testInvalidNaN() {
        Cube cube = new Cube(Double.NaN);
        Assertions.assertEquals(0, cube.getArea(), 0.01);
    }

    @Test
    void testInvalidInfinity() {
        Cube cube = new Cube(Double.POSITIVE_INFINITY);
        Assertions.assertEquals(0, cube.getArea(), 0.01);
    }
}

class TetrahedronAreaTest {

    @Test
    void testValidSideLength() {
        Tetraheron tetraheron = new Tetraheron(5.0);
        Assertions.assertEquals(314.16, tetraheron.getArea());
    }

    @Test
    void testInvalidNegativeSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tetraheron(-5));
    }

    @Test
    void testInvalidZeroSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tetraheron(0));
    }

    @Test
    void testInvalidLargeSideLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tetraheron(Double.MAX_VALUE));
    }

    @Test
    void testInvalidNaN() {
        Tetraheron tetraheron = new Tetraheron(Double.NaN);
        Assertions.assertEquals(0, tetraheron.getArea(), 0.01);
    }

    @Test
    void testInvalidInfinity() {
        Tetraheron tetraheron = new Tetraheron(Double.POSITIVE_INFINITY);
        Assertions.assertEquals(0, tetraheron.getArea(), 0.01);
    }
}

class TetrahedronTest {

    @Test
    void testValidRadius() {
        Tetraheron tetraheron = new Tetraheron(5);
        Assertions.assertEquals(523.6, tetraheron.getVolume(), 0.01);
    }

    @Test
    void testInvalidNegativeRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tetraheron(-5));
    }

    @Test
    void testInvalidZeroRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tetraheron(0));
    }

    @Test
    void testInvalidLargeRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tetraheron(Double.MAX_VALUE));
    }

    @Test
    void testInvalidNaN() {
        Tetraheron tetraheron = new Tetraheron(Double.NaN);
        Assertions.assertEquals(0, tetraheron.getVolume(), 0.01);
    }

    @Test
    void testInvalidInfinity() {
        Tetraheron tetraheron = new Tetraheron(Double.POSITIVE_INFINITY);
        Assertions.assertEquals(0, tetraheron.getVolume(), 0.01);
    }
}

class SphereAreaTest {

    @Test
    void testValidRadiusInteger() {
        Sphere sphere = new Sphere(5);
        Assertions.assertEquals(314.16, sphere.getArea(), 0.01);
    }

    @Test
    void testValidRadiusDouble() {
        Sphere sphere = new Sphere(4.5);
        Assertions.assertEquals(254.47, sphere.getArea(), 0.01);
    }

    @Test
    void testValidLargeRadius() {
        Sphere sphere = new Sphere(99999999);
        Assertions.assertEquals(50265482432.45, sphere.getArea(), 0.01);
    }

    @Test
    void testZeroRadius() {
        Sphere sphere = new Sphere(0);
        Assertions.assertEquals(0, sphere.getArea(), 0.01);
    }

    @Test
    void testNegativeRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Sphere(-1));
    }

    @Test
    void testInputStringA() {
        Sphere sphere = new Sphere(Double.parseDouble("A"));
        Assertions.assertEquals(0, sphere.getArea(), 0.01);
    }
}

class SphereVolumeTest {

    @Test
    void testValidRadiusInteger() {
        Sphere sphere = new Sphere(5);
        Assertions.assertEquals(523.33, sphere.getVolume(), 0.01);
    }

    @Test
    void testValidRadiusDouble() {
        Sphere sphere = new Sphere(4.5);
        Assertions.assertEquals(381.70, sphere.getVolume(), 0.01);
    }

    @Test
    void testValidLargeRadius() {
        Sphere sphere = new Sphere(99999999);
        Assertions.assertEquals(4188790234249.21, sphere.getVolume(), 0.01);
    }

    @Test
    void testZeroRadius() {
        Sphere sphere = new Sphere(0);
        Assertions.assertEquals(0, sphere.getVolume(), 0.01);
    }

    @Test
    void testNegativeRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Sphere(-1));
    }

    @Test
    void testInputStringA() {
        Sphere sphere = new Sphere(Double.parseDouble("A"));
        Assertions.assertEquals(0, sphere.getVolume(), 0.01);
    }
}

class ValidateTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    void testCheckInputIntLimitValid() {
        System.setIn(new ByteArrayInputStream("5\n".getBytes()));
        int result = Validate.checkInputIntLimit(0, 10);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testCheckInputIntLimitInvalidLessThanMin() {
        System.setIn(new ByteArrayInputStream("-1\n".getBytes()));
        Validate.checkInputIntLimit(0, 10);
        Assertions.assertEquals("Please input number in range [0, 10]\nEnter again:", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCheckInputIntLimitInvalidMoreThanMax() {
        System.setIn(new ByteArrayInputStream("11\n".getBytes()));
        Validate.checkInputIntLimit(0, 10);
        Assertions.assertEquals("Please input number in range [0, 10]\nEnter again:", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCheckInputBinaryValid() {
        System.setIn(new ByteArrayInputStream("1010\n".getBytes()));
        String result = Validate.checkInputBinary();
        Assertions.assertEquals("1010", result);
    }

    @Test
    void testCheckInputBinaryInvalid() {
        System.setIn(new ByteArrayInputStream("120\n".getBytes()));
        Validate.checkInputBinary();
        Assertions.assertEquals("Must be enter 0 or 1\nEnter again: ", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCheckInputDecimalValid() {
        System.setIn(new ByteArrayInputStream("123\n".getBytes()));
        String result = Validate.checkInputDecimal();
        Assertions.assertEquals("123", result);
    }

    @Test
    void testCheckInputDecimalInvalid() {
        System.setIn(new ByteArrayInputStream("12a\n".getBytes()));
        Validate.checkInputDecimal();
        Assertions.assertEquals("Must be enter 0-9\nEnter again: ", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCheckInputHexadecimalValid() {
        System.setIn(new ByteArrayInputStream("ABCD\n".getBytes()));
        String result = Validate.checkInputHexaDecimal();
        Assertions.assertEquals("ABCD", result);
    }

    @Test
    void testCheckInputHexadecimalInvalid() {
        System.setIn(new ByteArrayInputStream("ABCG\n".getBytes()));
        Validate.checkInputHexaDecimal();
        Assertions.assertEquals("Must be enter 0-9 A-F\nEnter again: ", outputStreamCaptor.toString().trim());
    }
}
