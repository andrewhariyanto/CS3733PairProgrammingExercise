/*-------------------------*/
/* DO NOT DELETE THIS TEST */
/*-------------------------*/

package edu.wpi.teamname;

import org.junit.Assert;
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
}
