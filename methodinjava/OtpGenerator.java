package methodinjava;

import java.util.Random;
import java.util.Arrays;

public class OtpGenerator {

    public static int generateSixDigitOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return otp;
    }

    public static boolean isOtpUnique(int[] otpArray, int currentCount, int newOtp) {
        for (int i = 0; i < currentCount; i++) {
            if (otpArray[i] == newOtp) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numberOfOtpsToGenerate = 10;
        int[] generatedOtps = new int[numberOfOtpsToGenerate];
        int count = 0;

        System.out.println("Generating " + numberOfOtpsToGenerate + " unique 6-digit OTPs:");

        while (count < numberOfOtpsToGenerate) {
            int otp = generateSixDigitOTP();
            if (isOtpUnique(generatedOtps, count, otp)) {
                generatedOtps[count] = otp;
                count++;
            }
        }

        for (int i = 0; i < generatedOtps.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + generatedOtps[i]);
        }
    }
}