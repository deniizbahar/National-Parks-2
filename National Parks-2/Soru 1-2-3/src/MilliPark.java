import java.util.ArrayList;
import java.util.List;


public class MilliPark implements Comparable<MilliPark> {
    private String nationalparkName;
    private String cityName;
    private int year;
    private int area;
    private String text;
    private List<String> list;


    public MilliPark(String nationalparkName, String cityName, int year, int area, String text) {
        this.nationalparkName = nationalparkName;
        this.cityName = cityName;
        this.year = year;
        this.area = area;
        this.text = text;

    }


    public void setYear(int year) {
        this.year = year;
    }

    public String getNationalparkName() {
        return nationalparkName;
    }

    public String getCityName() {
        return cityName;
    }

    public int getYear() {
        return year;
    }

    public int getArea() {
        return area;
    }

    public String getText() {
        return text;
    }

    public List<String> getList() {
        return list;
    }

    public int compareTo(MilliPark a) {
        return Integer.compare(a.area, this.area);
    }
}

