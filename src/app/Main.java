package app;

public class Main {
    private static final double CONVER_km = 1.6;

    public static void main(String[] args) {
        System.out.println("Distance from Odesa to Kyiv");
        double ml = 295;
        double km = 472;
        double mile = convMileToKm(ml);
        double klm = convKmToMile(km);
        System.out.println("Distance " + mile + " ml and " + klm + " km .");

    }

    private static double convMileToKm(double ml) {
        return ml * CONVER_km;
    }

    private static double convKmToMile(double km){
        return km / CONVER_km;
    }

}
