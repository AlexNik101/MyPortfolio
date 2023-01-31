package convertgradus;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градусы ");
        double gradus = scanner.nextInt();
        gradus = convert((int) gradus);
        System.out.println(gradus + " - Градусов по фарингейту");



    }

    public static double convert(int gradus){
        int d = 32;
        double c ;
        c = (gradus * 9/5) + d;

        return c;

    }
}
