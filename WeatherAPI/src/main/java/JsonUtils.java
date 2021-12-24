<<<<<<< HEAD
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonUtils {

    public static String parseUrl(URL url) {
        if (url == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }


    public static void parseCurrentWeatherJson(String resultJson) {
        try {
            JSONObject weatherJsonObject = (JSONObject) JSONValue.parseWithException(resultJson);

            System.out.println("Название города: " + weatherJsonObject.get("name"));

            JSONArray weatherArray = (JSONArray) weatherJsonObject.get("weather");

            JSONObject weatherData_2 = (JSONObject) weatherArray.get(0);

            JSONObject weatherData_1 = (JSONObject) weatherJsonObject.get("main");

            System.out.println("Средняя температура: " + weatherData_1.get("temp"));

            System.out.println("Ощущается как: " + weatherData_1.get("feels_like"));

            System.out.println("Влажность: " + weatherData_1.get("humidity"));

            System.out.println("Погода на данный момент: " + weatherData_2.get("main"));

            System.out.println("Более детальное описание погоды: " + weatherData_2.get("description"));

        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }


    public static URL createUrl(String link) {
        try {
            return new URL(link);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
=======
package PACKAGE_NAME;public class JsonUtils {
>>>>>>> bc081d7e7beb0379c915fdf7ef431e2d33cfde50
}
