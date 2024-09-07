import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> r = new HashMap<>();
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);

        String s = "LVIII";

        
        int sum = r.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int current = r.get(s.charAt(i));
            int next = r.get(s.charAt(i + 1));

            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
        }

        System.out.println("Integer value of Roman numeral \"" + s + "\" is: " + sum);
    }
}
