import java.util.HashMap;
import java.util.Map;

public class Main {
    private final static String LOREMIPSUM = "" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
            "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure" +
            " dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
            "mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < LOREMIPSUM.length(); i++) {
            char character = LOREMIPSUM.charAt(i);
            if (!map.containsKey(character)) {
                map.put(character, 1);
            } else {
                int count = map.remove(character) + 1;
                map.put(character, count);
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() > max) {
                max = kv.getValue();
            }
            if (kv.getValue() < min) {
                min = kv.getValue();
            }
        }
        System.out.println(map);
        System.out.println("Minimum number of characters equals " + min);
        System.out.println("Maximum number of characters equals " + max);
    }
}
