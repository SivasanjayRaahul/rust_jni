package person_details;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static {
        System.loadLibrary("rust_jni");
    }

    public static native String getName();

    public static void main(String[] args) {
        Person person = new Person(1, "SSR");
        String name = person.getName();
        System.out.println("Name : " + name);
    }

}
