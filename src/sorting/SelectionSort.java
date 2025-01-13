package sorting;

import java.util.List;

public class SelectionSort implements ISortAlgorithm{

    @Override
    public List<Long> sort(List<Long> array) {
        int n = array.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
                }
            }
            Long temp = array.get(minIndex);
            array.set(minIndex, array.get(i));
            array.set(i, temp);
        }
        return array;
    }
}
