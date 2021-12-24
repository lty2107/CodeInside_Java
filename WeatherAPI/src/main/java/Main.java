<<<<<<< HEAD
import java.net.URL;

public class Main {

    public static final String WEATHER_URL =
            "https://api.openweathermap.org/data/2.5/weather?q=Moscow" +
                    "&units=metric&appid=241de9349721df959d8800c12ca4f1f3";

    public static void main(String[] args) {

        URL url = JsonUtils.createUrl(WEATHER_URL);

        String resultJson = JsonUtils.parseUrl(url);

        JsonUtils.parseCurrentWeatherJson(resultJson);

    }

}
=======
package PACKAGE_NAME;public class Main {
}
>>>>>>> bc081d7e7beb0379c915fdf7ef431e2d33cfde50
