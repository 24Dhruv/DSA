 public class CharacterCount {
    public static void main(String[] args) {
        String str = "aaabbcccds";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.println(str.charAt(i) + "" + count);
                count = 1; // Reset count for the next character
            }
        }
    }
}
