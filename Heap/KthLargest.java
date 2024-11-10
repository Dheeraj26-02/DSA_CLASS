import java.util.*;

public class KthLargest {
   static PriorityQueue<Integer> pq = new PriorityQueue<>();
   static int k = 5;
   public static void add(int num) {
      if (pq.size() < k || num > pq.peek()) {
         pq.offer(num);
         if (pq.size() > k) {
            pq.poll();
         }
      }
   }

   public static void main(String[] var0) {
      int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };

      for (int i = 0; i < arr.length; ++i) {
         add(arr[i]);
      }
      System.out.println(pq.peek());
   }
}
