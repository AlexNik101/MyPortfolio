package convertgradus;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        ConverterGr converterGr = new ConverterGr();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градусы цельсия ");
        double gradus = scanner.nextInt();
       double gradusF = converterGr.convertFaringate(gradus);
       double gradusC = converterGr.convertCalvine(gradus);

        System.out.println(gradusF + " - Градусов по фарингейту");
        System.out.println(gradusC + " - Градусов по Кальвину");


    }


}
