package convertgradus;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градусы цельсия ");
        double gradus = scanner.nextInt();
       double gradusF = convertFaringate(gradus);
       double gradusC = convertCalvine(gradus);

        System.out.println(gradusF + " - Градусов по фарингейту");
        System.out.println(gradusC + " - Градусов по Кальвину");




    }
// коверт цельсия в фарингейты
    public static double convertFaringate(double gradus){
        int d = 32;
        double c ;
        c = (gradus * 9/5) + d;

        return c;

    }

    // коверт цельсия в кельвины
    public static double convertCalvine(double gradus){
        double d = 273.15;
        double c = gradus + d;
        return c;
    }

}
