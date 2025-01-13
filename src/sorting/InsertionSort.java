package sorting;

import java.util.List;

public class InsertionSort implements ISortAlgorithm{

    @Override
        
    public List<Long> sort(List<Long> array, Integer lastIndex) {
        int n = lastIndex;
        for (int i = 1; i < n; i++) {
            Long key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j--;
            }
            array.set(j + 1, key);
        }
        return array;
    }
}
