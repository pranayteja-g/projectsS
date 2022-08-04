import java.util.ArrayList;  
import java.util.List;

public class IncreasingSubsequence {  
    static List<Integer> LIS(int[] arr) {
        List<List<Integer>> value = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            value.add(new ArrayList<>());
        }

        value.get(0).add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && value.get(i).size() < value.get(j).size() + 1) {
                    value.set(i, new ArrayList<>(value.get(j)));
                }
            }
            value.get(i).add(arr[i]);
        }

        List<Integer> longest = value.get(0);
        for (int i = 0; i < value.size(); i++) {
            if (longest.size() < value.get(i).size()) {
                longest = new ArrayList<>(value.get(i));
            }
        }
        System.out.println("the size of longest increasing subsequence is: "+ longest.size());
        return longest;
    }

    public static void main(String[] args) {
    	int[] arr = {8,1,6,5,10,3,12,98};
        System.out.println(LIS(arr).toString());
    }
}
