import java.util.List;
import java.util.ArrayList;
public class CountMatches {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone","blue","pixel"));
        items.add(List.of("computer","silver","phone"));
        items.add(List.of("phone","gold","iphone"));
        String ruleKey="type";
        String ruleValue="phone";
        System.out.println(Matches(items,ruleKey,ruleValue));
    }
    public static int Matches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int j = 0;
        if (ruleKey == "type") {
            j = 0;
        } else if (ruleKey == "color") {
            j = 1;
        } else if (ruleKey == "name") {
            j = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(j) == ruleValue) {
                count++;
            }
        }
        return count;
    }
}

