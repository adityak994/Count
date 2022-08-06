import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String args[]) {
        List<String> strList = Arrays.asList("ace", "", "luffy", "eren", "jk");
        long num = strList.stream()
                .filter(x -> x.length() > 3)
                .count();
        System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);
    }
}
