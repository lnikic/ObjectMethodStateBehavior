public class Main {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.name = "Frodo";
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark(3);
        System.out.println(one.sizeOfDod());
        two.bark(1);
        three.bark(2);
        System.out.println(one.sizeOfAllDogs(one.size, two.size, three.size));
        System.out.println(one.sizeSmallerBy5(one.size));
        System.out.println(one.sizeOfDod());
        int x = 10;
        System.out.println("x from method " + one.sizeSmallerBy5(x));
        System.out.println("x is " + x);

    }
}