package cbr;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DownloadWeb {
    //// Скачиваем веб страницу !!!!
    public String downloadWebPage (String url) throws IOException {
        StringBuilder result = new StringBuilder() ;
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try(InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            while ((line = br.readLine()) != null){
                result.append(line);
            }
        }
        return result.toString();
    }

////записываем строку в XML фаил !!!
    public void WriteToFile (String f){
        Path path = Paths.get("PRS.xml");
        //byte[] b = f.getBytes();
        try {
            Files.writeString(path, f);
        }catch (IOException e){

        }
    }
}
