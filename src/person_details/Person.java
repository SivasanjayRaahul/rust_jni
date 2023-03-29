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

    private static native String getName(Person person);

    public static void main(String[] args) {
        Person person = new Person(1, "SSR");
        Person.getName(person);
    }

}
