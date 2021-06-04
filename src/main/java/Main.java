import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    private final static String yandexKey = "bb26f92d-618f-4ec8-a338-b8bd5aadc5ba";
    private final static String yandexApiKeyHeaderName = "X-Yandex-API-Key";
    private final static String lat = "59.939099";
    private final static String lon = "30.315877";

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("api.weather.yandex.ru")
                .addPathSegment("v2")
                .addPathSegment("forecast")
                .addQueryParameter("lat", lat)
                .addQueryParameter("lon", lon)
                .addQueryParameter("limit", "5")
                .addQueryParameter("lang", "ru_RU")
                .addQueryParameter("extra", "false")
                .addQueryParameter("hours", "false")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .addHeader(yandexApiKeyHeaderName, yandexKey)
                .build();
        Response response = client.newCall(request).execute();

        if(response.code() == 200) {

            System.out.println(response.body().string());

            }

        else {
            System.out.println("Что-то пошло не так... " + response.code());
        }

    }
}


