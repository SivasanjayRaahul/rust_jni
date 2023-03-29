package multiply;

public class Main {
    private int state;

    public Main(int state) {
        this.state = state;
    }

    static {
        System.loadLibrary("rust_jni");
    }

    public static void main(String[] args) {
        try {
            int arg1 = 5;
            int arg2 = 10;
            int result = new Main(arg1).timesRust(arg2);
            System.out.println(arg1 + "x" + arg2 + " = " + result);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Arguments must be ints");
        }
    }

    public native int timesRust(int input);

}
