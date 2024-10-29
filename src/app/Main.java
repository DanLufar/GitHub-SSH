package app;

public class Main {
    private static final double CONVER_km = 1.6;

    public static void main(String[] args) {
        System.out.println("Distance from Odesa to Kyiv km.");
        double ml = 295;
        double mile = convMileToKm(ml);
        System.out.println("Distance " + mile + " km.");

    }

    private static double convMileToKm(double ml) {
        return ml * CONVER_km;
    }

}
