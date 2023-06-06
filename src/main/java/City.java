import java.util.List;

public class City extends Polygon{
    public final Point cityCenter;
    private String cityName;
    private Boolean isPortCity(){
        return true;
    }
    public City(double wallLength, Point cityCenter, String cityName) {
        super(List.of(new Point[]{
                new Point(cityCenter.x, cityCenter.y + wallLength),
                new Point(cityCenter.x + wallLength, cityCenter.y),
                new Point(cityCenter.x, cityCenter.y - wallLength),
                new Point(cityCenter.x - wallLength, cityCenter.y + wallLength)
        }));
        this.cityCenter = cityCenter;
        this.cityName = cityName;
    }
    public String getCityName() {
        return cityName;
    }







}
