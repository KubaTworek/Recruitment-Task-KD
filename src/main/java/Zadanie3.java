import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Zadanie3 {
    private static final String POSTS_URL = "https://jsonplaceholder.typicode.com/posts";
    private static String streamToString(InputStream inputStream) {
        return new Scanner(inputStream, StandardCharsets.UTF_8).useDelimiter("\\Z").next();
    }

    public static String getPosts() {
        String json = null;
        try {
            URL url = new URL(POSTS_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.connect();
            InputStream inStream = connection.getInputStream();
            json = streamToString(inStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return json;
    }

    public static void main(String[] args) {
        System.out.println(getPosts());
    }
}
