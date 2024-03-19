package Generics;

public class CarDriver {
    public static void main(String[] args) {
        
        Car c2 = new Car("Ferrari","red",300);
        Car  c1 = new Car("Bugatti","Black",400);

        int ans = c2.compareTo(c1);

        if(ans < 0) {
            System.out.println(c1.getmod() + " has greater speed.");
        }
        else if(ans > 0) {
            System.out.println(c2.getmod() + " has greater speed.");
        }
        else {
            System.out.println("Both have same speed.");
        }
    }
}

class Car implements Comparable<Car> {
     String mod;
     String col;
     int sp;

    public Car(String mod, String col, int sp) {
        this.mod= mod;
        this.col = col;
        this.sp = sp;
    }

    public String getmod() {
        return mod;
    } 

    public String getcol() {
        return col;
    }

    public int getsp() {
        return sp;
    }

    public int compareTo(Car o) {
        return Integer.compare(this.sp, o.sp);
    }
    

}
