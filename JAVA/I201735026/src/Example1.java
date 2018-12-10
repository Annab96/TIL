import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example1 {

    static List<String> solution(String[] a1, String[] a2, String[] a3) {
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(a1));
        list.retainAll(Arrays.asList(a2));
        list.retainAll(Arrays.asList(a3));
        return list;
    }

    static Collection<String> solution2(String[] a1, String[] a2, String[] a3) {
        Set<String> set = new HashSet<String>();
        set.addAll(Arrays.asList(a1));
        set.retainAll(Arrays.asList(a2));
        set.retainAll(Arrays.asList(a3));
        return set;
    }

    public static void main(String[] args) {
        String[] a1 = { "A", "B", "D", "F", "G", "B", "F" };
        String[] a2 = { "B", "C", "F", "H", "I", "B", "F"  };
        String[] a3 = { "B", "F", "G", "H", "I" };

        System.out.println(solution(a1, a2, a3));
        System.out.println(solution2(a1, a2, a3));
    }
}
