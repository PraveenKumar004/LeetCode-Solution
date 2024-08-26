public class ReverseInteger {
    static public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;
    }
    public static void main(String[] args) {

        int number = -987654;
        System.out.println(reverse(number));
        System.out.println(Integer.MAX_VALUE);
    }
}