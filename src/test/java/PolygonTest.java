import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PolygonTest {

    @Test
    void isInside() {
        Polygon polygon = new Polygon(List.of(new Point[]{
                new Point(0, 0.0),
                new Point(10.0, 0.0),
                new Point(10.0, 10.0),
                new Point(0.0, 10.0)}));
        assertEquals(true, polygon.inside(new Point(5,5)));
    }
    @Test
    void isUnder() {
        Polygon polygon = new Polygon(List.of(new Point[]{
                new Point(0, 0.0),
                new Point(10.0, 0.0),
                new Point(10.0, 10.0),
                new Point(0.0, 10.0)}));

        assertEquals(false, polygon.inside(new Point(0,-5)));
    }
    @Test
    void isRight() {
        Polygon polygon = new Polygon(List.of(new Point[]{
                new Point(0, 0.0),
                new Point(-10.0, 0.0),
                new Point(-10.0, 10.0),
                new Point(0.0, 10.0)}));

        assertEquals(false, polygon.inside(new Point(20,5)));
    }
    @Test
    public void testAddCity() {
        Land land = new Land(List.of(new Point[]{
                new Point(0, 0.0),
                new Point(100.0, 0.0),
                new Point(100.0, -100.0),
                new Point(0.0, -100.0)}));
        City city1 = new City(3, new Point(2.0,-2.0), "london");
        City city2 = new City(2, new Point(-161.0,-2.0), "esen");

        // Dodajemy pierwsze miasto do mapy

        assertThrows(RuntimeException.class, () -> {
            land.addCity(city1);
        });
}
}