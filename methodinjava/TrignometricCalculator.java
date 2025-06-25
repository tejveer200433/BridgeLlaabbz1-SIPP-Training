package methodinjava;
class TrignometricCalculator {

    public double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);

        double sinValue = Math.sin(angleRadians);
        double cosValue = Math.cos(angleRadians);
        double tanValue = Math.tan(angleRadians);

        return new double[]{sinValue, cosValue, tanValue};
    }

    public static void main(String[] args) {
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        double angle1 = 0;
        double[] results1 = calculator.calculateTrigonometricFunctions(angle1);
        System.out.println("For angle " + angle1 + " degrees:");
        System.out.println("Sine: " + String.format("%.4f", results1[0]));
        System.out.println("Cosine: " + String.format("%.4f", results1[1]));
        System.out.println("Tangent: " + String.format("%.4f", results1[2]));
        System.out.println();

        double angle2 = 30;
        double[] results2 = calculator.calculateTrigonometricFunctions(angle2);
        System.out.println("For angle " + angle2 + " degrees:");
        System.out.println("Sine: " + String.format("%.4f", results2[0]));
        System.out.println("Cosine: " + String.format("%.4f", results2[1]));
        System.out.println("Tangent: " + String.format("%.4f", results2[2]));
        System.out.println();

        double angle3 = 90;
        double[] results3 = calculator.calculateTrigonometricFunctions(angle3);
        System.out.println("For angle " + angle3 + " degrees:");
        System.out.println("Sine: " + String.format("%.4f", results3[0]));
        System.out.println("Cosine: " + String.format("%.4f", results3[1]));
        System.out.println("Tangent: " + (Double.isInfinite(results3[2]) ? "Undefined" : String.format("%.4f", results3[2])));
        System.out.println();

        double angle4 = 45;
        double[] results4 = calculator.calculateTrigonometricFunctions(angle4);
        System.out.println("For angle " + angle4 + " degrees:");
        System.out.println("Sine: " + String.format("%.4f", results4[0]));
        System.out.println("Cosine: " + String.format("%.4f", results4[1]));
        System.out.println("Tangent: " + String.format("%.4f", results4[2]));
        System.out.println();
    }
}
