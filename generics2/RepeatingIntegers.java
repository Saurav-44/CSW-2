import java.util.HashSet;
public class RepeatingIntegers {

    public static void printRepeatingEle(int arr[], int count) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int ele : arr) {
            if(!hs.add(ele)) {
                duplicates.add(ele);
            }
        }

        System.out.println("Repeating Elements = " + duplicates);
        System.out.println("Count = " + duplicates.size());
    }
    public static void main(String[] args) {
       int arr[] = {31,53,67,53,84,35,67};
       printRepeatingEle(arr, 0);
    }
}
