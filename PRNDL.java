public class PRNDL {
    public static boolean isReverse(String a, String b) {
        int result = 0;
        if (b.length() != a.length()) {
            return false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(a.length() - i - 1)) {
                    result += 1;
                }
            }
            if (result == a.length()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
