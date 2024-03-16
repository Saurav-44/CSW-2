import java.util.ArrayList;
import java.util.Collections;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> cr = new ArrayList<>();
        cr.add(new Car(2013, "Creta", 10));
        cr.add(new Car(2020, "MG", 13));
        cr.add(new Car(2018, "Kia", 20));
        cr.add(new Car(2017, "Audi", 45));
        cr.add(new Car(2015, "BMW", 55));

        Collections.sort(cr);

        for(int i = 0; i < cr.size(); i++) {
            System.out.println(cr.get(i) + " ");
        }
    }
}

class Car implements Comparable<Car> {
    private int ModalNo;
    private String name;
    private int stock;

    public Car(int ModalNo, String name, int stock) {
        this.ModalNo = ModalNo;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public int compareTo(Car cr) {
        return Integer.compare(this.stock, cr.stock);
    }

    @Override 
        public String toString() {
            return "Modal No = " + ModalNo + "   Name = " + name + "    Stock = " + stock;
        }
    
}
