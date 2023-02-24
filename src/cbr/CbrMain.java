package cbr;
import java.io.IOException;
import java.util.Scanner;
public class CbrMain  {
    public static void main(String[] args) throws IOException {
        DownloadWeb downloadWeb = new DownloadWeb();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату !");
        String date = scanner.nextLine();
        String result = downloadWeb.downloadWebPage("http://www.cbr.ru/scripts/XML_daily.asp?date_req=02/03/2002");
        downloadWeb.WriteToFile(result);
        System.out.println(result);
    }


}
