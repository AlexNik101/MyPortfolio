package nasaphoto;

import cbr.DownloadWeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NasaPhotoMain {
    public static void main(String[] args) throws IOException {
        DownloadWeb downloadWeb = new DownloadWeb();
        String result = downloadWeb.downloadWebPage("https//:");

    }


}
