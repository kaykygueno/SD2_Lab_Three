package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ShapeTest {

    private static final double EPS = 0.1;

    // Test for Circle class
    @Test
    void testCircle() {
        Circle c = new Circle("C1", 2.0);
        assertEquals(12.5663, c.area(), EPS, "Wrong area for circle");
        assertEquals(12.5663, c.perimeter(), EPS, "Wrong perimeter for circle");
        assertEquals("C1 (Circle) radius=2.0000", c.toString());
    }
    
    // Test for Rhombus class
    @Test
    void testRhombus() {
        Rhombus r = new Rhombus("R1", 6.0, 8.0);
        assertEquals(24.0, r.area(), EPS);
        assertEquals(20.0, r.perimeter(), EPS);
        assertEquals("R1 (Rhombus) d1=6.0000 d2=8.0000", r.toString());
    }
    
    // Test for RightAngledTriangle class
    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle t = new RightAngledTriangle("T1", 3.0, 4.0);
        assertEquals(6.0, t.area(), EPS);
        assertEquals(12.0, t.perimeter(), EPS);
        assertEquals("T1 (RightAngledTriangle) base=3.0000 height=4.0000", t.toString());
    }
    
    // Integration test for a list of shapes
    @Test
    void testIntegrationShapesList() {
        ArrayList<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Circle("C1", 1.0));
        shapes.add(new Circle("C2", 2.0));
        shapes.add(new Rhombus("R1", 10.0, 20.0));
        shapes.add(new Rhombus("R2", 5.0, 5.0));
        shapes.add(new RightAngledTriangle("T1", 10.0, 10.0));
        shapes.add(new RightAngledTriangle("T2", 1.0, 1.0));

        for (Shape s : shapes) {
            assertNotNull(s.getName());
            assertTrue(s.area() > 0, "Area of " + s.getName() + " should be positive");
            assertTrue(s.perimeter() > 0, "Perimeter of " + s.getName() + " should be positive");
            assertTrue(s.toString().contains(s.getName()));
        }
        assertEquals(6, shapes.size(), "There should be 6 shapes in the list");
        
    }
}
