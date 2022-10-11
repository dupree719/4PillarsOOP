package comparators;

import java.util.Comparator;

public class ReverseAZComparator implements Comparator<String> {
    public int compare(String o1, String o2) {

        return -o1.compareTo(o2); //compareTo method by itself = natural order (A-Z). Put a negative sign at the beginning to reverse the order (Z-A)
    }


}
