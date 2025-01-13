package searching;

import java.util.List;

public class LinearSearch implements ISearchAlgorithm{
    @Override
    public Boolean search(List<Integer> array, Integer target) {
        boolean result = false;
        for (Integer integer : array) {
            if (integer.equals(target)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
