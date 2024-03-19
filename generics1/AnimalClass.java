package Generics;

public class AnimalClass {
    public static void main(String[] args) {
        Animal a1 = new Animal("Elephant", "Grey", "Pet");
        Animal a2 = new Animal("Dog", "Brown", "Pet");
        Animal a3 = new Animal("Jaguar", "Golden", "Wild");

        System.out.println("Elephant Hashcode = " + a1.hashCode());
        System.out.println("Dog Hashcode =  " + a2.hashCode());
        System.out.println("Jaguar Hashcode =  " + a3.hashCode());
    }
}

class Animal {
    String n;
    String col;
    String type;

    public Animal(String n, String col, String type) {
        this.n = n;
        this.col = col;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return n.hashCode() + col.hashCode() + type.hashCode();
    }
}
