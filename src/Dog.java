public class Dog {
    String name;
    int size;

    void bark() {
        if (size > 60) {
            System.out.println(name + " says" + " Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
