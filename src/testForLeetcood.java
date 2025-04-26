//Задача Leetcode 929
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class testForLeetcood {

    /* ["test.email+alex@leetcode.com",
    "test.e.mail+bob.cathy@leetcode.com",
    "testemail+david@lee.tcode.com"] */

    static public void numUniqueEmails(String[] emails) {
        ArrayList<String> localName = new ArrayList<>();
        ArrayList<String> domainName = new ArrayList<>();

        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails[i].length(); j++) {
                if (emails[i].charAt(j) == '+') {
                    break;
                } else {
                    localName.add(String.valueOf(emails[i].charAt(j)));
                }
            }
        }

        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails[i].length(); j++) {
                if (emails[i].charAt(j) == '@') {
                    domainName.add(emails[i].substring(j + 1));
                    break;
                }
            }
        }

        localName = localName.stream()
                .filter(s -> !s.equals("."))
                .collect(Collectors.toCollection(ArrayList::new));

        HashMap<Integer, String> result = new HashMap<>(){};

        System.out.println(localName);
        System.out.println(domainName);
    }
}
