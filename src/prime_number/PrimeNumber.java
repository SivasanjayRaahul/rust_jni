package prime_number;
class PrimeNumber {
    // This declares that the static `hello` method will be provided
    // a native library.
    private static native int getCount(int range);

    static {
        // This actually loads the shared object that we'll be creating.
        // The actual location of the .so or .dll may differ based on your
        // platform.
        System.loadLibrary("rust_jni");
    }

    // The rest is just regular ol' Java!
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int count = PrimeNumber.getCount(1000000);
        System.out.println(count);
        long endTime = System.currentTimeMillis();
        int timeTaken = (int) ((endTime - startTime)/1000);
        System.out.println(timeTaken);
    }
}