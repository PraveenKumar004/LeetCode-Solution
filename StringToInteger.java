public class StringToInteger {

    public static int myAtoi(String s) {

        if (s.length() == 0 || s.length() > 200) {
            return 0;
        }

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        s = s.toLowerCase();
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }
        String sub = s;
        if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || s.charAt(0) == '.') {
            return 0;
        }

        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || s.charAt(i) == '-' || s.charAt(i) == '+'
                    || s.charAt(i) == '.' || s.charAt(i) == ' ') {
                sub = s.substring(0, i);
                break;
            }
        }
        int ans;
        try {
            ans = Integer.parseInt(sub);
        } catch (NumberFormatException e) {
            try{
                if ((sub.charAt(0) == '-') && (sub.charAt(1) != '-' || sub.charAt(1) != '+')) {
                    return minValue;
                } else if ((sub.charAt(1) != '-' || sub.charAt(1) != '+')) {
                    return maxValue;
                }
                else{
                    return 0;
                }
            }
            catch(StringIndexOutOfBoundsException er){
                return 0;
            }
            
        }
        return ans;

    }

    public static void main(String[] args) {
        String i = "+-42";
        char a ='2';
        int d = a - '0';
        System.out.println(d);
        System.out.println(myAtoi(i));

    }
}
