import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheUltimateFunctionsProject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide your query:");
        String query = in.nextLine();
        int target;
        if (query.equals("search")) {
            System.out.println("Provide your target:");
            target = in.nextInt();
        }
        else if (!query.equals("sort")) {
            System.out.println("Invalid query!");
            return;
        }
        System.out.println("Provide your array size:");
        int arraySize = in.nextInt();
        System.out.println("Provide your array:");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            int currentElement = in.nextInt();
            array.add(currentElement);
        }
        if (query.equals("search")) {
            System.out.println("Searching...");
//            search(array, target);
        }
        else {
            System.out.println("Sorting...");
//            sort(array);
        }
    }

}
