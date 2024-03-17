import java.util.HashMap;

public class SmallestPositive {

    public static int findSmallestpos(int arr[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int ele : arr) { //count ele in the arr
            hm.put(ele, hm.getOrDefault(ele, 0)+1);
        }

        for(int i = 1; i <= 10; i++) {
            if(!hm.containsKey(i)) {
                return i;
            }
        }

        return 11; // if all ele are present then 11 is the smallest one.
    }
    public static void main(String[] args) {
        int arr[] = {4,1,5,6,8,7,2,10,9};
        int res = findSmallestpos(arr);

        System.out.println(res);

    }
}
