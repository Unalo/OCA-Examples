package interfacesExample;

public class Dog implements Animals, Animals2 {
    public static void main(String[] args) {
        new Dog().go();
    }
    void go() {
        System.out.println(Animals2.names("unalo"));
    }
}
