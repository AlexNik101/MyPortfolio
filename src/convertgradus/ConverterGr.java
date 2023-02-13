package convertgradus;

public class ConverterGr {
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
