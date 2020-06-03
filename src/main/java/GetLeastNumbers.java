import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            heap.add(arr[i]);
        }
        int[] ans = new int[k];
        for(int i = 0;i<k;i++){
            ans[i] = heap.poll();
        }
        return ans;
    }
    List<Integer> list = new ArrayList<>();
    list.remove();
}
