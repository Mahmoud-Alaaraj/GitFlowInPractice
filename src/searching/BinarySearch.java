package searching;

import sorting.ISortAlgorithm;
import sorting.SelectionSort;

import java.util.List;

public class BinarySearch implements ISearchAlgorithm{
    @Override
    public Boolean search(List<Integer> array, Integer target) {
        boolean result = false;
        ISortAlgorithm sortAlgorithm = new SelectionSort();
        List<Integer> sortedArray = sortAlgorithm.sort(array);
        int left = 0, right = array.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedArray.get(mid).equals(target)) {
                result = true;
            }
            else if (sortedArray.get(mid) > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }
}
