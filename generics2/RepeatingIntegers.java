import java.util.HashSet;

public class RepeatingIntegers {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        int arr[] = {32,22,44,32,71,22,21,44};
        int count = 0;

        for(Integer ele : arr) {
            if(!hs.add(ele)) {
                duplicates.add(ele);
                count++;
            }
        }

        System.out.println("Repeating Elements = " + duplicates);
        System.out.println("Count = " + count);
    }
}
