import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class DivideChocolate {
    public static void main(String[] args) {
        List<int[]> inputs = new ArrayList<>();
        inputs.add(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        inputs.add(new int[] { 5, 6, 7, 8, 9, 1, 2, 3, 4 });
        inputs.add(new int[] { 1, 2, 2, 1, 2, 2, 1, 2, 2 });

        List<Integer> friends = new ArrayList<>();
        friends.addAll(List.of(5, 8, 2));

        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(maximizeSweetness(inputs.get(i), friends.get(i)));
            // Outputs: 6, 1, 5
        }
    }

    public static int maximizeSweetness(int[] sweetness, int k) {
        int low = 1;
        int high = Arrays.stream(sweetness).sum() / (k + 1);
        int best = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isDivisionPossible(sweetness, mid, k)) {
                best = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return best;
    }

    public static boolean isDivisionPossible(int[] sweetness, int mid, int k) {
        int sum = 0, chunks = 0;

        for (int v : sweetness) {
            sum += v;
            if (sum >= mid) {
                sum = 0;
                chunks++;
            }
        }

        return chunks >= k + 1;
    }
}
