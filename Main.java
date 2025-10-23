public class Main {
    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        String output = reverse(input);
        System.out.println(output);
    }

    static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        char[] output = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (Character.isLetter(output[start]) && Character.isLetter(output[end])) {
                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;
                start++;
                end--;
            } else if (!Character.isLetter(output[start])) {
                start++;
            } else {
                end--;
            }
        }
        return new String(output);
    }
}