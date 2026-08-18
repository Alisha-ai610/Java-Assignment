import java.util.ArrayList;
import java.util.List;

public class DescendingSort {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Alisha");
        names.add("Ayush");
        names.add("Bismeet");
        names.add("Kovida");
        names.add("Sania");
        names.add("Bhavya");

        // Sorting in descending order using lambda expression
        names.sort((a, b) -> b.compareTo(a));

        System.out.println("Strings in descending order:");
        System.out.println(names);
    }
}
