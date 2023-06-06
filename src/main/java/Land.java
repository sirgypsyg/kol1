import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Land extends Polygon{

    private List<City> cities = new ArrayList<>();

    public Land(List<Point> points) {
        super(points);
    }

    public void addCity(City city) {
        if (inside(city.cityCenter)) {
            cities.add(city);
        } else {
            throw new RuntimeException("City " + city.getCityName() + " cannot be added because its center is not on land.");
        }
    }

    public List<City> getCities() {
        return cities;
    }
}
