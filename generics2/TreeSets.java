
import java.util.TreeSet;
import java.util.Scanner;

public class TreeSets {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(2);
        ts.add(1);
        ts.add(5);
        ts.add(3);

        System.out.println(ts);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search = ");
        int num = sc.nextInt();

        if(ts.contains(num)) {
            System.out.println(num + " is present in the set.");
        }
        else {
            System.out.println(num + " is not present in the set.");
        }

        System.out.print("Enter a num to remove = ");
        int remNo = sc.nextInt();

        if(ts.contains(remNo)) {
            ts.remove(remNo);
            System.out.println(remNo + " removed from the set.");
        }
        else {
            System.out.println(remNo + " is not found in the set.");
        }

        System.out.println(ts);
    }
}