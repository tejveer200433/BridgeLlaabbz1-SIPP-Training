package methodinjava;
public class UnitConverter {

    private static final double YARDS_TO_FEET_FACTOR = 3.0;
    private static final double FEET_TO_YARDS_FACTOR = 0.333333;
    private static final double METERS_TO_INCHES_FACTOR = 39.3701;
    private static final double INCHES_TO_METERS_FACTOR = 0.0254;
    private static final double INCHES_TO_CM_FACTOR = 2.54;

    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET_FACTOR;
    }

    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS_FACTOR;
    }

    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES_FACTOR;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS_FACTOR;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * INCHES_TO_CM_FACTOR;
    }

    public static void main(String[] args) {
        double yards = 10.0;
        double feetResult = UnitConverter.convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feetResult + " feet.");

        double feet = 30.0;
        double yardsResult = UnitConverter.convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yardsResult + " yards.");

        double meters = 2.5;
        double inchesResult = UnitConverter.convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inchesResult + " inches.");

        double inches = 100.0;
        double metersResult = UnitConverter.convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + metersResult + " meters.");

        double inchesCm = 5.0;
        double cmResult = UnitConverter.convertInchesToCentimeters(inchesCm);
        System.out.println(inchesCm + " inches is equal to " + cmResult + " centimeters.");
    }
}
