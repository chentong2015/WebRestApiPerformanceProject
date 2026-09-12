import java.net.*;

public class DemoURL {

    // URL必须是绝对的路径，确定能够定位和访问到资源
    public static void main(String[] args) {
        String URL = "http://www.example.com/test<>";
        String encoderURL = URLEncoder.encode(URL, "UTF-8");
        String decoderURL = URLDecoder.decode(URL, "UTF-8");

        URI uri = new URI("http://www.test.com");
        URL url = uri.toURL();
        URI uriNew = url.toURI();
    }
}
