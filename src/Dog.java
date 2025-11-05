public class Dog {
    private String name;
    private int size;

     void bark(int a) {
       while (a > 0) {
           if (size > 60) {
               System.out.println(name + " says" + " Wooof! Wooof!");
           } else if (size > 14) {
               System.out.println("Ruff! Ruff!");
           } else {
               System.out.println("Yip! Yip!");
           }
           a = a - 1;
       }
    }
    int sizeOfDod () {
        return size;
    }
    int sizeOfAllDogs(int x, int z, int c) {
        return x + z + c;
    }
    int sizeSmallerBy5 (int x) {
        return x - 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
