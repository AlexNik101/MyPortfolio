package cbr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;



public class CbrMain  {
    public static void main(String[] args) throws IOException {
        DownloadWeb downloadWeb = new DownloadWeb();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату !");
        String date = scanner.nextLine();
        String result = downloadWeb.downloadWebPage("http://www.cbr.ru/scripts/XML_daily.asp?date_req=02/03/2002");


    }

}
