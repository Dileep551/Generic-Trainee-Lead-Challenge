// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5360")

        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi", "47.24, 656.21", "72.01, 54.12",
                        "87.98, 54.22", "542.12, 321.12"),
                new River("Missouri", "44.24, 65.21", "92.01, 54.12",
                        "99.98, 54.22", "52.12, 31.12")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.renderLayer();

    }
}