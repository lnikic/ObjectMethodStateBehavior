public class Main {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.setName("Frodo");
        one.setSize(70);
        Dog two = new Dog();
        two.setSize(8);
        Dog three = new Dog();
        three.setSize(35);

        one.bark(3);
        System.out.println(one.sizeOfDod());
        two.bark(1);
        three.bark(2);
        System.out.println(one.sizeOfAllDogs(one.getSize(), two.getSize(), three.getSize()));
        System.out.println(one.sizeSmallerBy5(one.getSize()));
        System.out.println(one.sizeOfDod());
        int x = 10;
        System.out.println("x from method " + one.sizeSmallerBy5(x));
        System.out.println("x is " + x);

        Dog[] pets;
        pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[0].setSize(30);
        int d = pets[0].getSize();
        pets[1].setSize(5);
        System.out.println(d);
    }
}