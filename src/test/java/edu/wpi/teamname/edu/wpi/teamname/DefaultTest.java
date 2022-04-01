/*-------------------------*/
/* DO NOT DELETE THIS TEST */
/*-------------------------*/

package edu.wpi.teamname;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// import org.junit.jupiter.api.Test; (JUnit 5 equivalent)

public class DefaultTest {

  @Test
  public void testRectanglePerimeter() {
    Rectangle rect = new Rectangle(10, 20);
    Assert.assertTrue(rect.getPerimeter() == 60.0);
  }

  @Test
  public void testRectanglePerimeterZero() {
    Rectangle rect = new Rectangle(10, 0);
    Assert.assertTrue(rect.getPerimeter() == 20.0);
  }

  @Test
  public void testRectangleArea() {
    Rectangle rect = new Rectangle(10, 20);
    Assert.assertTrue(rect.getArea() == 200.0);
  }

  @Test
  public void testRectangleAreaZero() {
    Rectangle rect = new Rectangle(10, 0);
    Assert.assertTrue(rect.getArea() == 0.0);
  }

  @Test
  public void testCirclePerimeterZero() {
    Circle circ = new Circle(0);
    Assert.assertTrue(circ.getPerimeter() == 0);
  }

  @Test
  public void testCirclePerimeter() {
    Circle circ = new Circle(3);
    Assert.assertTrue(circ.getPerimeter() == 2 * 3 * Math.PI);
  }

  @Test
  public void testCircleAreaZero() {
    Circle circ = new Circle(0);
    Assert.assertTrue(circ.getArea() == 0);
  }

  @Test
  public void testCircleArea() {
    Circle circ = new Circle(3);
    Assert.assertTrue(circ.getArea() == 9 * Math.PI);
  }

  FizzBuzz fb;

  @Before
  public void init() {
    fb = new FizzBuzz();
  }

  @Test
  public void testFizzBuzzDivisible3() {
    Assert.assertTrue(fb.answer(6) == "fizz");
  }

  @Test
  public void testFizzBuzzDivisible5() {
    Assert.assertTrue(fb.answer(10) == "buzz");
  }

  @Test
  public void testFizzBuzzDivisible3AND5() {
    Assert.assertTrue(fb.answer(15) == "fizzbuzz");
  }

  @Test
  public void testFizzBuzzDivisibleNone1() {
    Assert.assertTrue(fb.answer(2).equals("2"));
  }

  @Test
  public void testFizzBuzzDivisibleNone2() {
    Assert.assertTrue(fb.answer(11).equals("11"));
  }
}
