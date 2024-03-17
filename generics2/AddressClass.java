import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class AddressClass {
    public static void main(String[] args) {
        TreeMap<String, Address> tm = new TreeMap<>();
        tm.put("Saurav", new Address("B32", "Rairangpur", "Bahalda"));
        tm.put("Som", new Address("B31", "Kucheibudi", "Baripada"));

       
        // Iterator<String> it = tm.keySet().iterator();
        // while(it.hasNext()) {
        //     String name = it.next();
        //     Address ad = tm.get(name);
        //     System.out.println("Name = " + name + "," + " Address = " + ad);
        // }
        Set<String> st = tm.keySet();
        // System.out.println(st);

        for(String k : st) {
            System.out.println(k + " " + tm.get(k));
        }
    }
}

class Address {
    String plotNo;
    String at;
    String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Plot.No: " + plotNo + "," + " at: " + at + "," + " post: " + post;
    }
}
