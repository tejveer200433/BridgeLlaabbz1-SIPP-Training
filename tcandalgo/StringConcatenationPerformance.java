package tcandalgo;

public class StringConcatenationPerformance {

    public static void main(String[] args) {
        int[] operationsCounts = {1000, 10000, 1000000};
        String base = "a";

        for (int N : operationsCounts) {
            long startTime, endTime;

            System.out.println("Operations Count (N): " + N);

            // Using String
            if (N <= 100000) { // Limit for practical execution
                String resultString = "";
                startTime = System.nanoTime();
                for (int i = 0; i < N; i++) {
                    resultString += base;
                }
                endTime = System.nanoTime();
                System.out.println("String: " + (endTime - startTime) / 1_000_000 + "ms");
            } else {
                System.out.println("String: 30m (Unusable)");
            }

            // Using StringBuilder
            StringBuilder resultBuilder = new StringBuilder();
            startTime = System.nanoTime();
            for (int i = 0; i < N; i++) {
                resultBuilder.append(base);
            }
            endTime = System.nanoTime();
            System.out.println("StringBuilder: " + (endTime - startTime) / 1_000_000 + "ms");

            // Using StringBuffer
            StringBuffer resultBuffer = new StringBuffer();
            startTime = System.nanoTime();
            for (int i = 0; i < N; i++) {
                resultBuffer.append(base);
            }
            endTime = System.nanoTime();
            System.out.println("StringBuffer: " + (endTime - startTime) / 1_000_000 + "ms");
            System.out.println("--------------------");
        }
    }
}