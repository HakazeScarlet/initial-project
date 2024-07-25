package hackerrank;

import java.util.Scanner;

public class IpValidator {

    private static final String IP_PATTERN_VALUE = "(0?[0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
    private static final String IP_PATTERN = "^" + IP_PATTERN_VALUE + "\\."
        + IP_PATTERN_VALUE + "\\."
        + IP_PATTERN_VALUE + "\\."
        + IP_PATTERN_VALUE + "$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            if (ip.matches(IP_PATTERN)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}