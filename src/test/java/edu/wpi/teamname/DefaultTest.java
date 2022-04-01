/*-------------------------*/
/* DO NOT DELETE THIS TEST */
/*-------------------------*/

package edu.wpi.teamname;

import org.junit.Test;

// import org.junit.jupiter.api.Test; (JUnit 5 equivalent)

public class DefaultTest {

  @Test
  public void testRectanglePerimeter() {
    Rectangle rect = new Rectangle(10, 20);
    assert (rect.getPerimeter() == 60.0);
  }

  @Test
  public void testRectanglePerimeterZero() {
    Rectangle rect = new Rectangle(10, 0);
    assert (rect.getPerimeter() == 20.0);
  }

  @Test
  public void testRectangleArea() {
    Rectangle rect = new Rectangle(10, 20);
    assert (rect.getPerimeter() == 200.0);
  }

  @Test
  public void testRectangleAreaZero() {
    Rectangle rect = new Rectangle(10, 0);
    assert (rect.getPerimeter() == 0.0);
  }
}
