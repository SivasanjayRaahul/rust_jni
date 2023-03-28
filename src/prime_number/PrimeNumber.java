package prime_number;

class PrimeNumber {
    private static native int getCount(int range);

    static {
        System.loadLibrary("rust_jni");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int count = PrimeNumber.getCount(1000000);
        System.out.println(count);
        long endTime = System.currentTimeMillis();
        int timeTaken = (int) ((endTime - startTime) / 1000);
        System.out.println(timeTaken);
    }
}